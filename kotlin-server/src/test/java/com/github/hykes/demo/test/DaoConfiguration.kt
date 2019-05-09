package com.github.hykes.demo.test

import org.mybatis.spring.boot.autoconfigure.MybatisAutoConfiguration
import org.springframework.boot.autoconfigure.AutoConfigureAfter
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration

/**
 * @author hehaiyangwork@gmail.com
 * @date 2018/3/5
 */
@Configuration
@EnableAutoConfiguration
@ComponentScan("com.github.hykes.demo*")
@AutoConfigureAfter(MybatisAutoConfiguration::class)
class DaoConfiguration