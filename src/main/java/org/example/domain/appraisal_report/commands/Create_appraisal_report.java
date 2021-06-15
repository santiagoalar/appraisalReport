package org.example.domain.appraisal_report.commands;

import co.com.sofka.domain.generic.Command;
import org.example.domain.appraisal_report.values.Appraisal_report_id;
import org.example.domain.appraisal_report.values.Neighborhood_id;
import org.example.domain.house_information.values.House_information_id;
import org.example.domain.vendor.values.Vendor_id;

public class Create_appraisal_report implements Command {

    private final Appraisal_report_id appraisal_report_id;
    private final House_information_id house_information_id;
    private final Neighborhood_id neighborhood_id;
    private final Vendor_id vendor_id;

    public Create_appraisal_report(Appraisal_report_id appraisal_report_id,
                                   House_information_id house_information_id,
                                   Neighborhood_id neighborhood_id,
                                   Vendor_id vendor_id) {
        this.appraisal_report_id = appraisal_report_id;
        this.house_information_id = house_information_id;
        this.neighborhood_id = neighborhood_id;
        this.vendor_id = vendor_id;
    }

    public Appraisal_report_id getAppraisal_report_id() {
        return appraisal_report_id;
    }

    public House_information_id getHouse_information_id() {
        return house_information_id;
    }

    public Neighborhood_id getNeighborhood_id() {
        return neighborhood_id;
    }

    public Vendor_id getVendor_id() {
        return vendor_id;
    }
}
