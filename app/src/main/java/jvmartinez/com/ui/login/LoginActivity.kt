package jvmartinez.com.ui.login

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import dagger.android.AndroidInjection
import jvmartinez.com.ui.base.BaseActivity
import javax.inject.Inject

/**
 * @author Juan Martinez
 */

class LoginActivity : BaseActivity(), LoginInterface.view, View.OnClickListener {

    private lateinit var txtEmail: EditText
    private lateinit var txtPassword: EditText
    private lateinit var btnSignIn: Button

    @Inject
    internal lateinit var presenter: LoginInterface.presenter<LoginInterface.view>

    override fun setUp() {
        startActionListener()
    }

    override fun getLayoutId(): Int {
        return R.layout.activity_main
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AndroidInjection.inject(this)
        setContentView(R.layout.activity_main)
        presenter.onAttch(this)
    }

    override fun toggleButtonState(isEnable: Boolean) {
        btnSignIn.isEnabled = isEnable
    }

    fun startActionListener() {
        btnSignIn.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (v != null) {
            when (v.id) {
                R.id.btn_signIn -> {
                    presenter.verifyLogin(txtEmail.text.toString(), txtPassword.text.toString())
                }
            }
        }
    }

    override fun showHome() {

    }
}
