package com.github.wicketguice.wicket;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.model.IModel;
import org.apache.wicket.model.CompoundPropertyModel;
import org.apache.wicket.model.LoadableDetachableModel;
import com.github.wicketguice.model.User;
import com.github.wicketguice.service.IService;
import com.google.inject.Inject;

public class HomePage extends WebPage {
    private static final long serialVersionUID = -918138816287955837L;

    @Inject
    private IService service;

    private IModel<User> model = new LoadableDetachableModel<User>() {
        private static final long serialVersionUID = 1913317225318224531L;

        @Override
        protected User load() {
            return service.getUser();
        }
    };

    public HomePage() {
        setDefaultModel(new CompoundPropertyModel<User>(model));
        add(new Label("name"));
    }
}
