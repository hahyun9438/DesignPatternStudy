package com.hhyun.designpatternstudy.mvc.controller

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.hhyun.designpatternstudy.R
import com.hhyun.designpatternstudy.databinding.ActivityArchitectureTestBinding
import com.hhyun.designpatternstudy.mvc.model.MvcRepository

class MvcActivity: AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityArchitectureTestBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityArchitectureTestBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonGetData.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.button_get_data -> getData()
        }
    }

    private fun getData() {

        binding.loadingView.visibility = View.VISIBLE

        Handler(Looper.getMainLooper()).postDelayed({

            val data = MvcRepository.getData()
            binding.tvData.text = data.toString()
            binding.loadingView.visibility = View.GONE

        }, 1000)


    }


}