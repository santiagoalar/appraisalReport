package org.example.domain.appraisal_report.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.example.domain.house_information.Cadastral_House_reference;

public class House_info_added extends DomainEvent {
    private final Cadastral_House_reference cadastral_house_reference;
    public House_info_added(Cadastral_House_reference cadastral_house_reference) {
        super("sofka.appraisal_report.house_info_added");
        this.cadastral_house_reference = cadastral_house_reference;
    }
}
