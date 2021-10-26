package de.cschaeff.partner.spring.domain.model;

import de.cschaeff.partner.spring.ddd.DDDAggregate;
import lombok.Data;

@DDDAggregate
@Data
public class PartnerAggregate {
    private Partner partnerEntity;


}
