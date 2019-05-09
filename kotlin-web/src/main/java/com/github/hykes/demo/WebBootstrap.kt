package com.github.hykes.demo

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

/**
 * Kotlin demo
 * @author hehaiyangwork@gmail.com
 * @date 2018/01/16
 */
@SpringBootApplication
class WebBootstrap

fun main(args: Array<String>) {
        SpringApplication.run(WebBootstrap::class.java, *args)
}
