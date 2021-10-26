package de.cschaeff.partner.spring.adapter.db;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class PartnerEntity {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String vorname;
}
