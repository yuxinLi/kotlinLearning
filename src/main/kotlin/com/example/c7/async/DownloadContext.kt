package com.example.c7.async

import kotlin.coroutines.experimental.AbstractCoroutineContextElement
import kotlin.coroutines.experimental.CoroutineContext

/**
 * 描    述：
 * 作    者：liyx@13322.com
 * 时    间：2018/5/3
 */

class DownloadContext(val url:String): AbstractCoroutineContextElement(Key){

    companion object Key: CoroutineContext.Key<DownloadContext>
}