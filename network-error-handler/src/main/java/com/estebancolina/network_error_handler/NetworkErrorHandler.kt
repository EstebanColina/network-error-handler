package com.estebancolina.network_error_handler

import android.content.Context

class NetworkErrorHandler(context: Context) {
    private val rContext = context

    fun getMsg(httpCode: Int, customHandler: ((errorMsg: Int) -> (ErrorMsgPair))? = null): ErrorMsgPair{
        return when (httpCode){
            400 -> { ErrorMsgPair( originalErrorMsg = "400", localizedErrorMsg = rContext.getString(R.string.http400) ) }
            401 -> { ErrorMsgPair( originalErrorMsg = "401", localizedErrorMsg = rContext.getString(R.string.http401) ) }
            403 -> { ErrorMsgPair( originalErrorMsg = "403", localizedErrorMsg = rContext.getString(R.string.http403) ) }
            404 -> { ErrorMsgPair( originalErrorMsg = "404", localizedErrorMsg = rContext.getString(R.string.http404) ) }
            405 -> { ErrorMsgPair( originalErrorMsg = "400", localizedErrorMsg = rContext.getString(R.string.http405) ) }
            406 -> { ErrorMsgPair( originalErrorMsg = "406", localizedErrorMsg = rContext.getString(R.string.http406) ) }
            407 -> { ErrorMsgPair( originalErrorMsg = "407", localizedErrorMsg = rContext.getString(R.string.http407) ) }
            408 -> { ErrorMsgPair( originalErrorMsg = "408", localizedErrorMsg = rContext.getString(R.string.http408) ) }
            409 -> { ErrorMsgPair( originalErrorMsg = "409", localizedErrorMsg = rContext.getString(R.string.http409) ) }
            410 -> { ErrorMsgPair( originalErrorMsg = "410", localizedErrorMsg = rContext.getString(R.string.http410) ) }
            411 -> { ErrorMsgPair( originalErrorMsg = "411", localizedErrorMsg = rContext.getString(R.string.http411) ) }
            412 -> { ErrorMsgPair( originalErrorMsg = "412", localizedErrorMsg = rContext.getString(R.string.http412) ) }
            413 -> { ErrorMsgPair( originalErrorMsg = "413", localizedErrorMsg = rContext.getString(R.string.http413) ) }
            414 -> { ErrorMsgPair( originalErrorMsg = "414", localizedErrorMsg = rContext.getString(R.string.http414) ) }
            415 -> { ErrorMsgPair( originalErrorMsg = "415", localizedErrorMsg = rContext.getString(R.string.http415) ) }
            416 -> { ErrorMsgPair( originalErrorMsg = "416", localizedErrorMsg = rContext.getString(R.string.http416) ) }
            417 -> { ErrorMsgPair( originalErrorMsg = "417", localizedErrorMsg = rContext.getString(R.string.http417) ) }
            418 -> { ErrorMsgPair( originalErrorMsg = "418", localizedErrorMsg = rContext.getString(R.string.http418) ) }
            422 -> { ErrorMsgPair( originalErrorMsg = "422", localizedErrorMsg = rContext.getString(R.string.http422) ) }
            426 -> { ErrorMsgPair( originalErrorMsg = "426", localizedErrorMsg = rContext.getString(R.string.http426) ) }
            428 -> { ErrorMsgPair( originalErrorMsg = "428", localizedErrorMsg = rContext.getString(R.string.http428) ) }
            429 -> { ErrorMsgPair( originalErrorMsg = "429", localizedErrorMsg = rContext.getString(R.string.http429) ) }
            431 -> { ErrorMsgPair( originalErrorMsg = "431", localizedErrorMsg = rContext.getString(R.string.http431) ) }
            451 -> { ErrorMsgPair( originalErrorMsg = "451", localizedErrorMsg = rContext.getString(R.string.http451) ) }
            500 -> { ErrorMsgPair( originalErrorMsg = "500", localizedErrorMsg = rContext.getString(R.string.http500) ) }
            501 -> { ErrorMsgPair( originalErrorMsg = "501", localizedErrorMsg = rContext.getString(R.string.http501) ) }
            502 -> { ErrorMsgPair( originalErrorMsg = "503", localizedErrorMsg = rContext.getString(R.string.http502) ) }
            503 -> { ErrorMsgPair( originalErrorMsg = "503", localizedErrorMsg = rContext.getString(R.string.http503) ) }
            504 -> { ErrorMsgPair( originalErrorMsg = "504", localizedErrorMsg = rContext.getString(R.string.http504) ) }
            505 -> { ErrorMsgPair( originalErrorMsg = "505", localizedErrorMsg = rContext.getString(R.string.http505) ) }
            506 -> { ErrorMsgPair( originalErrorMsg = "506", localizedErrorMsg = rContext.getString(R.string.http506) ) }
            507 -> { ErrorMsgPair( originalErrorMsg = "507", localizedErrorMsg = rContext.getString(R.string.http507) ) }
            508 -> { ErrorMsgPair( originalErrorMsg = "508", localizedErrorMsg = rContext.getString(R.string.http508) ) }
            510 -> { ErrorMsgPair( originalErrorMsg = "510", localizedErrorMsg = rContext.getString(R.string.http510) ) }
            511 -> { ErrorMsgPair( originalErrorMsg = "511", localizedErrorMsg = rContext.getString(R.string.http511) ) }
            else -> {
                if (customHandler == null){
                    ErrorMsgPair(
                        "$httpCode" , rContext.getString(R.string.http_default)
                    )
                } else {
                    customHandler(
                        httpCode
                    )
                }
            }
        }
    }

    fun getMsg(msg: String?, customHandler: ((errorMsg: String?) -> (ErrorMsgPair))? = null): ErrorMsgPair{
        val lowercaseMsg = msg?.lowercase()
        return when {
            lowercaseMsg == null -> {
                if (customHandler == null){
                    ErrorMsgPair(
                        msg, rContext.getString(R.string.http_default)
                    )
                } else {
                    customHandler(
                        msg
                    )
                }
            }
            lowercaseMsg.contains("Bad Request", true) -> { ErrorMsgPair( originalErrorMsg = msg, localizedErrorMsg = rContext.getString(R.string.http400) ) }
            lowercaseMsg.contains("Unauthorized", true) -> { ErrorMsgPair( originalErrorMsg = msg, localizedErrorMsg = rContext.getString(R.string.http401) ) }
            lowercaseMsg.contains("Forbidden", true) -> { ErrorMsgPair( originalErrorMsg = msg, localizedErrorMsg = rContext.getString(R.string.http403) ) }
            lowercaseMsg.contains("Not Found", true) -> { ErrorMsgPair( originalErrorMsg = msg, localizedErrorMsg = rContext.getString(R.string.http404) ) }
            lowercaseMsg.contains("Method Not Allowed", true) -> { ErrorMsgPair( originalErrorMsg = msg, localizedErrorMsg = rContext.getString(R.string.http405) ) }
            lowercaseMsg.contains("Not Acceptable", true) -> { ErrorMsgPair( originalErrorMsg = msg, localizedErrorMsg = rContext.getString(R.string.http406) ) }
            lowercaseMsg.contains("Proxy Authentication Required", true) -> { ErrorMsgPair( originalErrorMsg = msg, localizedErrorMsg = rContext.getString(R.string.http407) ) }
            lowercaseMsg.contains("Request Timeout", true) -> { ErrorMsgPair( originalErrorMsg = msg, localizedErrorMsg = rContext.getString(R.string.http408) ) }
            lowercaseMsg.contains("Conflict", true) -> { ErrorMsgPair( originalErrorMsg = msg, localizedErrorMsg = rContext.getString(R.string.http409) ) }
            lowercaseMsg.contains("Gone", true) -> { ErrorMsgPair( originalErrorMsg = msg, localizedErrorMsg = rContext.getString(R.string.http410) ) }
            lowercaseMsg.contains("Length Required", true) -> { ErrorMsgPair( originalErrorMsg = msg, localizedErrorMsg = rContext.getString(R.string.http411) ) }
            lowercaseMsg.contains("Precondition Failed", true) -> { ErrorMsgPair( originalErrorMsg = msg, localizedErrorMsg = rContext.getString(R.string.http412) ) }
            lowercaseMsg.contains("Payload Too Large", true) -> { ErrorMsgPair( originalErrorMsg = msg, localizedErrorMsg = rContext.getString(R.string.http413) ) }
            lowercaseMsg.contains("URI Too Large", true) -> { ErrorMsgPair( originalErrorMsg = msg, localizedErrorMsg = rContext.getString(R.string.http414) ) }
            lowercaseMsg.contains("Unsupported Media Type", true) -> { ErrorMsgPair( originalErrorMsg = msg, localizedErrorMsg = rContext.getString(R.string.http415) ) }
            lowercaseMsg.contains("Requested Range Not Satisfiable", true) -> { ErrorMsgPair( originalErrorMsg = msg, localizedErrorMsg = rContext.getString(R.string.http416) ) }
            lowercaseMsg.contains("Expectation Failed", true) -> { ErrorMsgPair( originalErrorMsg = msg, localizedErrorMsg = rContext.getString(R.string.http417) ) }
            lowercaseMsg.contains("I'm a teapot", true) -> { ErrorMsgPair( originalErrorMsg = msg, localizedErrorMsg = rContext.getString(R.string.http418) ) }
            lowercaseMsg.contains("Unprocessable Entity", true) -> { ErrorMsgPair( originalErrorMsg = msg, localizedErrorMsg = rContext.getString(R.string.http422) ) }
            lowercaseMsg.contains("Upgrade Required", true) -> { ErrorMsgPair( originalErrorMsg = msg, localizedErrorMsg = rContext.getString(R.string.http426) ) }
            lowercaseMsg.contains("Precondition Required", true) -> { ErrorMsgPair( originalErrorMsg = msg, localizedErrorMsg = rContext.getString(R.string.http428) ) }
            lowercaseMsg.contains("Too Many Request", true) -> { ErrorMsgPair( originalErrorMsg = msg, localizedErrorMsg = rContext.getString(R.string.http429) ) }
            lowercaseMsg.contains("Request Header Fields Too Large", true) -> { ErrorMsgPair( originalErrorMsg = msg, localizedErrorMsg = rContext.getString(R.string.http431) ) }
            lowercaseMsg.contains("Unavailable For Legal Reasons", true) -> { ErrorMsgPair( originalErrorMsg = msg, localizedErrorMsg = rContext.getString(R.string.http451) ) }
            lowercaseMsg.contains("Internal Server Error", true) -> { ErrorMsgPair( originalErrorMsg = msg, localizedErrorMsg = rContext.getString(R.string.http500) ) }
            lowercaseMsg.contains("Not Implemented", true) -> { ErrorMsgPair( originalErrorMsg = msg, localizedErrorMsg = rContext.getString(R.string.http501) ) }
            lowercaseMsg.contains("Bad Gateway", true) -> { ErrorMsgPair( originalErrorMsg = msg, localizedErrorMsg = rContext.getString(R.string.http502) ) }
            lowercaseMsg.contains("Service Unavailable", true) -> { ErrorMsgPair( originalErrorMsg = msg, localizedErrorMsg = rContext.getString(R.string.http503) ) }
            lowercaseMsg.contains("Gateway Timeout", true) -> { ErrorMsgPair( originalErrorMsg = msg, localizedErrorMsg = rContext.getString(R.string.http504) ) }
            lowercaseMsg.contains("HTTP Version Not Supported", true) -> { ErrorMsgPair( originalErrorMsg = msg, localizedErrorMsg = rContext.getString(R.string.http505) ) }
            lowercaseMsg.contains("Variant Also Negotiates", true) -> { ErrorMsgPair( originalErrorMsg = msg, localizedErrorMsg = rContext.getString(R.string.http506) ) }
            lowercaseMsg.contains("Insufficient Storage", true) -> { ErrorMsgPair( originalErrorMsg = msg, localizedErrorMsg = rContext.getString(R.string.http507) ) }
            lowercaseMsg.contains("Loop Detected", true) -> { ErrorMsgPair( originalErrorMsg = msg, localizedErrorMsg = rContext.getString(R.string.http508) ) }
            lowercaseMsg.contains("Not Extended", true) -> { ErrorMsgPair( originalErrorMsg = msg, localizedErrorMsg = rContext.getString(R.string.http510) ) }
            lowercaseMsg.contains("Network Authentication Required", true) -> { ErrorMsgPair( originalErrorMsg = msg, localizedErrorMsg = rContext.getString(R.string.http511) ) }
            else -> {
                if (customHandler == null){
                    ErrorMsgPair(
                        msg, rContext.getString(R.string.http_default)
                    )
                } else {
                    customHandler(
                        msg
                    )
                }
            }
        }

    }



}

data class ErrorMsgPair(
    val originalErrorMsg: String?,
    val localizedErrorMsg: String
)