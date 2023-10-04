package com.app.viewmodel.data

import android.app.Application
import com.app.viewmodel.R
import com.app.viewmodel.data.domain.repository.MyRepository
import com.app.viewmodel.data.remote.MyApi
import dagger.Provides
import javax.inject.Inject
import javax.inject.Named
import javax.inject.Singleton

class MyRepositoryImplementation @Inject constructor(
    private val api: MyApi,
    private val appContext: Application
) : MyRepository {

    init {
        val apName=appContext.getString(R.string.app_name)

        println("Your name is $apName")
    }


    override suspend fun doNetworkCall() {
        TODO("Not yet implemented")
    }






}