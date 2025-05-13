package com.weathermate.service;

import com.weathermate.model.WeatherData;

public interface WeatherService {
    WeatherData getCurrentWeather(String city);
    WeatherData getWeatherByCoordinates(Double latitude, Double longitude);
} 