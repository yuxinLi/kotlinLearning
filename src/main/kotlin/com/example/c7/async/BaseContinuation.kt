package com.example.c7.async

import kotlin.coroutines.experimental.Continuation
import kotlin.coroutines.experimental.CoroutineContext
import kotlin.coroutines.experimental.EmptyCoroutineContext

/**
 * 描    述：
 * 作    者：liyx@13322.com
 * 时    间：2018/5/3
 */

class BaseContinuation : Continuation<Unit>{

    override val context: CoroutineContext = EmptyCoroutineContext

    override fun resume(value: Unit) {
    }

    override fun resumeWithException(exception: Throwable) {
    }

}