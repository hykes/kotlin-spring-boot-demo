package com.github.hykes.demo.service

import com.github.hykes.demo.common.Response
import com.github.hykes.demo.model.User

/**
 * @author hehaiyangwork@gmail.com
 * @date 2018-05-09 15:09:15
 * Created by CodeGen .
 */
interface UserWriteService {

    /**
     * 创建
     *
     * @param user
     * @return Boolean
     */
    fun create(user: User): Response<Long>

}
