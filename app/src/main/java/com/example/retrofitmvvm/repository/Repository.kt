package com.example.retrofitmvvm.repository

import com.example.retrofitmvvm.api.RetrofitInstance
import com.example.retrofitmvvm.model.Post

class Repository {

    suspend fun getPost(): Post{
        return RetrofitInstance.api.getPost()
    }
}