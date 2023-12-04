package ru.kravchenkoanatoly.data.weatherdata.models.dto.response.common

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ForecastDto(
    @Json(name = "forecastday")
    val forecastDay: List<ForecastdayDto>
)