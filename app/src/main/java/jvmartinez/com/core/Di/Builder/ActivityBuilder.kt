package jvmartinez.com.core.Di.Builder

import dagger.Module
import dagger.android.ContributesAndroidInjector
import jvmartinez.com.ui.login.LoginActivity
import jvmartinez.com.ui.login.LoginActivityModule

/**
 * @author Juan Martinez
 */

@Module
abstract class ActivityBuilder {

    @ContributesAndroidInjector(modules = [LoginActivityModule::class])
    abstract fun bindLoginActivity(): LoginActivity
}