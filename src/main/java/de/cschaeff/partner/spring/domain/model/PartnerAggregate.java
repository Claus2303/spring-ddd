package de.cschaeff.partner.spring.domain.model;

import de.cschaeff.partner.spring.ddd.Aggregate;
import lombok.Data;

@Aggregate
@Data
public class PartnerAggregate {
    private PartnerEntity partnerEntity;


}
