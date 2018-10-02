package jvmartinez.com.ui.home

import dagger.Binds
import dagger.Module

@Module
abstract class HomeActivityModule {
    @Binds
    abstract fun provideHomeView(homeActivity: HomeActivity): HomeInterface.View

    @Binds
    abstract fun provideHomePresenter(presenter: HomePresenter<HomeInterface.View>):
            HomeInterface.presenter<HomeInterface.View>
}