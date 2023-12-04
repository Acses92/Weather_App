package ru.kravchenkoanatoly.weatherApp.data.models.dto.response.common

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ForecastdayDto(
    @Json(name = "astro")
    val astro: AstroDto,
    @Json(name = "date")
    val date: String,
    @Json(name = "date_epoch")
    val dateEpoch: Int,
    @Json(name = "day")
    val day: DayWeatherDto,
    @Json(name = "hour")
    val hour: List<HourWeatherDto>
)