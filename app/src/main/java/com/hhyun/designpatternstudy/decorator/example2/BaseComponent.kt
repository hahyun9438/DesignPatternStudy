package com.hhyun.designpatternstudy.decorator.example2

class BaseComponent: Component {

    override fun add(): String {
        return "에스프레소"
    }
}