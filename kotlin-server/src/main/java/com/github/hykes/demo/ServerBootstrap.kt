package com.github.hykes.demo

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

/**
 * Kotlin core
 * @author hehaiyangwork@gmail.com
 * @date 2018/01/16
 */
@SpringBootApplication
class ServiceBootstrap

fun main(args: Array<String>) {
        SpringApplication.run(ServiceBootstrap::class.java, *args)
}
