package com.hhyun.designpatternstudy.mvp.presenter

import com.hhyun.designpatternstudy.mvp.model.MvpPersonModel

interface Contract {

    interface Presenter {
        fun detach()
        fun getData()
    }

    interface View {
        fun loading(isLoading: Boolean)
        fun setData(data: MvpPersonModel)
    }
}