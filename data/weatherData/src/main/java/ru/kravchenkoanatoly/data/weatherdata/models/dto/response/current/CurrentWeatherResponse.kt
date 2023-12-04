package ru.kravchenkoanatoly.data.weatherdata.models.dto.response.current

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import ru.kravchenkoanatoly.data.weatherdata.models.dto.response.common.CurrentWeatherDto
import ru.kravchenkoanatoly.data.weatherdata.models.dto.response.common.LocationDto

@JsonClass(generateAdapter = true)
class CurrentWeatherResponse(
    @Json(name = "current")
    val current: CurrentWeatherDto,
    @Json(name = "location")
    val location: LocationDto
)