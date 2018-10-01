package jvmartinez.com.ui.login

import dagger.Binds
import dagger.Module
import dagger.Provides

/**
 * @author Juan Martinez
 */

@Module
abstract class LoginActivityModule {

    @Binds
    abstract fun provideLoginView(loginActivity: LoginActivity): LoginInterface.view

    @Binds
    abstract fun provideLoginPresenter(presenter: LoginPresenter<LoginInterface.view>):
            LoginInterface.presenter<LoginInterface.view>

}
