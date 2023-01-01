package com.hhyun.designpatternstudy.decorator.example1

import com.hhyun.designpatternstudy.decorator.example1.Beverage
import com.hhyun.designpatternstudy.decorator.example1.CondimentDecorator

class Shot(private val beverage: Beverage): CondimentDecorator() {

    override fun name(): String = "${beverage.name()}, 샷"
    override fun cost(): Int = beverage.cost() + 400
}