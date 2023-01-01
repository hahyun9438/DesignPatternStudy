package com.hhyun.designpatternstudy.decorator

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.hhyun.designpatternstudy.databinding.ActivityCustomerBinding
import com.hhyun.designpatternstudy.decorator.example1.Beverage
import com.hhyun.designpatternstudy.decorator.example1.CaffeLatte
import com.hhyun.designpatternstudy.decorator.example1.Cream
import com.hhyun.designpatternstudy.decorator.example1.Shot
import com.hhyun.designpatternstudy.decorator.example2.BaseComponent
import com.hhyun.designpatternstudy.decorator.example2.MilkDecorator
import com.hhyun.designpatternstudy.decorator.example2.WaterDecorator

class CustomerActivity: AppCompatActivity() {

    private lateinit var binding: ActivityCustomerBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityCustomerBinding.inflate(layoutInflater)
        setContentView(binding.root)

        order()
    }

    private fun order() {

        var beverage: Beverage = CaffeLatte()
        beverage = Shot(beverage)
        beverage = Cream(beverage)

        println("메뉴 : ${beverage.name()}")
        println("가격 : ${beverage.cost()}")


        val espresso = BaseComponent()
        println("espresso : ${espresso.add()}")

        val americano = WaterDecorator(espresso)
        println("americano : ${espresso.add()}")

        val latte = MilkDecorator(espresso)
        println("latte : ${espresso.add()}")

    }

}