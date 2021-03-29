package com.help.test.Retrofit

import com.help.test.Model.model
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.POST

interface ApiInterface {

    @GET("get_all_products.php")
    fun get(): Call<model>


}
