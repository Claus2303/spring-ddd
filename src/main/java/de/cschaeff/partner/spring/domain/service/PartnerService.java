package de.cschaeff.partner.spring.domain.service;

import de.cschaeff.partner.spring.adapter.db.PartnerJPARepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PartnerService {

    @Autowired
    PartnerJPARepository partnerRepository;

    public PartnerCmdCreate.Result processCommand(PartnerCmdCreate cmd){
        return null;
    }
}
