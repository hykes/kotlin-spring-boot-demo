package com.github.hykes.demo.front

import com.alibaba.dubbo.config.annotation.Reference
import com.github.hykes.demo.common.Response
import com.github.hykes.demo.model.User
import com.github.hykes.demo.service.UserReadService
import com.github.hykes.demo.service.UserWriteService
import org.slf4j.LoggerFactory
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.*
import java.util.*

/**
 *
 * @author hehaiyangwork@gmail.com
 * @date 2018-05-09 15:09:15
 * Created by CodeGen .
 */
@RestController
@RequestMapping("api/users")
class UserController {

    val log = LoggerFactory.getLogger(this.javaClass)

    @Reference(version = "1.0.0")
    lateinit var userWriteService: UserWriteService

    @Reference(version = "1.0.0")
    lateinit var userReadService: UserReadService

    @GetMapping(value = "/{id}", produces = arrayOf(MediaType.APPLICATION_JSON_VALUE))
    fun findUser(@PathVariable id: Long) : User? {
        var resp: Response<User> = userReadService.findById(id)
        if (!resp.success) {
            log.error("failed to find user by id:{}, cause:{}", id, resp.error)
            throw RuntimeException("User.not.found")
        }
        if (Objects.isNull(resp.result)) {
            throw RuntimeException("User.not.found")
        }
        return resp.result
    }

    @PostMapping(produces = arrayOf(MediaType.APPLICATION_JSON_VALUE))
    fun createUser(@RequestBody user: User): Long? {
        var resp: Response<Long> = userWriteService.create(user);
        if (!resp.success) {
            log.error("failed to create user:{}, cause:{}", user.toString(), resp.error);
            throw RuntimeException("User.create.fail")
        }
        return resp.result
    }

}
