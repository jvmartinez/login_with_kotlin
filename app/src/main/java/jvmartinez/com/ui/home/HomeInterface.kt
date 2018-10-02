package jvmartinez.com.ui.home

import jvmartinez.com.ui.base.IBasePresenter
import jvmartinez.com.ui.base.IBaseView

interface HomeInterface {
    
    interface View : IBaseView {

    }

    interface presenter<V: View>: IBasePresenter<V> {

    }
}