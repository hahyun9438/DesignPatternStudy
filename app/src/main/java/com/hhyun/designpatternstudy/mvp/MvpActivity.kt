package com.hhyun.designpatternstudy.mvp

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.hhyun.designpatternstudy.R
import com.hhyun.designpatternstudy.databinding.ActivityArchitectureTestBinding
import com.hhyun.designpatternstudy.mvp.model.MvpPersonModel
import com.hhyun.designpatternstudy.mvp.model.MvpRepository
import com.hhyun.designpatternstudy.mvp.presenter.Contract
import com.hhyun.designpatternstudy.mvp.presenter.MvpPresenterImpl

class MvpActivity: AppCompatActivity(), View.OnClickListener, Contract.View {

    private lateinit var binding: ActivityArchitectureTestBinding

    private lateinit var presenterImpl: MvpPresenterImpl

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityArchitectureTestBinding.inflate(layoutInflater)
        setContentView(binding.root)

        presenterImpl = MvpPresenterImpl(MvpRepository, this)

        binding.buttonGetData.setOnClickListener(this)
    }

    override fun onDestroy() {
        super.onDestroy()
        presenterImpl.detach()
    }


    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.button_get_data -> presenterImpl.getData()
        }
    }



    override fun loading(isLoading: Boolean) {
        binding.loadingView.visibility = if (isLoading) View.VISIBLE else View.GONE
    }

    override fun setData(data: MvpPersonModel) {
        binding.tvData.text = data.toString()
    }


}