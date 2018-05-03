package com.example.c7.basic

import com.example.c7.common.HttpException
import com.example.c7.common.HttpService
import com.example.c7.common.log
import kotlin.coroutines.experimental.startCoroutine
import kotlin.coroutines.experimental.suspendCoroutine

/**
 * 描    述：
 * 作    者：liyx@13322.com
 * 时    间：2018/5/3
 */

fun startC(block : suspend ()->Unit){
    block.startCoroutine(BaseContinuation())
}

suspend fun loading(url: String) = suspendCoroutine<ByteArray> {
    continuation ->
    log(" start loading , continuation = "+ continuation)

    val responseBody = HttpService.service.getLogo(url).execute()
    if(responseBody.isSuccessful){
        responseBody.body()?.byteStream()?.readBytes()?.let { continuation.resume(it) }
    }else{
        continuation.resumeWithException(HttpException(responseBody.code()))
    }

}