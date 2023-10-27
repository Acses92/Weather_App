package ru.kravchenkoanatoly.weatherApp.data.models.dto.response.astronomy

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import ru.kravchenkoanatoly.weatherApp.data.models.dto.response.common.AstroDto

@JsonClass(generateAdapter = true)
data class Astronomy(
    @Json(name = "astro")
    val astro: AstroDto
)