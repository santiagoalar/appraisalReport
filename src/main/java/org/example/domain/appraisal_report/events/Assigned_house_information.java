package org.example.domain.appraisal_report.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.example.domain.house_information.values.House_information_id;

public class Assigned_house_information extends DomainEvent {
    private final House_information_id house_information_id;

    public Assigned_house_information(House_information_id house_information_id) {
        super("sofka.appraisal_report.house_info_id");
        this.house_information_id = house_information_id;
    }
}
