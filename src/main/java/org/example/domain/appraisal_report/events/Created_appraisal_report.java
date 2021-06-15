package org.example.domain.appraisal_report.events;

import co.com.sofka.domain.generic.DomainEvent;

public class Created_appraisal_report extends DomainEvent {

    public Created_appraisal_report() {
        super("sofka.appraisal_report.appraisal_report_created");
    }
}
