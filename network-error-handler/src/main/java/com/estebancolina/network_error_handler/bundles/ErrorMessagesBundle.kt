package com.estebancolina.network_error_handler.bundles

import android.content.Context
import com.estebancolina.network_error_handler.ErrorMsgPair

interface ErrorMessagesBundle {
    fun get(msg: String?, context: Context): ErrorMsgPair?
}