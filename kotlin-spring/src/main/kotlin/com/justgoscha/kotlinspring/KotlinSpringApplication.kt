package com.justgoscha.kotlinspring

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
class KotlinSpringApplication

fun main(args: Array<String>) {
	runApplication<KotlinSpringApplication>(*args)
}


@RestController
class MessageController {
	@GetMapping("/")
	fun index(@RequestParam("name") name: String) = "Hello, $name!"
}
