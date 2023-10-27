package ru.kravchenkoanatoly.weatherApp.data.models.dto.response.common

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ConditionDto(
    @Json(name = "code")
    val code: Int,
    @Json(name = "icon")
    val icon: String,
    @Json(name = "text")
    val text: String
)