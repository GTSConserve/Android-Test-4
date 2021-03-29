package com.help.test.MainViewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.help.test.Model.model
import com.help.test.Repository.MainRepository

class Viewmodel :ViewModel(){

    var response_data: MutableLiveData<model>?=null

    fun getData() :MutableLiveData<model>?{
      response_data =MainRepository().getdata()
      return response_data

    }


}