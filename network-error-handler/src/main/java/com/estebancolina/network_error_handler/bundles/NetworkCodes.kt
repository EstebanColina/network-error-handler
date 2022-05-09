package com.estebancolina.network_error_handler.bundles

import android.content.Context
import com.estebancolina.network_error_handler.ErrorMsgPair
import com.estebancolina.network_error_handler.R

object NetworkCodes: ErrorMessagesBundle {
    override fun get(msg: String?, context: Context): ErrorMsgPair? {
        return when (msg) {
            null -> { null }
            "400" -> { ErrorMsgPair(
                originalErrorMsg = "400", localizedErrorMsg = context.getString(
                    R.string.http400
                )
            ) }
            "401" -> { ErrorMsgPair(
                originalErrorMsg = "401", localizedErrorMsg = context.getString(
                    R.string.http401
                )
            ) }
            "403" -> { ErrorMsgPair(
                originalErrorMsg = "403", localizedErrorMsg = context.getString(
                    R.string.http403
                )
            ) }
            "404" -> { ErrorMsgPair(
                originalErrorMsg = "404", localizedErrorMsg = context.getString(
                    R.string.http404
                )
            ) }
            "405" -> { ErrorMsgPair(
                originalErrorMsg = "400", localizedErrorMsg = context.getString(
                    R.string.http405
                )
            ) }
            "406" -> { ErrorMsgPair(
                originalErrorMsg = "406", localizedErrorMsg = context.getString(
                    R.string.http406
                )
            ) }
            "407" -> { ErrorMsgPair(
                originalErrorMsg = "407", localizedErrorMsg = context.getString(
                    R.string.http407
                )
            ) }
            "408" -> { ErrorMsgPair(
                originalErrorMsg = "408", localizedErrorMsg = context.getString(
                    R.string.http408
                )
            ) }
            "409" -> { ErrorMsgPair(
                originalErrorMsg = "409", localizedErrorMsg = context.getString(
                    R.string.http409
                )
            ) }
            "410" -> { ErrorMsgPair(
                originalErrorMsg = "410", localizedErrorMsg = context.getString(
                    R.string.http410
                )
            ) }
            "411" -> { ErrorMsgPair(
                originalErrorMsg = "411", localizedErrorMsg = context.getString(
                    R.string.http411
                )
            ) }
            "412" -> { ErrorMsgPair(
                originalErrorMsg = "412", localizedErrorMsg = context.getString(
                    R.string.http412
                )
            ) }
            "413" -> { ErrorMsgPair(
                originalErrorMsg = "413", localizedErrorMsg = context.getString(
                    R.string.http413
                )
            ) }
            "414" -> { ErrorMsgPair(
                originalErrorMsg = "414", localizedErrorMsg = context.getString(
                    R.string.http414
                )
            ) }
            "415" -> { ErrorMsgPair(
                originalErrorMsg = "415", localizedErrorMsg = context.getString(
                    R.string.http415
                )
            ) }
            "416" -> { ErrorMsgPair(
                originalErrorMsg = "416", localizedErrorMsg = context.getString(
                    R.string.http416
                )
            ) }
            "417" -> { ErrorMsgPair(
                originalErrorMsg = "417", localizedErrorMsg = context.getString(
                    R.string.http417
                )
            ) }
            "418" -> { ErrorMsgPair(
                originalErrorMsg = "418", localizedErrorMsg = context.getString(
                    R.string.http418
                )
            ) }
            "422" -> { ErrorMsgPair(
                originalErrorMsg = "422", localizedErrorMsg = context.getString(
                    R.string.http422
                )
            ) }
            "426" -> { ErrorMsgPair(
                originalErrorMsg = "426", localizedErrorMsg = context.getString(
                    R.string.http426
                )
            ) }
            "428" -> { ErrorMsgPair(
                originalErrorMsg = "428", localizedErrorMsg = context.getString(
                    R.string.http428
                )
            ) }
            "429" -> { ErrorMsgPair(
                originalErrorMsg = "429", localizedErrorMsg = context.getString(
                    R.string.http429
                )
            ) }
            "431" -> { ErrorMsgPair(
                originalErrorMsg = "431", localizedErrorMsg = context.getString(
                    R.string.http431
                )
            ) }
            "451" -> { ErrorMsgPair(
                originalErrorMsg = "451", localizedErrorMsg = context.getString(
                    R.string.http451
                )
            ) }
            "500" -> { ErrorMsgPair(
                originalErrorMsg = "500", localizedErrorMsg = context.getString(
                    R.string.http500
                )
            ) }
            "501" -> { ErrorMsgPair(
                originalErrorMsg = "501", localizedErrorMsg = context.getString(
                    R.string.http501
                )
            ) }
            "502" -> { ErrorMsgPair(
                originalErrorMsg = "503", localizedErrorMsg = context.getString(
                    R.string.http502
                )
            ) }
            "503" -> { ErrorMsgPair(
                originalErrorMsg = "503", localizedErrorMsg = context.getString(
                    R.string.http503
                )
            ) }
            "504" -> { ErrorMsgPair(
                originalErrorMsg = "504", localizedErrorMsg = context.getString(
                    R.string.http504
                )
            ) }
            "505" -> { ErrorMsgPair(
                originalErrorMsg = "505", localizedErrorMsg = context.getString(
                    R.string.http505
                )
            ) }
            "506" -> { ErrorMsgPair(
                originalErrorMsg = "506", localizedErrorMsg = context.getString(
                    R.string.http506
                )
            ) }
            "507" -> { ErrorMsgPair(
                originalErrorMsg = "507", localizedErrorMsg = context.getString(
                    R.string.http507
                )
            ) }
            "508" -> { ErrorMsgPair(
                originalErrorMsg = "508", localizedErrorMsg = context.getString(
                    R.string.http508
                )
            ) }
            "510" -> { ErrorMsgPair(
                originalErrorMsg = "510", localizedErrorMsg = context.getString(
                    R.string.http510
                )
            ) }
            "511" -> { ErrorMsgPair(
                originalErrorMsg = "511", localizedErrorMsg = context.getString(
                    R.string.http511
                )
            ) }
            else -> {null}
        }
    }
}