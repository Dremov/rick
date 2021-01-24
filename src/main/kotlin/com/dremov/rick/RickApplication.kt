package com.dremov.rick

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class RickApplication

fun main(args: Array<String>) {
    runApplication<RickApplication>(*args)
}
