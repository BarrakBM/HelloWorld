package com.barrak.helloworld

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloWorldController(
    val usersRepository: UsersRepository
){

    @GetMapping("/hello")
    fun helloWorld() =  "Hello World!"

    @GetMapping("/order")
    fun orders() =  "Your orders"

    @GetMapping("/cart")
    fun cart() =  "Your cart"

    @GetMapping("/resturant")
    fun resturant() =  "List of resturants"

// Post
    @PostMapping("/my-name")
    fun sayMyName( @RequestBody request: SayMyNameRequest) = usersRepository.save(User(name = request.name))

}

data class SayMyNameRequest(
    val name: String
)

