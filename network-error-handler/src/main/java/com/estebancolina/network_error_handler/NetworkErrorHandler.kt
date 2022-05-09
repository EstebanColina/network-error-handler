package com.estebancolina.network_error_handler

import android.content.Context
import com.estebancolina.network_error_handler.bundles.ErrorMessagesBundle
import com.estebancolina.network_error_handler.bundles.NetworkCodes
import com.estebancolina.network_error_handler.bundles.NetworkMsg

class NetworkErrorHandler(context: Context, listOfErrorMessageBundles: List<ErrorMessagesBundle> = listOf(NetworkCodes,NetworkMsg)) {
    private val rContext = context
    private val handlers = listOfErrorMessageBundles

   fun getErrorStringResource(errorMsg: String?, defaultMsg: String? = null): ErrorMsgPair {
       for (element in handlers){
           val rMsg = element.get(msg = errorMsg, context = rContext)
           if (rMsg != null){
               return rMsg
           }
       }
       return ErrorMsgPair(
           originalErrorMsg = errorMsg,
           localizedErrorMsg = defaultMsg ?: rContext.getString(R.string.http_default)
       )
   }

}

data class ErrorMsgPair(
    val originalErrorMsg: String?,
    val localizedErrorMsg: String
)