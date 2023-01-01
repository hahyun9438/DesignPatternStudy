package com.hhyun.designpatternstudy.mvvm.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.hhyun.designpatternstudy.mvvm.model.MvvmPersonModel
import com.hhyun.designpatternstudy.mvvm.model.MvvmRepository
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MvvmViewModel: ViewModel() {

    private val repository = MvvmRepository

    private val _event: MutableLiveData<Event> = MutableLiveData()
    val event: MutableLiveData<Event> get() = _event


    fun getData() {
        viewModelScope.launch {
            _event.value = Event.Loading(true)

            delay(1000)

            val data = repository.getData()
            _event.value = Event.UpdateUI(data)
            _event.value = Event.Loading(false)
        }
    }


    sealed class Event {
        class Loading(val isLoading: Boolean): Event()
        class UpdateUI(val data: MvvmPersonModel): Event()
    }

}