package jvmartinez.com.ui.login

import jvmartinez.com.ui.base.BasePresenter
import javax.inject.Inject

/**
 * @author Juan Martinez
 */

class LoginPresenter<V: LoginInterface.view> @Inject internal constructor() : BasePresenter<V>(), LoginInterface.presenter<V> {


    override fun emailTextChange(charSequence: CharSequence) {

    }

    override fun passwordTextChange(charSequence: CharSequence) {

    }

    override fun verifyLogin(email: String, password: String) {

        getView()?.hideKeyboard()
        if (email.equals("prueba") && password.equals("123456")) {
            getView()?.showHome()
        }
    }
}