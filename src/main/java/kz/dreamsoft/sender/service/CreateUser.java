package kz.dreamsoft.sender.service;

import kz.dreamsoft.sender.repo.UserRepo;

import javax.annotation.security.RolesAllowed;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 * Created by olzhas on 5/14/15.
 */
@Stateless
public class CreateUser {

    @Inject
    UserRepo userRepo;

    @RolesAllowed("admin")
    public void createUser(){
    }

    @RolesAllowed({"user", "admin"})
    public void user(){
    }
}

