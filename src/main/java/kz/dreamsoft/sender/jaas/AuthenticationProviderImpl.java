package kz.dreamsoft.sender.jaas;

import kz.dreamsoft.sender.domain.SUser;
import kz.dreamsoft.sender.repo.UserRepo;
import kz.taimax.tomee.jaas.annotation.AppAuthenticationProvider;
import kz.taimax.tomee.jaas.impl.AuthenticationProvider;


import javax.inject.Inject;
import javax.security.auth.login.LoginException;

@AppAuthenticationProvider
public class AuthenticationProviderImpl implements AuthenticationProvider {

    @Inject
    UserRepo userRepo;

    @Override
    public void authenticate(String username, String password) throws LoginException {

        SUser user = userRepo.findByUsername(username);
        if (user == null || !username.equals(user.getUserName()) || !password.equals(user.getPwd())) {
                throw new LoginException("You are not admin");
        }
    }
}

