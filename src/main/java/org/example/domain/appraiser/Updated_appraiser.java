package org.example.domain.appraiser;

import co.com.sofka.domain.generic.EventChange;
import org.example.domain.appraiser.events.*;

public class Updated_appraiser extends EventChange {
    public Updated_appraiser(Appraiser appraiser) {
        apply((Created_appraiser event)-> {
            appraiser.full_name = event.getFull_name();
            appraiser.email = event.getEmail();
            appraiser.phone_number = event.getPhone_number();
        });

        apply((Assigned_appraisal_certification event)->{
            appraiser.appraisal_certification_id = event.getAppraisal_certification_id();
        });

        apply((Updated_full_name event)->{
            appraiser.full_name = event.getFull_name();
        });

        apply((Updated_email event)->{
            appraiser.email = event.getEmail();
        });

        apply((Updated_phone_number event)->{
            appraiser.phone_number = event.getPhone_number();
        });
    }
}
