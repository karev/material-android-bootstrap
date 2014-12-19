package com.codetroopers.materialAndroidBootstrap.example;

import android.content.Context;

import com.codetroopers.materialAndroidBootstrap.R;
import com.codetroopers.materialAndroidBootstrap.core.ForApplication;

import javax.inject.Inject;

public class DummyContentFactory {

    private final Context context;

    @Inject
    public DummyContentFactory(@ForApplication Context context) {
        this.context = context;
    }

    public DummyObject getDummyContent() {
        return new DummyObject(context.getString(R.string.hello_world));
    }
}
