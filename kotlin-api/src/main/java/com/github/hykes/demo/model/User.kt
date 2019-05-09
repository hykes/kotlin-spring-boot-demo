package com.github.hykes.demo.model

import java.io.Serializable
import java.sql.Date

/**
 * 用户
 *
 * @author hehaiyangwork@gmail.com
 * @date 2018-05-09 15:09:15
 * Created by CodeGen .
 */
data class User (
        var id: Long?,
        var name: String?,
        var companyId: Int?,
        var status: Int?,
        var extraJson: String?,
        var createdAt: Date?,
        var updatedAt: Date?
): Serializable {

    constructor(): this(null, null, null, null, null, null, null);

}