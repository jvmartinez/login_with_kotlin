package jvmartinez.com.ui.login

import jvmartinez.com.ui.base.IBasePresenter
import jvmartinez.com.ui.base.IBaseView

/**
 * @author Juan Martinez
 */

interface LoginInterface {

    interface view :  IBaseView {
        fun toggleButtonState(isEnable: Boolean)
        fun showHome()
    }

    interface presenter<V: view>: IBasePresenter<V> {
        fun emailTextChange(charSequence: CharSequence)
        fun passwordTextChange(charSequence: CharSequence)
        fun verifyLogin(email: String, password: String)
    }
}

