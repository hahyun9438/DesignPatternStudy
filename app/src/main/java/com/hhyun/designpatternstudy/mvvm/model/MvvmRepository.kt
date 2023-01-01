package com.hhyun.designpatternstudy.mvvm.model

object MvvmRepository {

    fun getData(): MvvmPersonModel {
        return MvvmPersonModel(
            name = "hahyun",
            age = 30,
            gender = "female"
        )
    }
}