package com.hhyun.designpatternstudy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hhyun.designpatternstudy.databinding.ActivityMainBinding
import com.hhyun.designpatternstudy.decorator.CustomerActivity
import com.hhyun.designpatternstudy.lifecycle.LifecycleActivity
import com.hhyun.designpatternstudy.mvc.controller.MvcActivity
import com.hhyun.designpatternstudy.mvp.MvpActivity
import com.hhyun.designpatternstudy.mvvm.MvvmActivity

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setListener()


    }

    private fun setListener() {

        binding.buttonLifecycle.setOnClickListener {
            startActivity(Intent(this, LifecycleActivity::class.java))
        }

        binding.buttonMvc.setOnClickListener {
            startActivity(Intent(this, MvcActivity::class.java))
        }

        binding.buttonMvp.setOnClickListener {
            startActivity(Intent(this, MvpActivity::class.java))
        }

        binding.buttonMvvm.setOnClickListener {
            startActivity(Intent(this, MvvmActivity::class.java))
        }

        binding.buttonDecorator.setOnClickListener {
            startActivity(Intent(this, CustomerActivity::class.java))
        }


    }


}