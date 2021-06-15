package org.example.domain.appraisal_report.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.example.domain.appraiser.Appraiser;
import org.example.domain.appraiser.values.Appraiser_id;
import org.example.generic_values.Email;
import org.example.generic_values.Full_name;
import org.example.generic_values.Phone_number;

public class Assigned_appraiser extends DomainEvent {

    protected Appraiser_id appraiser_id;
    protected Appraiser appraiser;

    public Assigned_appraiser(Appraiser_id entityId,
                              Full_name full_name,
                              Email email,
                              Phone_number phone_number) {
        super("sofka.appraisal_report.assigned_appraiser");
        this.appraiser_id = entityId;
        this.appraiser = new Appraiser(entityId,full_name, email, phone_number);

    }

    public Appraiser getAppraiser() {
        return appraiser;
    }

    public Appraiser_id getAppraiser_id() {
        return appraiser_id;
    }
}
