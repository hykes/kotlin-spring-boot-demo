package com.github.hykes.demo.dao

import com.github.hykes.demo.model.User
import org.mybatis.spring.SqlSessionTemplate
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Repository
import java.util.*

/**
 * @author hehaiyangwork@gmail.com
 * @date 2018-05-16 11:12:40
 * Created by CodeGen .
 */
@Repository
class UserDao {

    @Autowired
    lateinit var sqlSessionTemplate: SqlSessionTemplate

    fun findById(id: Long?) : User? {
        if (Objects.isNull(id)) {
            return null
        }
        return this.sqlSessionTemplate.selectOne("User.findById", id)
    }

    fun create(user: User): Boolean {
        return this.sqlSessionTemplate.insert("User.create", user) == 1
    }

}
