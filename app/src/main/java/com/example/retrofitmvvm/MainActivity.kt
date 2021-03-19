package com.example.retrofitmvvm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.retrofitmvvm.repository.Repository
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d("demo", "I'm here")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //val repository = Repository()
        //val viewModelFactory = MainViewModelFactory(repository)
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        viewModel.myResponse.observe(this, Observer { response ->
            Log.d("demo", response.body)
        })
        viewModel.getPost()



    }
}