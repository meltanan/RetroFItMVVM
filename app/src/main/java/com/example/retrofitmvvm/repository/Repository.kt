package com.example.retrofitmvvm.repository

import com.example.retrofitmvvm.api.RetrofitInstance
import com.example.retrofitmvvm.model.Post
import retrofit2.Response

class Repository {

    suspend fun getPost(): Response<Post>{
        return RetrofitInstance.api.getPost()
    }
}