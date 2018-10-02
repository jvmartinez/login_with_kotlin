package jvmartinez.com.ui.home

import jvmartinez.com.ui.base.BasePresenter
import javax.inject.Inject


class HomePresenter<V: HomeInterface.View> @Inject internal constructor(private var view: V) : BasePresenter<V>(), HomeInterface.presenter<V> {


}