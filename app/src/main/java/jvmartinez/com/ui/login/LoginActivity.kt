package jvmartinez.com.ui.login

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import dagger.android.AndroidInjection
import jvmartinez.com.ui.base.BaseActivity
import javax.inject.Inject
import android.text.Editable
import android.text.TextWatcher


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
        return R.layout.activity_login
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AndroidInjection.inject(this)
        setContentView(R.layout.activity_login)
        this.btnSignIn = findViewById(R.id.btn_signIn)
        this.txtEmail = findViewById(R.id.txt_email)
        this.txtPassword = findViewById(R.id.txt_password)
        presenter.onAttch(this)
        startActionListener()
    }

    override fun toggleButtonState(isEnable: Boolean) {
        btnSignIn.isEnabled = isEnable
    }

    fun startActionListener() {
        btnSignIn.setOnClickListener(this)
        txtEmail.addTextChangedListener(onEmailTextChanged)
        txtPassword.addTextChangedListener(onPasswordTextChanged)
    }

    private val onEmailTextChanged = object : TextWatcher {
        override fun beforeTextChanged(charSequence: CharSequence, i: Int, i1: Int, i2: Int) {

        }

        override fun onTextChanged(charSequence: CharSequence, i: Int, i1: Int, i2: Int) {
            presenter.emailTextChange(charSequence.toString())
        }

        override fun afterTextChanged(editable: Editable) {

        }
    }

    private val onPasswordTextChanged = object : TextWatcher {
        override fun beforeTextChanged(charSequence: CharSequence, i: Int, i1: Int, i2: Int) {

        }

        override fun onTextChanged(charSequence: CharSequence, i: Int, i1: Int, i2: Int) {
            presenter.passwordTextChange(charSequence.toString())
        }

        override fun afterTextChanged(editable: Editable) {

        }
    }

    override fun onClick(v: View?) {
            when (v?.id) {
                R.id.btn_signIn -> {
                    hideKeyboard()
                    presenter.verifyLogin(txtEmail.text.toString(), txtPassword.text.toString())
                }
            }
    }

    override fun showHome() {
        Intent(this, LoginActivity::class.java)
    }
}
