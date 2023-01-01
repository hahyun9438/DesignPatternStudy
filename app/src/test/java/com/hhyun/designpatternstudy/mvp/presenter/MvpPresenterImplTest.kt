package com.hhyun.designpatternstudy.mvp.presenter

import com.hhyun.designpatternstudy.mvp.model.MvpPersonModel
import com.hhyun.designpatternstudy.mvp.model.MvpRepository
import org.junit.Before
import org.junit.Test
import org.mockito.Mock
import org.mockito.Mockito.verify
import org.mockito.MockitoAnnotations

class MvpPresenterImplTest {

    @Mock private lateinit var mvpView: Contract.View

    private lateinit var mvpRepository: MvpRepository
    private lateinit var presenterImpl: MvpPresenterImpl
    private lateinit var data: MvpPersonModel


    @Before
    fun setupPresenter() {
        MockitoAnnotations.openMocks(this)
        mvpRepository = MvpRepository
        presenterImpl = MvpPresenterImpl(mvpRepository, mvpView)
        data = mvpRepository.getData()
    }

    @Test
    fun test() {
//        val mvpRepository = mockk<MvpRepository>()

        presenterImpl.getData()

        verify(mvpView).loading(true)
//        verify(mvpRepository).getData()
        verify(mvpView).setData(mvpRepository.getData())
        verify(mvpView).loading(false)
    }

}