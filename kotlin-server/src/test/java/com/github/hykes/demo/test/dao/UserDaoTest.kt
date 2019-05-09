package com.github.hykes.demo.test.dao

import com.github.hykes.demo.dao.UserDao
import com.github.hykes.demo.model.User
import com.github.hykes.demo.test.BaseDaoTest
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.springframework.beans.factory.annotation.Autowired

/**
 * 单元测试
 *
 * @author hehaiyangwork@gmail.com
 * @date 2018-04-23 11:17:51
 */
class UserDaoTest: BaseDaoTest() {

    @Autowired
    lateinit var userDao: UserDao

    var user: User = User()

    @Before
    fun setUp() {
        user = User()
        user?.name = "hykes"
        user?.companyId = 1
        user?.status = 1
        userDao.create(user)
    }

    @Test
    fun testFindById() {
        var actual: User? = userDao.findById(user.id)
        Assert.assertNotNull(actual)
    }

}
