package com.shawn.weatherapp.domain.commands

import com.shawn.weatherapp.data.ForecastRequest
import com.shawn.weatherapp.domain.mappers.ForecastDataMapper
import com.shawn.weatherapp.domain.model.ForecastList

class RequestForecastCommand(private val zipCode: String) : Command<ForecastList> {
    override fun execute(): ForecastList {
        val forecastRequest = ForecastRequest(zipCode)
        return ForecastDataMapper().convertFromDataModel(forecastRequest.execute())
    }
}