package com.hhyun.designpatternstudy.mvc.model

data class MvcPersonModel(
    val name: String,
    val age: Int,
    val gender: String
) {

    override fun toString(): String {
        return "MvcPersonModel(name='$name', age=$age, gender='$gender')"
    }
}
