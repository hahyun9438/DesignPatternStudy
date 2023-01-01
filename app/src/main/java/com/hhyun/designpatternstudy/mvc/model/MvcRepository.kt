package com.hhyun.designpatternstudy.mvc.model

object MvcRepository {

    fun getData(): MvcPersonModel {
        return MvcPersonModel(
            name = "hahyun",
            age = 30,
            gender = "female"
        )
    }

}