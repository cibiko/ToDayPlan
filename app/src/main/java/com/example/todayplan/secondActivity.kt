package com.example.todayplan

import android.content.Intent
import android.content.ServiceConnection
import android.content.res.Configuration
import android.os.Bundle
import android.os.PersistableBundle
import android.util.SparseBooleanArray
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import java.util.concurrent.Executor

class secondActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_activity_main)
        val add = findViewById<Button>(R.id.add)
        val delete = findViewById<Button>(R.id.delete)
        val clear = findViewById<Button>(R.id.clear)
        val listView = findViewById<ListView>(R.id.listView)
        val editText = findViewById<EditText>(R.id.editText)


        var itemlist = arrayListOf<String>()
        var adapter =
            ArrayAdapter<String>(this, android.R.layout.simple_list_item_multiple_choice, itemlist)

        add.setOnClickListener {
            itemlist.add(editText.text.toString())
            listView.adapter = adapter
            adapter.notifyDataSetChanged()
            // This is because every time when you add the item the input      space or the eidt text space will be cleared
            editText.text.clear()

        delete.setOnClickListener {
                val position: SparseBooleanArray = listView.checkedItemPositions
                val count = listView.count
                var item = count - 1
                while (item >= 0) {
                    if (position.get(item)) {
                        adapter.remove(itemlist.get(item))
                    }
                    item--
                }
                position.clear()
                adapter.notifyDataSetChanged()

        clear.setOnClickListener {

                    itemlist.clear()
                    adapter.notifyDataSetChanged()

                }

            }
        }
    }

}



