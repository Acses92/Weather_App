package ru.kravchenkoanatoly.weatherApp.di

import android.content.Context
import androidx.room.Room
import com.squareup.moshi.Moshi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import ru.kravchenkoanatoly.data.sources.local.AppConstant.baseApiUrl
import ru.kravchenkoanatoly.data.sources.local.AppConstant.databaseName
import ru.kravchenkoanatoly.data.sources.local.LocationProviderImpl
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule{
    @Provides
    @Singleton
    fun provideSharedPreferences(@ApplicationContext context: Context): ru.kravchenkoanatoly.data.sources.local.AppPreferences =
            ru.kravchenkoanatoly.data.sources.local.AppPreferences(
                context.getSharedPreferences(
                    "app_shared_preferences",
                    Context.MODE_PRIVATE
                )
            )

    @Provides
    @Singleton
    fun provideAppDatabase(@ApplicationContext context: Context): ru.kravchenkoanatoly.data.sources.local.AppDatabase =
            Room.databaseBuilder(context,
                ru.kravchenkoanatoly.data.sources.local.AppDatabase::class.java, databaseName )
                .build()

    @Provides
    @Singleton
    fun provideMoshi(): Moshi =
            Moshi.Builder()
                .build()

    @Provides
    @Singleton
    fun provideOkkHttpClient(): OkHttpClient = OkHttpClient.Builder().build()


    @Provides
    @Singleton
    fun provideRetrofitApi(
        client: OkHttpClient,
        moshi: Moshi
    ): Retrofit = getRetrofit(baseUrl = baseApiUrl, client, moshi)

    private fun getRetrofit(baseUrl: String, client: OkHttpClient, moshi: Moshi): Retrofit =
            Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(MoshiConverterFactory.create(moshi))
                .client(client)
                .build()


    @Provides
    @Singleton
    fun provideLocationProvider(
        @ApplicationContext context: Context
    ): LocationProviderImpl = LocationProviderImpl(context)
}