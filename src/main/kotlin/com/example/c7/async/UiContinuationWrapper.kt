package com.example.c7.async

import javax.swing.SwingUtilities
import kotlin.coroutines.experimental.Continuation

/**
 * 描    述：
 * 作    者：liyx@13322.com
 * 时    间：2018/5/3
 */
class UiContinuationWrapper<T>(val continuation: Continuation<T>) : Continuation<T> {

    override val context = continuation.context

    override fun resume(value: T) {
        SwingUtilities.invokeLater {
            continuation.resume(value)
        }
    }

    override fun resumeWithException(exception: Throwable) {
        SwingUtilities.invokeLater {
            continuation.resumeWithException(exception)
        }
    }
}