package com.shawn.weatherapp.domain.commands

interface Command<out T> {
    fun execute(): T
}