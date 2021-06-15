package org.example.domain.appraisal_report.commands;

import co.com.sofka.domain.generic.Command;
import org.example.domain.appraisal_report.values.Appraisal_report_id;
import org.example.domain.appraisal_report.values.Neighborhood_id;

public class Assign_neigborhood implements Command {

    private final Appraisal_report_id appraisal_report_id;
    private final Neighborhood_id neighborhood_id;

    public Assign_neigborhood(Appraisal_report_id appraisal_report_id, Neighborhood_id neighborhood_id) {
        this.appraisal_report_id = appraisal_report_id;
        this.neighborhood_id = neighborhood_id;
    }

    public Appraisal_report_id getAppraisal_report_id() {
        return appraisal_report_id;
    }

    public Neighborhood_id getNeighborhood_id() {
        return neighborhood_id;
    }
}
