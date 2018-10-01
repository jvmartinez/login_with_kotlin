package jvmartinez.com.core.Di.Module

import android.app.Application
import android.content.Context
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * @author Juan Martinez
 */

@Module
class AppModule{

    @Provides
    @Singleton
    internal fun provideContext(application: Application): Context = application
}