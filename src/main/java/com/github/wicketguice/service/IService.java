package com.github.wicketguice.service;

import com.google.inject.ImplementedBy;
import com.github.wicketguice.service.impl.JpaService;
import com.github.wicketguice.model.User;

@ImplementedBy(JpaService.class)
public interface IService {
    public User getUser();
}
