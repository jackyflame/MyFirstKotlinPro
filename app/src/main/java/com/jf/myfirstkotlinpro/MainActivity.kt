package com.jf.myfirstkotlinpro

import android.databinding.DataBindingUtil
import android.databinding.ViewDataBinding
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var databindng = DataBindingUtil.setContentView<ViewDataBinding>(this,R.layout.activity_main)
    }
}
