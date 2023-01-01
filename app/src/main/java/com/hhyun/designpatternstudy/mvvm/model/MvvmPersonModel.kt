package com.hhyun.designpatternstudy.mvvm.model

data class MvvmPersonModel(
    val name: String,
    val age: Int,
    val gender: String
) {

    override fun toString(): String {
        return "MvvmPersonModel(name='$name', age=$age, gender='$gender')"
    }
}