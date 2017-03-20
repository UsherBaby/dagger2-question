package com.example.demo.di;

import android.app.Activity;

import com.example.demo.TodoActivity;

import dagger.Binds;
import dagger.Module;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;

@Module(subcomponents = {TodoComponent.class})
public abstract class AppBinder {
    @Binds
    @IntoMap
    @ActivityKey(TodoActivity.class)
    public abstract AndroidInjector.Factory<? extends Activity>
    bindTodoActivityInjectorFactory(TodoComponent.Builder builder);
}
