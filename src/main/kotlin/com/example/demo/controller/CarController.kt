package com.example.demo.controller

import com.example.demo.model.Car
import com.example.demo.repository.CarRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Flux

@RestController
@RequestMapping("/api/car")
class CarController(var carRepository: CarRepository){
    @GetMapping
    fun getAll(): Flux<Car> {
    return carRepository.findAll()
    }
}