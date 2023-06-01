package com.study.hilt

import android.app.Application
import android.content.Context
import androidx.lifecycle.LifecycleObserver
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Inject

/**
 * @HiltAndroidApp : Hilt 컴포넌트의 코드 생성과 컴포넌트를 사용하는 Application의 기본 클래스를 생성
 **/
@HiltAndroidApp
class MyApplication : Application(), LifecycleObserver {

    companion object {
        private const val TAG = "MyApplication"
        private var instance: MyApplication? = null
        val applicationContext: Context get() = instance!!.applicationContext
        var isAppOnForeground = false
    }

    init {
        instance = this
    }

    override fun onCreate() {
        super.onCreate()
    }
}