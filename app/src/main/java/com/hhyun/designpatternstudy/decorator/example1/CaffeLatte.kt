package com.hhyun.designpatternstudy.decorator.example1

class CaffeLatte: Beverage() {

    override fun name(): String = "카페라떼"
    override fun cost(): Int = 5000
}