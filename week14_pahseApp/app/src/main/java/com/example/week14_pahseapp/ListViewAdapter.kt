package com.example.week14_pahseapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class ListViewAdapter(val List: MutableList<ListViewModel>) : BaseAdapter() {
    //문자열 데이터를 받는다고 명시
    override fun getCount(): Int { //item 개수.
        return List.size //list의 사이즈만큼 받아오겠다.
    }

    override fun getItem(position: Int): Any {
        return List[position] //리스트 item 받아와줌
    }

    override fun getItemId(position: Int): Long {
        return position.toLong() //포지션을 넘겨준다.
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        //여기서 아이템 넣어서 리스트뷰에 넣어주는 친구
        var converView = convertView
        if(converView == null){
            converView = LayoutInflater.from(parent?.context).inflate(R.layout.listview_item, parent, false)
        }

        val title = converView!!.findViewById<TextView>(R.id.listviewItem) //아까 listviewItem.xml에 추가시켜둔 아이템
        val content = converView!!.findViewById<TextView>(R.id.listviewItem2) //아까 listviewItem.xml에 추가시켜둔 아이템

        title.text = List[position].title //하나하나 넣어줘라.
        content.text = List[position].content
        //List[0] -> ListViewModel("a", "b") 이런식으로 들어있음


        return converView!!
    }

}