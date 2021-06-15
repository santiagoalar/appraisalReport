package org.example.domain.appraisal_report.commands;

import co.com.sofka.domain.generic.Command;
import org.example.domain.appraisal_report.values.Appraisal_report_id;
import org.example.domain.house_information.values.House_information_id;

public class Assign_house_information implements Command {

    private final Appraisal_report_id appraisal_report_id;
    private final House_information_id house_information_id;

    public Assign_house_information(Appraisal_report_id appraisal_report_id, House_information_id house_information_id) {
        this.appraisal_report_id = appraisal_report_id;
        this.house_information_id = house_information_id;
    }

    public Appraisal_report_id getAppraisal_report_id() {
        return appraisal_report_id;
    }

    public House_information_id getHouse_information_id() {
        return house_information_id;
    }
}
