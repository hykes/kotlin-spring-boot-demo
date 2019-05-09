package com.github.hykes.demo.service.impl

import com.alibaba.dubbo.config.annotation.Service
import com.github.hykes.demo.dao.UserDao
import com.github.hykes.demo.common.Response
import com.github.hykes.demo.model.User
import com.github.hykes.demo.service.UserWriteService
import com.google.common.base.Throwables
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired

/**
 * 用户写服务实现类
 *
 * @author hehaiyangwork@gmail.com
 * @date 2018-05-09 15:09:15
 * Created by CodeGen .
 */
@Service(version = "1.0.0")
class UserWriteServiceImpl: UserWriteService {

    val log = LoggerFactory.getLogger(this.javaClass)

    @Autowired
    lateinit var userDao: UserDao

    override fun create(user: User): Response<Long> {
        return try {
            userDao.create(user)
            Response.ok(user.id)
        } catch (e: Exception) {
                log.error("failed to find user by id:{}, cause:{}", user, Throwables.getStackTraceAsString(e));
            Response.fail("user.find.fail")
        }
    }

}
