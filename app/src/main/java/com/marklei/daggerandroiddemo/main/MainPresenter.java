package com.marklei.daggerandroiddemo.main;

import com.marklei.daggerandroiddemo.di.ActivityScoped;

import javax.inject.Inject;

@ActivityScoped
public class MainPresenter implements MainContract.Presenter {

    private MainContract.View mView;

    @Inject
    MainPresenter() {
    }

    @Override
    public void loadMovies(boolean forceUpdate) {
        mView.setLoadingIndicator(true);
    }

    @Override
    public void takeView(MainContract.View view) {
        mView = view;
        loadMovies(false);
    }

    @Override
    public void dropView() {
        mView = null;
    }
}
