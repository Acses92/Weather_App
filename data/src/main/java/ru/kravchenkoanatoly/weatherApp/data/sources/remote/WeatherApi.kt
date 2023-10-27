package ru.kravchenkoanatoly.weatherApp.data.sources.remote

import retrofit2.http.GET
import retrofit2.http.Path
import ru.kravchenkoanatoly.weatherApp.data.models.dto.response.astronomy.AstronomyResponse
import ru.kravchenkoanatoly.weatherApp.data.models.dto.response.current.CurrentWeatherResponse
import ru.kravchenkoanatoly.weatherApp.data.models.dto.response.forecast.ForecastWeatherResponse
import ru.kravchenkoanatoly.weatherApp.data.models.dto.response.history.HistoryResponse
import ru.kravchenkoanatoly.weatherApp.data.models.dto.response.search.SearchResponse
import ru.kravchenkoanatoly.weatherApp.data.models.dto.response.timezone.TimeZoneResponse
import ru.kravchenkoanatoly.weatherApp.data.models.enums.YesNoEnum

interface WeatherApi {

    @GET("/current.json")
    fun getCurrentWeather(
        @Path("key") apiKey:String,
        @Path("q") location: String,
        @Path("agi") airQuality: YesNoEnum): CurrentWeatherResponse

    @GET("/forecast")
    fun getForecast(
        @Path("key") apiKey: String,
        @Path("aqi") airQuality: YesNoEnum,
        @Path("alerts") alerts: YesNoEnum
    ): ForecastWeatherResponse

    @GET("/search")
    fun getLocation(
        @Path("key") apiKey: String,
        @Path("q") location: String
    ): SearchResponse

    @GET("/history")
    fun getHistoryWeather(
        @Path("key") apiKey: String,
        @Path("q") location: String,
        @Path("dt") date: String
    ): HistoryResponse

    @GET("/astronomy")
    fun getAstronomyData(
        @Path("key") apiKey: String,
        @Path("q") location: String,
        @Path("dt") date: String
    ): AstronomyResponse

    @GET("/timezone")
    fun getTimezoneData(
        @Path("key") apiKey: String,
        @Path("q") location: String,
    ): TimeZoneResponse

}