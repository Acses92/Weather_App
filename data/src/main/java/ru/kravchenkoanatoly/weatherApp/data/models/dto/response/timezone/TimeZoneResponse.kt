package ru.kravchenkoanatoly.weatherApp.data.models.dto.response.timezone

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import ru.kravchenkoanatoly.weatherApp.data.models.dto.response.common.LocationDto

@JsonClass(generateAdapter = true)
class TimeZoneResponse(
    @Json(name = "location")
    val location: LocationDto
)