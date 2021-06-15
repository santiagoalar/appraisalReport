package org.example.domain.appraisal_report;

import co.com.sofka.domain.generic.AggregateEvent;
import org.example.domain.appraisal_report.events.*;
import org.example.domain.appraisal_report.values.*;
import org.example.domain.appraiser.Appraiser;
import org.example.domain.appraiser.values.Appraiser_id;
import org.example.domain.house_information.values.House_information_id;
import org.example.domain.vendor.values.Vendor_id;
import org.example.generic_values.Email;
import org.example.generic_values.Full_name;
import org.example.generic_values.Phone_number;

import java.util.Objects;


public class Appraisal_report extends AggregateEvent<Appraisal_report_id> {
    protected Appraiser appraiser;

    public Appraisal_report(Appraisal_report_id entityId) {
        super(entityId);
        appendChange(new Created_appraisal_report()).apply();
    }

    public void assign_vendor(Vendor_id vendor_id, Full_name full_name, Email email, Phone_number phone_number){

        Objects.requireNonNull(vendor_id);
        Objects.requireNonNull(full_name);
        Objects.requireNonNull(email);
        Objects.requireNonNull(phone_number);

        appendChange(new Assigned_vendor(vendor_id, full_name, email, phone_number)).apply();
    }

    public void assign_appraiser(Appraiser_id appraiser_id, Full_name full_name, Email email,
                                 Phone_number phone_number){

        Objects.requireNonNull(appraiser_id);
        Objects.requireNonNull(full_name);
        Objects.requireNonNull(email);
        Objects.requireNonNull(phone_number);

        appendChange(new Assigned_appraiser(appraiser_id, full_name, email, phone_number)).apply();
    }

    public void assign_house_info(House_information_id house_information_id){
        appendChange(new Assigned_house_information(house_information_id)).apply();
    }

    public void assign_neighborhood(Neighborhood_id entityId, Neighborhood_name neighborhood_name,
                                    Map_reference map_reference, Neighborhood_growth neighborhood_growth,
                                    Description description, Boundaries boundaries){

        Objects.requireNonNull(entityId);
        Objects.requireNonNull(neighborhood_name);
        Objects.requireNonNull(map_reference);
        Objects.requireNonNull(neighborhood_growth);
        Objects.requireNonNull(description);
        Objects.requireNonNull(boundaries);

        appendChange(new Assigned_neighborhood(entityId, neighborhood_name,
                map_reference, neighborhood_growth, description, boundaries)).apply();
    }
}
