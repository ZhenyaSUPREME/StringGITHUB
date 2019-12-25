package com.example.demo.repository

import com.example.demo.model.Car
import org.springframework.data.mongodb.repository.ReactiveMongoRepository
import org.springframework.stereotype.Repository
import reactor.core.publisher.Flux

@Repository
interface CarRepository: ReactiveMongoRepository<Car,String>{
    fun getAll(): Flux<Car>
    fun getOneList():Flux<Car>
    // Функция getAll получает всё
    // А функция getOneList ,получить один список
    // Получу одно из двух



}