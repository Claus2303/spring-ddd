package de.cschaeff.partner.spring.domain.model;

import de.cschaeff.partner.spring.ddd.DDDEntity;
import de.cschaeff.partner.spring.ddd.DDDValueObject;

@DDDEntity
public class Partner {
    private final PartnerId partnerId;
    private final Name name;
    private final Title title;


    Partner(PartnerId partnerId, Name name, Title title){
        this.partnerId = partnerId;
        this.name = name;
        this.title = title;
    }



    @DDDValueObject
    class Name{

    }
    @DDDValueObject
    class Title{

    }
}
