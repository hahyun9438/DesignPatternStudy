package com.hhyun.designpatternstudy.decorator.example1

abstract class CondimentDecorator: Beverage() {

    override fun name(): String = ""
    override fun cost(): Int = 0
}