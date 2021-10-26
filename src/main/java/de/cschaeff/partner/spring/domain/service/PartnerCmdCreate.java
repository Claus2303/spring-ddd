package de.cschaeff.partner.spring.domain.service;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class PartnerCmdCreate {

    private String name;
    private String vorname;

    @Getter
    @Builder
    public static class Result{
        private Long paid;

        private String name;
        private String vorname;
    }
}
