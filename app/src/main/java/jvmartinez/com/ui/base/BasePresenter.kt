package jvmartinez.com.ui.base

import javax.inject.Inject

/**
 * @author Juan Martinez
 */

open class BasePresenter<V : IBaseView>@Inject internal constructor()  : IBasePresenter<V> {
    private var view: V? = null

    override fun onAttch(view: V?) {
        this.view = view
    }

    override fun onDeatch() {
        view = null
    }

    fun getView(): V? {
        return view
    }

}