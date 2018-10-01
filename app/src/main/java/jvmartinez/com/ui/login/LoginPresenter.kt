package jvmartinez.com.ui.login

import android.util.Log
import jvmartinez.com.ui.base.BasePresenter
import javax.inject.Inject

/**
 * @author Juan Martinez
 */

class LoginPresenter<V: LoginInterface.view> @Inject internal constructor(private var view: V) : BasePresenter<V>(), LoginInterface.presenter<V> {
//    private lateinit var view: LoginInterface.view
    private var email: String = ""
    private var password: String = ""

    override fun onAttch(view: V?) {
        super.onAttch(view)
        this.view?.toggleButtonState(false)
    }

    override fun emailTextChange(charSequence: String) {
        email = charSequence
        view?.toggleButtonState(!charSequence.isEmpty() && !password.isEmpty())
    }

    override fun passwordTextChange(charSequence: String) {
        password = charSequence
        view?.toggleButtonState(!charSequence.isEmpty() && !email.isEmpty())
    }

    override fun verifyLogin(email: String, password: String) {
        if (email == "prueba@prueba.com" && password == "123456") {
            getView()?.showHome()
        } else {
            getView()?.showMessage(R.string.error_login)
        }
    }
}