package org.example.domain.appraiser.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.example.domain.appraiser.values.Appraisal_certification_id;

public class Appraisal_certification_assigned extends DomainEvent {
    private final Appraisal_certification_id appraisal_certification_id;
    public Appraisal_certification_assigned(Appraisal_certification_id appraisal_certification_id) {
        super("sofka.appraiser.appraisal_certification_assigned");
        this.appraisal_certification_id = appraisal_certification_id;
    }

    public Appraisal_certification_id getAppraisal_certification_id() {
        return appraisal_certification_id;
    }
}
