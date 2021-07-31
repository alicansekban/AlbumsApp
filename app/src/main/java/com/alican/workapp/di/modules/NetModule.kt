package com.alican.workapp.di.modules

import com.alican.workapp.net.WorkApi
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NetModule {

    @Provides
    @Singleton
    fun provideMoshi(): Moshi {
        return Moshi.Builder()
            .add(KotlinJsonAdapterFactory()).build()
    }

    @Provides
    @Singleton
    fun provideAPI(): WorkApi {
        return Retrofit.Builder()
            .baseUrl("https://jsonplaceholder.typicode.com/") // TODO : Put API URL
            .addConverterFactory(
                MoshiConverterFactory.create()
            )
            .build()
            .create(WorkApi::class.java)
    }
}