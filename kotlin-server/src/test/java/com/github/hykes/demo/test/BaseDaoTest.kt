package com.github.hykes.demo.test

import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.annotation.Rollback
import org.springframework.test.context.ActiveProfiles
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner
import org.springframework.transaction.annotation.Transactional

/**
 * @author hehaiyangwork@gmail.com
 * @date 2018/3/5
 */
@SpringBootTest(classes = arrayOf(DaoConfiguration::class))
@RunWith(SpringJUnit4ClassRunner::class)
@Transactional
@Rollback
@ActiveProfiles("test")
abstract class BaseDaoTest