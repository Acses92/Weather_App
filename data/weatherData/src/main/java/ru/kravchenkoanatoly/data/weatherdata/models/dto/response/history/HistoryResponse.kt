package ru.kravchenkoanatoly.data.weatherdata.models.dto.response.history

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import ru.kravchenkoanatoly.data.weatherdata.models.dto.response.common.ForecastDto
import ru.kravchenkoanatoly.data.weatherdata.models.dto.response.common.LocationDto

@JsonClass(generateAdapter = true)
class HistoryResponse(
    @Json(name = "forecast")
    val forecast: ForecastDto,
    @Json(name = "location")
    val location: LocationDto
)