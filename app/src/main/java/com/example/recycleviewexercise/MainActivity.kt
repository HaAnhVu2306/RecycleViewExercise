package com.example.recycleviewexercise

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recycleviewexercise.ui.theme.RecycleViewExerciseTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.acitivity_main);


        val itemList = arrayListOf<Item>()
        itemList.add(Item("HAV", "4.5", R.mipmap.ic_launcher_round))
        itemList.add(Item("HAV", "4.5", R.mipmap.ic_launcher_round))
        itemList.add(Item("HAV", "4.5", R.mipmap.ic_launcher_round))
        itemList.add(Item("HAV", "4.5", R.mipmap.ic_launcher_round))
        itemList.add(Item("HAV", "4.5", R.mipmap.ic_launcher_round))
        itemList.add(Item("HAV", "4.5", R.mipmap.ic_launcher_round))
        itemList.add(Item("HAV", "4.5", R.mipmap.ic_launcher_round))

        val recyclerView = findViewById<RecyclerView>(R.id.recycleview);
        recyclerView.adapter = MyAdapter(itemList);
    }
}