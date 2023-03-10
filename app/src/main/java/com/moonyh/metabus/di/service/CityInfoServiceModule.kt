package com.moonyh.metabus.di.service

import com.moonyh.data.service.CityInfoService
import com.moonyh.metabus.di.CityInfoRetrofit
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
class CityInfoServiceModule {

    @Singleton
    @Provides
    fun providesCityInfoService(@CityInfoRetrofit retrofit: Retrofit):CityInfoService{
        return retrofit.create(CityInfoService::class.java)
    }
}