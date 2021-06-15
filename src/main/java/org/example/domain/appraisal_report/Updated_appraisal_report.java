package org.example.domain.appraisal_report;

import co.com.sofka.domain.generic.EventChange;
import org.example.domain.appraisal_report.events.*;

public class Updated_appraisal_report extends EventChange {
    public Updated_appraisal_report(Appraisal_report appraisal_report) {
        /*apply((Created_appraisal_report event)->{

        });*/

        apply((Assigned_appraiser event)->{
            appraisal_report.appraiser_id = event.getAppraiser_id();
        });

        apply((Assigned_vendor event)->{
            appraisal_report.vendor_id = event.getVendor_id();
        });

        apply((Assigned_house_information event)->{
            appraisal_report.house_information_id = event.getHouse_information_id();
        });

        apply((Assigned_neighborhood event)->{
            appraisal_report.neighborhood_id = event.getNeighborhood_id();
        });


    }
}
