package com.github.wicketguice.wicket;

import org.apache.wicket.protocol.http.WebApplication;
import org.apache.wicket.Page;
import org.apache.wicket.guice.GuiceComponentInjector;
import com.github.wicketguice.servlet.MyServletModule;

public class WicketApplication extends WebApplication {
    @Override
    protected void init() {
        super.init();
        getComponentInstantiationListeners().add(new GuiceComponentInjector(this,
                new MyServletModule()));
    }

    @Override
    public Class<? extends Page> getHomePage() {
        return com.github.wicketguice.wicket.HomePage.class;
    }
}
