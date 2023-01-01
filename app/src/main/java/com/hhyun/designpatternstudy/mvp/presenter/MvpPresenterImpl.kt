package com.hhyun.designpatternstudy.mvp.presenter

import android.os.Handler
import android.os.Looper
import com.hhyun.designpatternstudy.mvp.model.MvpRepository

class MvpPresenterImpl(
    private val repository: MvpRepository,
    private var view: Contract.View?
): Contract.Presenter {

    override fun detach() {
        view = null
    }

    override fun getData() {
        view?.loading(true)

        Handler(Looper.getMainLooper()).postDelayed({

            val data = repository.getData()
            view?.setData(data)
            view?.loading(false)

        }, 1000)


    }


}