package jvmartinez.com.ui.login

import dagger.Module
import dagger.Provides

/**
 * @author Juan Martinez
 */

@Module
class LoginActivityModule {

    @Provides
    internal fun provideLoginView(loginActivity: LoginActivity): LoginInterface.view = loginActivity

    @Provides
    internal fun provideLoginPresenter(presenter: LoginPresenter<LoginInterface.view>):
            LoginInterface.presenter<LoginInterface.view> = presenter

}
