package jvmartinez.com.ui.base

/**
 * @author Juan Martinez
 */

interface IBasePresenter<V : IBaseView> {

    fun onAttch(view: V?)

    fun onDeatch()
}