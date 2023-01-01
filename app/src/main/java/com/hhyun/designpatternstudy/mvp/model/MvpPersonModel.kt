package com.hhyun.designpatternstudy.mvp.model

data class MvpPersonModel(
    val name: String,
    val age: Int,
    val gender: String
) {

    override fun toString(): String {
        return "MvpPersonModel(name='$name', age=$age, gender='$gender')"
    }
}