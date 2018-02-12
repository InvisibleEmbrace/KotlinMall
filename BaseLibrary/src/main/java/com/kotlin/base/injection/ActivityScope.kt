package com.kotlin.base.injection

import java.lang.annotation.Documented
import java.lang.annotation.Retention
import javax.inject.Scope
import java.lang.annotation.RetentionPolicy.RUNTIME

/**
 * Created by Administrator on 2018/2/12/012.
 */
@Scope
@Documented
@Retention(RUNTIME)
annotation class ActivityScope