package com.github.wicketguice.service.impl;

import com.github.wicketguice.model.User;
import com.github.wicketguice.service.IService;
import com.google.inject.Inject;
import com.google.inject.persist.Transactional;
import javax.persistence.EntityManager;
import javax.persistence.Query;

public class JpaService implements IService {
    @Inject
    private EntityManager em;

    @Override
    @Transactional
    public User getUser() {
        Query q = em.createQuery("FROM User");
        q.setMaxResults(1);
        User u = (User) q.getSingleResult();
        return u;
    }
}
