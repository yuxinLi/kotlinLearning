package com.example.c7.async

import com.example.c7.common.HttpError
import com.example.c7.common.HttpException
import com.example.c7.common.HttpService
import com.example.c7.common.log
import kotlin.coroutines.experimental.CoroutineContext
import kotlin.coroutines.experimental.EmptyCoroutineContext
import kotlin.coroutines.experimental.startCoroutine
import kotlin.coroutines.experimental.suspendCoroutine

/**
 * 描    述：
 * 作    者：liyx@13322.com
 * 时    间：2018/5/3
 */


fun startC2(context: CoroutineContext = EmptyCoroutineContext, block: suspend () -> Unit) {
    block.startCoroutine(ContextContinuation(context + AsyncContext()))
}

suspend fun <T> time(block: CoroutineContext.() -> T)
        = suspendCoroutine<T> { continuation ->
    log("异步任务开始前")

    AsyncTask {
        try {
            continuation.resume(block(continuation.context))
        } catch (e: Exception) {
            continuation.resumeWithException(e)
        }
    }.execute()

}

fun loading2(url: String): ByteArray{
    log("异步任务开始前")
    log("耗时操作，下载图片")

    val responsBody = HttpService.service.getLogo(url).execute()
    if(responsBody.isSuccessful){
        responsBody.body()?.byteStream()?.readBytes()?.let{
            return it
        }
        throw HttpException(HttpError.HTTP_ERROR_NO_DATA)
    }else{
        throw HttpException(responsBody.code())
    }


}