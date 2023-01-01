package com.hhyun.designpatternstudy.mvvm

import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.hhyun.designpatternstudy.R
import com.hhyun.designpatternstudy.databinding.ActivityArchitectureTestBinding
import com.hhyun.designpatternstudy.mvvm.viewmodel.MvvmViewModel

class MvvmActivity: AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityArchitectureTestBinding
    private val viewModel by viewModels<MvvmViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityArchitectureTestBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonGetData.setOnClickListener(this)
        setupObserver()
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.button_get_data -> viewModel.getData()
        }
    }


    private fun setupObserver() {

        viewModel.event.observe(this) { event ->

            when (event) {
                is MvvmViewModel.Event.Loading -> binding.loadingView.visibility = if (event.isLoading) View.VISIBLE else View.GONE
                is MvvmViewModel.Event.UpdateUI -> binding.tvData.text = event.data.toString()
                else -> {}
            }

        }

    }


}