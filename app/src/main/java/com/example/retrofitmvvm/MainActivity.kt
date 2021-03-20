package com.example.retrofitmvvm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.retrofitmvvm.repository.Repository
import okhttp3.OkHttpClient

class MainActivity : AppCompatActivity() {
    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//
        Log.d("demo", "I'm here")
        val repository = Repository()
        val viewModelFactory = MainViewModelFactory(repository)
        viewModel = ViewModelProvider(this, viewModelFactory).get(MainViewModel::class.java)
        viewModel.getPost()

            viewModel.myResponse.observe(this, Observer { response ->
                    if (response.isSuccessful)
                    Log.d("demo", response.body()?.title.toString())

            })




    }


}