package com.hhyun.designpatternstudy.mvvm.viewmodel

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import io.mockk.verify
import junit.framework.Assert
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.test.TestCoroutineDispatcher
import kotlinx.coroutines.test.resetMain
import kotlinx.coroutines.test.setMain
import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.Test

class MvvmViewModelTest {

    @get:Rule
    val instantExecutorRule = InstantTaskExecutorRule()

    private val dispatcher = TestCoroutineDispatcher()

    private lateinit var viewModel: MvvmViewModel


    @Before
    fun setupViewModel() {
        Dispatchers.setMain(dispatcher)
        viewModel = MvvmViewModel()
    }

    @After
    fun tearDown() {
        Dispatchers.resetMain()
    }

    @Test
    fun test() {
        viewModel.getData()

        Assert.assertEquals(viewModel.event.value!!.javaClass.simpleName, "Loading")
//        Assert.assertEquals(viewModel.event.value!!.javaClass.simpleName, "UpdateUI")
//        Assert.assertEquals(viewModel.event.value!!.javaClass.simpleName, "Loading")
    }

}