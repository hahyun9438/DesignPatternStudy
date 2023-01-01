package com.hhyun.designpatternstudy.decorator.example1

class Cream(private val beverage: Beverage): CondimentDecorator() {

    override fun name(): String = "${beverage.name()}, 크림"
    override fun cost(): Int = beverage.cost() + 500
}