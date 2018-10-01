package jvmartinez.com.ui.base

import android.app.AlertDialog
import android.content.Context
import android.os.Bundle
import android.os.PersistableBundle
import android.support.annotation.LayoutRes
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.content.DialogInterface
import android.system.Os.accept
import jvmartinez.com.ui.login.R


/**
 * @author Juan Martinez
 */

abstract class BaseActivity : AppCompatActivity(), IBaseView {

    @LayoutRes
    abstract fun getLayoutId(): Int

    protected abstract fun setUp()

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(this.getLayoutId())
        setUp()

    }

    override fun showLoading() {

    }

    override fun hideLoading() {

    }

    override fun hideKeyboard() {
        val view: View? = currentFocus
        if(view == null) {
            var im: InputMethodManager = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            im?.hideSoftInputFromInputMethod(view, 0)
        }
    }

    override fun showMessage(message: Int) {
        val builder = AlertDialog.Builder(this)
        builder.setCancelable(false)
        builder.setMessage(getString(message))
                .setPositiveButton(R.string.accept, {dialog, which -> dialog.dismiss() })
        builder.create().show()
    }
}