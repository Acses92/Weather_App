package ru.kravchenkoanatoly.weatherApp.data.models.dto.response.history

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import ru.kravchenkoanatoly.weatherApp.data.models.dto.response.common.LocationDto
import ru.kravchenkoanatoly.weatherApp.data.models.dto.response.common.ForecastDto

@JsonClass(generateAdapter = true)
class HistoryResponse(
    @Json(name = "forecast")
    val forecast: ForecastDto,
    @Json(name = "location")
    val location: LocationDto
)