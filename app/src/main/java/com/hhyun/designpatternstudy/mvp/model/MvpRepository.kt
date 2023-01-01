package com.hhyun.designpatternstudy.mvp.model


object MvpRepository {

    fun getData(): MvpPersonModel {
        return MvpPersonModel(
            name = "hahyun",
            age = 30,
            gender = "female"
        )
    }
}