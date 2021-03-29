package com.help.test.Repository

import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.help.test.Model.model
import com.help.test.Retrofit.Retrofitclient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainRepository{

      val data=MutableLiveData<model>()

   fun getdata():MutableLiveData<model>{

       val call = Retrofitclient.apiInterface.get()
       call.enqueue(object: Callback<model> {
           override fun onFailure(call: Call<model>, t: Throwable) {
               // TODO("Not yet implemented")
               Log.v("DEBUG : ", t.message.toString())
           }
           override fun onResponse(
               call: Call<model>,
               response: Response<model>
           ) {
               // TODO("Not yet implemented")
               Log.v("DEBUG : ", response.body().toString())
               data.postValue(response.body())
           }
       })
       return data


 return data
}


}