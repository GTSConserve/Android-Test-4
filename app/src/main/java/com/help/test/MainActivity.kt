package com.help.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.help.test.MainViewmodel.Viewmodel
import com.help.test.Model.GTS
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var viewmodel:Viewmodel
    var data1:List<GTS>?=null
    var adapter:CustomAdapter?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewmodel=ViewModelProvider(this).get(Viewmodel::class.java)

        viewmodel.getData()?.observe(this, Observer { it->
            println("trest"+ it)
data1=it.GTS

            it.let {
                adapter = this.let { CustomAdapter(data1!!, it) }
                recycle.layoutManager = LinearLayoutManager(this,
                    LinearLayoutManager.VERTICAL,false)
               // recycle.layoutManager = LinearLayoutManager(this)
                recycle.adapter = adapter;
            }

        })


    }
}