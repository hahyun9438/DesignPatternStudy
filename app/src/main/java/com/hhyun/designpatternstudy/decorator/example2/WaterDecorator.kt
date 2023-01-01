package com.hhyun.designpatternstudy.decorator.example2

class WaterDecorator(private val coffeeComponent: Component): Decorator(coffeeComponent) {

    override fun add(): String {
        return super.add() + " + 물"
    }
}