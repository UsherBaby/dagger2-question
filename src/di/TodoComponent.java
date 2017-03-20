package com.example.demo.di;

import com.example.demo.TodoActivity;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

@OnActivity
@Subcomponent(modules = {TodoModule.class})
public interface TodoComponent extends AndroidInjector<TodoActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<TodoActivity> {
    }
}
