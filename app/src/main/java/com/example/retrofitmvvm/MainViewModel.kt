package com.example.retrofitmvvm

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.retrofitmvvm.model.Post
import com.example.retrofitmvvm.repository.Repository
import kotlinx.coroutines.launch

class MainViewModel (private val repository: Repository) : ViewModel() {

    val myResponse: MutableLiveData<Post> = MutableLiveData()
    fun getPost(){
        viewModelScope.launch {
            val response = repository.getPost()
            myResponse.value = response
        }

    }

}