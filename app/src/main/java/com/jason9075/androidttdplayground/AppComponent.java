package com.jason9075.androidttdplayground;

import com.jason9075.androidttdplayground.module.NetworkModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by jason9075 on 2016/3/18.
 */

@Singleton
@Component(modules = {NetworkModule.class})
public interface AppComponent {

    void inject(MainActivity activity);
}
