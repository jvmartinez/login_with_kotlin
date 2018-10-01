package jvmartinez.com.core.Di.Component

import android.app.Application
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import jvmartinez.com.core.Di.Builder.ActivityBuilder
import jvmartinez.com.core.Di.Module.AppModule
import jvmartinez.com.ui.login.App
import javax.inject.Singleton

/**
 * @author Juan Martinez
 */

@Singleton
@Component(
        modules = [
            (AndroidInjectionModule::class),
            (AppModule::class),
            (ActivityBuilder::class)
        ]
)

interface AppComponent {
   @Component.Builder
    interface Builder {

        @BindsInstance
        fun application(application: Application): Builder

        fun build(): AppComponent
    }

    fun inject(app: App)
}
