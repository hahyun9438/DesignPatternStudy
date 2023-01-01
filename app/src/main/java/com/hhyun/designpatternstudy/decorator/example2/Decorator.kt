package com.hhyun.designpatternstudy.decorator.example2

abstract class Decorator(private val coffeeComponent: Component): Component {

    override fun add(): String {
        return coffeeComponent.add()
    }

}