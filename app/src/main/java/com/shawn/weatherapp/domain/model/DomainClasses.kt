package com.shawn.weatherapp.domain.model

data class ForecastList(val city: String, val country: String, private val dailyForecast: List<Forecast>){
    operator fun get(position:Int):Forecast=dailyForecast[position]
    val size:Int
        get()=dailyForecast.size
}
data class Forecast(val date: String, val description: String, val high: Int, val low: Int)