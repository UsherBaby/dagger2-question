package com.example.demo.di;

import com.example.demo.App;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {AppBinder.class, AppModule.class})
public interface AppComponent {
    void inject(App __);
}
