package com.github.hykes.demo.common

import java.io.Serializable

/**
 * @author hehaiyangwork@gmail.com
 * @date 2018/5/9
 */
data class Response<T> constructor (
        /**
         * 调用是否成功
         */
        var success: Boolean,

        /**
         * 如果success = true,则通过result可以获得调用结果
         */
        var result: T?,

        /**
         * 如果success = false,则通过error可以查看错误信息
         */
        var error: String?

): Serializable {

        constructor(): this(false, null, null)

        companion object {

                fun <T> ok(data: T?): Response<T> {
                        var resp: Response<T> = Response()
                        resp.success = true
                        resp.result = data
                        return resp
                }

                fun <T> ok(): Response<T> {
                        return ok(null)
                }

                fun <T> fail(error: String): Response<T> {
                        var resp: Response<T> = Response()
                        resp.success = false
                        resp.error = error
                        return resp;
                }
        }

}