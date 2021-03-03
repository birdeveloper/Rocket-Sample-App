package com.gorkemkara.sampleproject.ui.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import com.gorkemkara.sampleproject.R
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.activity_main.*

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private val mainViewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapter = RocketsAdapter()
        recyclerRocket.adapter = adapter

        mainViewModel.apply {

            rocketsLiveData.observe(this@MainActivity, Observer {
                if (it.isNullOrEmpty()) {

                } else {
                    adapter.setItems(it)
                }
            })
        }
    }
}