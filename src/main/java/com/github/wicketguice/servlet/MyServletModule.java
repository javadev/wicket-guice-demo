package com.github.wicketguice.servlet;

import com.google.inject.servlet.ServletModule;
import com.google.inject.persist.jpa.JpaPersistModule;
import com.google.inject.persist.PersistFilter;

public class MyServletModule extends ServletModule {
    protected void configureServlets() {
        install(new JpaPersistModule("manager1"));
        filter("/*").through(PersistFilter.class);
    }
}
