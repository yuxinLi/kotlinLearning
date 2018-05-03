package com.example.c7.async

import java.util.concurrent.Executors

/**
 * 描    述：
 * 作    者：liyx@13322.com
 * 时    间：2018/5/3
 */

private val pool by lazy {
    Executors.newCachedThreadPool()
}

class AsyncTask(val block:() -> Unit){
    fun execute() = pool.execute(block)
}