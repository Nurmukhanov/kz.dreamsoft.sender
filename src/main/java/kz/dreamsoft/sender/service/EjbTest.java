package kz.dreamsoft.sender.service;


import javax.annotation.Resource;
import javax.annotation.security.RolesAllowed;
import javax.ejb.SessionContext;
import javax.ejb.Stateless;

@Stateless
public class EjbTest {
    @Resource
    SessionContext context;

    @RolesAllowed("admin")
    public String get() {
        return context.getCallerPrincipal().getName();
    }
}
