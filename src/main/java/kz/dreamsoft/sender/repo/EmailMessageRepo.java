package kz.dreamsoft.sender.repo;

import kz.dreamsoft.sender.domain.EmailMessage;
import kz.taimax.tomee.generics.repository.impl.GenericGRepository;

import javax.ejb.Stateless;

/**
 * Created by olzhas on 5/8/15.
 */
@Stateless
public class EmailMessageRepo extends GenericGRepository<EmailMessage, Long> {
}
