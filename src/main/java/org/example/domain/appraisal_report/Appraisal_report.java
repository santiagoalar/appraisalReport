package org.example.domain.appraisal_report;

import co.com.sofka.domain.generic.AggregateEvent;
import org.example.domain.appraisal_report.events.Appraiser_assigned;
import org.example.domain.appraisal_report.events.House_info_added;
import org.example.domain.appraisal_report.events.Neighborhood_assigned;
import org.example.domain.appraisal_report.events.Vendor_added;
import org.example.domain.appraisal_report.values.Appraisal_report_id;
import org.example.domain.appraiser.Appraiser;
import org.example.domain.house_information.values.House_information_id;
import org.example.domain.vendor.values.Vendor_id;
import org.example.generic_values.Email;
import org.example.generic_values.Full_name;
import org.example.generic_values.Phone_number;


public class Appraisal_report extends AggregateEvent<Appraisal_report_id> {
    protected Appraiser appraiser;

    public Appraisal_report(Appraisal_report_id entityId) {
        super(entityId);
    }

    public void add_vendor(Vendor_id vendor_id, Full_name full_name, Email email, Phone_number phone_number){
        appendChange(new Vendor_added(vendor_id, full_name, email, phone_number)).apply();
    }

    public void add_house_info(House_information_id house_information_id){
        appendChange(new House_info_added(house_information_id)).apply();
    }

    public void assign_appraiser(){
        appendChange(new Appraiser_assigned()).apply();
    }
    public void assign_neighborhood(){
        appendChange(new Neighborhood_assigned()).apply();
    }
}
