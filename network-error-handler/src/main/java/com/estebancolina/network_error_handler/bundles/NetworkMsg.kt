package com.estebancolina.network_error_handler.bundles

import android.content.Context
import com.estebancolina.network_error_handler.ErrorMsgPair
import com.estebancolina.network_error_handler.R

object NetworkMsg: ErrorMessagesBundle {
    override fun get(msg: String?, context: Context): ErrorMsgPair? {
        return when {
            msg == null -> { null }
            msg.contains("Bad Request", true) -> { ErrorMsgPair( originalErrorMsg = msg, localizedErrorMsg = context.getString(
                R.string.http400) ) }
            msg.contains("Unauthorized", true) -> { ErrorMsgPair( originalErrorMsg = msg, localizedErrorMsg = context.getString(
                R.string.http401) ) }
            msg.contains("Forbidden", true) -> { ErrorMsgPair( originalErrorMsg = msg, localizedErrorMsg = context.getString(
                R.string.http403) ) }
            msg.contains("Not Found", true) -> { ErrorMsgPair( originalErrorMsg = msg, localizedErrorMsg = context.getString(
                R.string.http404) ) }
            msg.contains("Method Not Allowed", true) -> { ErrorMsgPair( originalErrorMsg = msg, localizedErrorMsg = context.getString(
                R.string.http405) ) }
            msg.contains("Not Acceptable", true) -> { ErrorMsgPair( originalErrorMsg = msg, localizedErrorMsg = context.getString(
                R.string.http406) ) }
            msg.contains("Proxy Authentication Required", true) -> { ErrorMsgPair( originalErrorMsg = msg, localizedErrorMsg = context.getString(
                R.string.http407) ) }
            msg.contains("Request Timeout", true) -> { ErrorMsgPair( originalErrorMsg = msg, localizedErrorMsg = context.getString(
                R.string.http408) ) }
            msg.contains("Conflict", true) -> { ErrorMsgPair( originalErrorMsg = msg, localizedErrorMsg = context.getString(
                R.string.http409) ) }
            msg.contains("Gone", true) -> { ErrorMsgPair( originalErrorMsg = msg, localizedErrorMsg = context.getString(
                R.string.http410) ) }
            msg.contains("Length Required", true) -> { ErrorMsgPair( originalErrorMsg = msg, localizedErrorMsg = context.getString(
                R.string.http411) ) }
            msg.contains("Precondition Failed", true) -> { ErrorMsgPair( originalErrorMsg = msg, localizedErrorMsg = context.getString(
                R.string.http412) ) }
            msg.contains("Payload Too Large", true) -> { ErrorMsgPair( originalErrorMsg = msg, localizedErrorMsg = context.getString(
                R.string.http413) ) }
            msg.contains("URI Too Large", true) -> { ErrorMsgPair( originalErrorMsg = msg, localizedErrorMsg = context.getString(
                R.string.http414) ) }
            msg.contains("Unsupported Media Type", true) -> { ErrorMsgPair( originalErrorMsg = msg, localizedErrorMsg = context.getString(
                R.string.http415) ) }
            msg.contains("Requested Range Not Satisfiable", true) -> { ErrorMsgPair( originalErrorMsg = msg, localizedErrorMsg = context.getString(
                R.string.http416) ) }
            msg.contains("Expectation Failed", true) -> { ErrorMsgPair( originalErrorMsg = msg, localizedErrorMsg = context.getString(
                R.string.http417) ) }
            msg.contains("I'm a teapot", true) -> { ErrorMsgPair( originalErrorMsg = msg, localizedErrorMsg = context.getString(
                R.string.http418) ) }
            msg.contains("Unprocessable Entity", true) -> { ErrorMsgPair( originalErrorMsg = msg, localizedErrorMsg = context.getString(
                R.string.http422) ) }
            msg.contains("Upgrade Required", true) -> { ErrorMsgPair( originalErrorMsg = msg, localizedErrorMsg = context.getString(
                R.string.http426) ) }
            msg.contains("Precondition Required", true) -> { ErrorMsgPair( originalErrorMsg = msg, localizedErrorMsg = context.getString(
                R.string.http428) ) }
            msg.contains("Too Many Request", true) -> { ErrorMsgPair( originalErrorMsg = msg, localizedErrorMsg = context.getString(
                R.string.http429) ) }
            msg.contains("Request Header Fields Too Large", true) -> { ErrorMsgPair( originalErrorMsg = msg, localizedErrorMsg = context.getString(
                R.string.http431) ) }
            msg.contains("Unavailable For Legal Reasons", true) -> { ErrorMsgPair( originalErrorMsg = msg, localizedErrorMsg = context.getString(
                R.string.http451) ) }
            msg.contains("Internal Server Error", true) -> { ErrorMsgPair( originalErrorMsg = msg, localizedErrorMsg = context.getString(
                R.string.http500) ) }
            msg.contains("Not Implemented", true) -> { ErrorMsgPair( originalErrorMsg = msg, localizedErrorMsg = context.getString(
                R.string.http501) ) }
            msg.contains("Bad Gateway", true) -> { ErrorMsgPair( originalErrorMsg = msg, localizedErrorMsg = context.getString(
                R.string.http502) ) }
            msg.contains("Service Unavailable", true) -> { ErrorMsgPair( originalErrorMsg = msg, localizedErrorMsg = context.getString(
                R.string.http503) ) }
            msg.contains("Gateway Timeout", true) -> { ErrorMsgPair( originalErrorMsg = msg, localizedErrorMsg = context.getString(
                R.string.http504) ) }
            msg.contains("HTTP Version Not Supported", true) -> { ErrorMsgPair( originalErrorMsg = msg, localizedErrorMsg = context.getString(
                R.string.http505) ) }
            msg.contains("Variant Also Negotiates", true) -> { ErrorMsgPair( originalErrorMsg = msg, localizedErrorMsg = context.getString(
                R.string.http506) ) }
            msg.contains("Insufficient Storage", true) -> { ErrorMsgPair( originalErrorMsg = msg, localizedErrorMsg = context.getString(
                R.string.http507) ) }
            msg.contains("Loop Detected", true) -> { ErrorMsgPair( originalErrorMsg = msg, localizedErrorMsg = context.getString(
                R.string.http508) ) }
            msg.contains("Not Extended", true) -> { ErrorMsgPair( originalErrorMsg = msg, localizedErrorMsg = context.getString(
                R.string.http510) ) }
            msg.contains("Network Authentication Required", true) -> { ErrorMsgPair( originalErrorMsg = msg, localizedErrorMsg = context.getString(
                R.string.http511) ) }
            else -> {null}
        }
    }
}