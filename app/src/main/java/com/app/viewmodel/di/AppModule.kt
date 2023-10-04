package com.app.viewmodel.di

import android.app.Application
import com.app.viewmodel.data.MyRepositoryImplementation
import com.app.viewmodel.data.domain.repository.MyRepository
import com.app.viewmodel.data.remote.MyApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Named
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)//determines how long the injected dependencies will live
object AppModule {

    @Provides
    @Singleton
    fun provideMyApi(): MyApi {
        return Retrofit.Builder().baseUrl("https://https.test.com").build()
            .create(MyApi::class.java)
    }



    @Provides
    @Singleton
    @Named("hikes")
    fun provideString() = "Hey, Charles."

    @Provides
    @Singleton
    @Named("yikes")
    fun provideString2() = "Hey, Charles. 2"


}