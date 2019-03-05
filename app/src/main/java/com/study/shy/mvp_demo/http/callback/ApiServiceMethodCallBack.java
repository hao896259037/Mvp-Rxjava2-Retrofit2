package com.study.shy.mvp_demo.http.callback;

//ServiceApi方法回调

import com.study.shy.mvp_demo.http.api.CommonResult;
import com.study.shy.mvp_demo.http.api.ServiceApi;

import io.reactivex.Observable;

public interface ApiServiceMethodCallBack<T> {
    Observable<CommonResult<T>> createObservable(ServiceApi serviceApi);
}
