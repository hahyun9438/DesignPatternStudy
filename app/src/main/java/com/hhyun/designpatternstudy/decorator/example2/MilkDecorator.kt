package com.hhyun.designpatternstudy.decorator.example2

class MilkDecorator(private val coffeeComponent: Component): Decorator(coffeeComponent) {

    override fun add(): String {
        return super.add() + " + 우유"
    }
}