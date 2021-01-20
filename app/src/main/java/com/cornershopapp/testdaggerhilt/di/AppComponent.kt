package com.cornershopapp.testdaggerhilt.di

import android.content.Context
import com.cornershopapp.testdaggerhilt.di.scope.ApplicationScope
import com.cornershopapp.testdaggerhilt.presentation.MainActivity
import dagger.BindsInstance
import dagger.Component

@ApplicationScope
@Component(
    modules = [
        RepositoryModule::class,
        DataSourceModule::class,
        ViewModelModule::class
    ]
)
interface AppComponent {

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance context: Context): AppComponent
    }

    // Classes that can be injected by this Component
    fun inject(activity: MainActivity)
}
