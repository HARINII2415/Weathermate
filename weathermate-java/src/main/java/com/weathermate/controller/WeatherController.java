package com.weathermate.controller;

import com.weathermate.model.WeatherData;
import com.weathermate.service.WeatherService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/weather")
@CrossOrigin(origins = "*")
public class WeatherController {

    private final WeatherService weatherService;

    public WeatherController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @GetMapping("/city/{city}")
    public ResponseEntity<WeatherData> getWeatherByCity(@PathVariable String city) {
        WeatherData weatherData = weatherService.getCurrentWeather(city);
        return ResponseEntity.ok(weatherData);
    }

    @GetMapping("/coordinates")
    public ResponseEntity<WeatherData> getWeatherByCoordinates(
            @RequestParam Double latitude,
            @RequestParam Double longitude) {
        WeatherData weatherData = weatherService.getWeatherByCoordinates(latitude, longitude);
        return ResponseEntity.ok(weatherData);
    }
} 