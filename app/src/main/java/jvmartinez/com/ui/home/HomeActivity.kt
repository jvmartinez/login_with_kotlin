package jvmartinez.com.ui.home


import android.os.Bundle
import jvmartinez.com.ui.base.BaseActivity
import jvmartinez.com.ui.login.R
import javax.inject.Inject

class HomeActivity :  BaseActivity(), HomeInterface.View {

    @Inject
    private lateinit var presenter: HomePresenter<HomeInterface.View>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun getLayoutId(): Int {
        return R.layout.activity_main
    }

    override fun setUp() {

    }
}
