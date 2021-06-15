package org.example.domain.appraiser.commands;

import co.com.sofka.domain.generic.Command;
import org.example.domain.appraiser.values.Appraisal_certification_id;
import org.example.domain.appraiser.values.Appraiser_id;

public class Assign_appraisal_certification implements Command {

    private final Appraiser_id appraiser_id;
    private final Appraisal_certification_id appraisal_certification_id;

    public Assign_appraisal_certification(Appraiser_id appraiser_id,
                                          Appraisal_certification_id appraisal_certification_id) {
        this.appraiser_id = appraiser_id;
        this.appraisal_certification_id = appraisal_certification_id;
    }

    public Appraiser_id getAppraiser_id() {
        return appraiser_id;
    }

    public Appraisal_certification_id getAppraisal_certification_id() {
        return appraisal_certification_id;
    }
}
