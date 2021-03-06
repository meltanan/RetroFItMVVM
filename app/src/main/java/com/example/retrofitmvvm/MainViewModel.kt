package com.example.retrofitmvvm

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.retrofitmvvm.api.RetrofitInstance
import com.example.retrofitmvvm.model.Post
import com.example.retrofitmvvm.repository.Repository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import retrofit2.Response

class MainViewModel (private val repository: Repository) : ViewModel() {

    val myResponse: MutableLiveData <Response <Post>> = MutableLiveData()
    fun getPost(){
        viewModelScope.launch {
            withContext(Dispatchers.IO){
                val response = RetrofitInstance.api.getPost();
                myResponse.postValue(response)
            }

        }

    }

}