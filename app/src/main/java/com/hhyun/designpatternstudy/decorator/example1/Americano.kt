package com.hhyun.designpatternstudy.decorator.example1

class Americano: Beverage() {

    override fun name(): String = "아메리카노"
    override fun cost(): Int = 4000
}