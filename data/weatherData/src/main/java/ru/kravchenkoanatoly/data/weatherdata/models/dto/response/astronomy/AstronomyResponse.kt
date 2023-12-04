package ru.kravchenkoanatoly.data.weatherdata.models.dto.response.astronomy

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import ru.kravchenkoanatoly.data.weatherdata.models.dto.response.common.LocationDto

@JsonClass(generateAdapter = true)
class AstronomyResponse(
    @Json(name = "astronomy")
    val astronomy: Astronomy,
    @Json(name = "location")
    val location: LocationDto
)