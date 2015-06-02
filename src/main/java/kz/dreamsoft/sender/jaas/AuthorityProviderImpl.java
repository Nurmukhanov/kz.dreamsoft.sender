package kz.dreamsoft.sender.jaas;

import kz.dreamsoft.sender.repo.UserRepo;
import kz.taimax.tomee.jaas.annotation.AppAuthorityProvider;
import kz.taimax.tomee.jaas.impl.AuthorityProvider;

import javax.inject.Inject;
import java.util.List;

@AppAuthorityProvider
public class AuthorityProviderImpl implements AuthorityProvider {

    @Inject
    UserRepo userRepo;

    @Override
    public List<String> get(String username) {
        System.out.println("IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
        userRepo.findByUsername(username).getRoles().forEach(s -> System.out.println(s));
        return userRepo.findByUsername(username).getRoles();
    }
}