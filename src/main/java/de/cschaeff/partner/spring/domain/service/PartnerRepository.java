package de.cschaeff.partner.spring.domain.service;

import de.cschaeff.partner.spring.adapter.db.PartnerEntity;
import de.cschaeff.partner.spring.domain.model.Partner;

public interface PartnerRepository {

    public Partner savePartner(Partner parter);
}
