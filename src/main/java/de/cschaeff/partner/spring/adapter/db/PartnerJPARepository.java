package de.cschaeff.partner.spring.adapter.db;

import de.cschaeff.partner.spring.domain.model.Partner;
import de.cschaeff.partner.spring.domain.service.PartnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

@Repository
public class PartnerJPARepository implements PartnerRepository {

    @Autowired
    EntityManager entityManager;
    @Override
    public Partner savePartner(Partner partner) {
        return null;
    }
}
