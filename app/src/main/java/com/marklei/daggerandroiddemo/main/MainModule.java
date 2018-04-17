package com.marklei.daggerandroiddemo.main;

import com.marklei.daggerandroiddemo.di.ActivityScoped;
import com.marklei.daggerandroiddemo.di.FragmentScoped;

import dagger.Binds;
import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class MainModule {

    @FragmentScoped
    @ContributesAndroidInjector
    abstract MainFragment mainFragment();

    @ActivityScoped
    @Binds
    abstract MainContract.Presenter provideMainPresenter(MainPresenter moviesPresenter);
}
