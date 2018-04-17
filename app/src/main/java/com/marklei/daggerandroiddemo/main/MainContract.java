package com.marklei.daggerandroiddemo.main;

import com.marklei.daggerandroiddemo.BasePresenter;
import com.marklei.daggerandroiddemo.BaseView;

public interface MainContract {

    interface View extends BaseView {

        void setLoadingIndicator(boolean active);

        boolean isActive();
    }

    interface Presenter extends BasePresenter<View> {

        void loadMovies(boolean forceUpdate);
    }

}
