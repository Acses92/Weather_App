package ru.kravchenkoanatoly.weatherApp.data.models.dto.response.forecast

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import ru.kravchenkoanatoly.weatherApp.data.models.dto.response.common.CurrentWeatherDto
import ru.kravchenkoanatoly.weatherApp.data.models.dto.response.common.ForecastDto
import ru.kravchenkoanatoly.weatherApp.data.models.dto.response.common.LocationDto

@JsonClass(generateAdapter = true)
class ForecastWeatherResponse(
    @Json(name = "")
    val alerts: AlertsDto,
    @Json(name = "current")
    val current: CurrentWeatherDto,
    @Json(name = "forecast")
    val forecast: ForecastDto,
    @Json(name = "location")
    val location: LocationDto
)