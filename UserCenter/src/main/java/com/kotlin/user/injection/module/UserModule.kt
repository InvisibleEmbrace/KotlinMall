package com.kotlin.user.injection.module

import com.kotlin.user.service.UserService
import com.kotlin.user.service.impl.UserServiceImpl
import dagger.Module
import dagger.Provides

/**
 * Created by Administrator on 2018/2/12/012.
 */

@Module
class UserModule {

    @Provides
    fun providesUserService(service: UserServiceImpl): UserService {
        return service
    }

}