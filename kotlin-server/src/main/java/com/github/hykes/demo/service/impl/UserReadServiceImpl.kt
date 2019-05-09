package com.github.hykes.demo.service.impl

import com.alibaba.dubbo.config.annotation.Service
import com.github.hykes.demo.dao.UserDao
import com.github.hykes.demo.common.Response
import com.github.hykes.demo.model.User
import com.github.hykes.demo.service.UserReadService
import com.google.common.base.Throwables
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired

/**
 * 用户读服务实现类
 *
 * @author hehaiyangwork@gmail.com
 * @date 2018-05-09 15:09:15
 * Created by CodeGen .
 */
@Service(version = "1.0.0")
class UserReadServiceImpl: UserReadService {

    val log = LoggerFactory.getLogger(this.javaClass)

    @Autowired
    lateinit var userDao: UserDao

    override fun findById(id: Long): Response<User> {
        return try {
            Response.ok(userDao.findById(id))
        } catch (e: Exception) {
            log.error("failed to find user by id:{}, cause:{}", id, Throwables.getStackTraceAsString(e));
            Response.fail("user.find.fail")
        }
    }

}
