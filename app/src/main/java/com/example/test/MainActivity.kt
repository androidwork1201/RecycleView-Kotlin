package com.example.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.test.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    private var titleList = mutableListOf<String>()
    private var imageList = mutableListOf<Int>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        fakeData()

        binding.recycle.layoutManager = LinearLayoutManager(this)
        binding.recycle.adapter = RecycleViewAdapter(titleList, imageList)
    }

    // fake data
    private fun addToList(
        title: String,
        img: Int
    ) {
        titleList.add(title)
        imageList.add(img)
    }
    private fun fakeData(){
        for (i in 1..20){
            addToList("No. $i", R.drawable.ic_launcher_foreground)
        }
    }
}