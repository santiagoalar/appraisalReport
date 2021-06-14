package org.example.domain.appraisal_report.events;

import co.com.sofka.domain.generic.DomainEvent;

public class Appraisal_report_created extends DomainEvent {

    public Appraisal_report_created() {
        super("sofka.appraisal_report.appraisal_report_created");
    }
}
