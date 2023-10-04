package com.app.viewmodel.di

import com.app.viewmodel.data.MyRepositoryImplementation
import com.app.viewmodel.data.domain.repository.MyRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
  abstract fun bindsMyDependency(
      myRepositoryImplementation: MyRepositoryImplementation
  ): MyRepository

}