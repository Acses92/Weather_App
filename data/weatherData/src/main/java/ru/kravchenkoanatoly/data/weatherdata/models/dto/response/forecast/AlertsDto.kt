package ru.kravchenkoanatoly.data.weatherdata.models.dto.response.forecast

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AlertsDto(
    @Json(name = "alert")
    val alert: List<Any>
)