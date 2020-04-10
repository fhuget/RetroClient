package com.vokasi.retroclient.custom

import com.vokasi.retroclient.model.MyModel
import retrofit2.Call
import retrofit2.http.GET

interface MyServices{
    @GET("posts")
    fun getPosts(): Call<List<MyModel>>
}