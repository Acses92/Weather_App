package ru.kravchenkoanatoly.weatherApp.data.models.dto.response.common

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import ru.kravchenkoanatoly.weatherApp.data.models.dto.response.common.ConditionDto
import ru.kravchenkoanatoly.weatherApp.data.models.dto.response.common.AirQualityDto

@JsonClass(generateAdapter = true)
data class HourWeatherDto(
    @Json(name = "air_quality")
    val airQuality: AirQualityDto,
    @Json(name = "chance_of_rain")
    val chanceOfRain: Int,
    @Json(name = "chance_of_snow")
    val chanceOfSnow: Int,
    @Json(name = "cloud")
    val cloud: Int,
    @Json(name = "condition")
    val condition: ConditionDto,
    @Json(name = "dewpoint_c")
    val dewPointC: Double,
    @Json(name = "dewpoint_f")
    val dewPointF: Double,
    @Json(name = "feelslike_c")
    val feelsLikeC: Double,
    @Json(name = "feelslike_f")
    val feelsLikeF: Double,
    @Json(name = "gust_kph")
    val gustKph: Double,
    @Json(name = "gust_mph")
    val gustMph: Double,
    @Json(name = "heatindex_c")
    val heatIndexC: Double,
    @Json(name = "heatindex_f")
    val heatIndexF: Double,
    @Json(name = "humidity")
    val humidity: Int,
    @Json(name = "is_day")
    val isDay: Int,
    @Json(name = "precip_in")
    val precipIn: Double,
    @Json(name = "precip_mm")
    val precipMm: Double,
    @Json(name = "pressure_in")
    val pressureIn: Double,
    @Json(name = "pressure_mb")
    val pressureMb: Double,
    @Json(name = "temp_c")
    val tempC: Double,
    @Json(name = "temp_f")
    val tempF: Double,
    @Json(name = "time")
    val time: String,
    @Json(name = "time_epoch")
    val timeEpoch: Int,
    @Json(name = "uv")
    val uv: Double,
    @Json(name = "vis_km")
    val visKm: Double,
    @Json(name = "vis_miles")
    val visMiles: Double,
    @Json(name = "will_it_rain")
    val willItRain: Int,
    @Json(name = "will_it_snow")
    val willItSnow: Int,
    @Json(name = "wind_degree")
    val windDegree: Int,
    @Json(name = "wind_dir")
    val windDir: String,
    @Json(name = "wind_kph")
    val windKph: Double,
    @Json(name = "wind_mph")
    val windMph: Double,
    @Json(name = "windchill_c")
    val windChillC: Double,
    @Json(name = "windchill_f")
    val windChillF: Double
)