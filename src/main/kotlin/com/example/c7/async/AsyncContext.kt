package com.example.c7.async

import kotlin.coroutines.experimental.AbstractCoroutineContextElement
import kotlin.coroutines.experimental.Continuation
import kotlin.coroutines.experimental.ContinuationInterceptor

/**
 * 描    述：
 * 作    者：liyx@13322.com
 * 时    间：2018/5/3
 */


class AsyncContext: AbstractCoroutineContextElement(ContinuationInterceptor), ContinuationInterceptor {

    override fun <T> interceptContinuation(continuation: Continuation<T>): Continuation<T> {

        return UiContinuationWrapper(continuation.context.fold(continuation){

            continuation, element ->

            if(element != this && element is ContinuationInterceptor){
                element.interceptContinuation(continuation)
            }else continuation
        })
    }

}