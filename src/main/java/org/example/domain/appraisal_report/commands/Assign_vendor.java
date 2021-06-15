package org.example.domain.appraisal_report.commands;

import co.com.sofka.domain.generic.Command;
import org.example.domain.appraisal_report.values.Appraisal_report_id;
import org.example.domain.vendor.values.Vendor_id;

public class Assign_vendor implements Command {

    private final Appraisal_report_id appraisal_report_id;
    private final Vendor_id vendor_id;

    public Assign_vendor(Appraisal_report_id appraisal_report_id, Vendor_id vendor_id) {
        this.appraisal_report_id = appraisal_report_id;
        this.vendor_id = vendor_id;
    }

    public Appraisal_report_id getAppraisal_report_id() {
        return appraisal_report_id;
    }

    public Vendor_id getVendor_id() {
        return vendor_id;
    }
}
