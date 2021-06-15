package org.example.domain.appraisal_report.commands;

import co.com.sofka.domain.generic.Command;
import org.example.domain.appraisal_report.values.Appraisal_report_id;
import org.example.domain.appraiser.values.Appraiser_id;

public class Assign_appraiser implements Command {

    private final Appraisal_report_id appraisal_report_id;
    private final Appraiser_id appraiser_id;

    public Assign_appraiser(Appraisal_report_id appraisal_report_id, Appraiser_id appraiser_id) {
        this.appraisal_report_id = appraisal_report_id;
        this.appraiser_id = appraiser_id;
    }

    public Appraisal_report_id getAppraisal_report_id() {
        return appraisal_report_id;
    }

    public Appraiser_id getAppraiser_id() {
        return appraiser_id;
    }
}
