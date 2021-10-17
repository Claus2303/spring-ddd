package de.cschaeff.partner.spring.domain.model;

import de.cschaeff.partner.spring.ddd.Entity;
import de.cschaeff.partner.spring.ddd.ValueObject;

@Entity
public class PartnerEntity {
    private final PartnerId partnerId;
    private final Name name;
    private final Title title;


    PartnerEntity(PartnerId partnerId, Name name, Title title){
        this.partnerId = partnerId;
        this.name = name;
        this.title = title;
    }



    @ValueObject
    class Name{

    }
    @ValueObject
    class Title{

    }
}
