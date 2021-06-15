package org.example.domain.appraiser;

import co.com.sofka.domain.generic.AggregateEvent;
import org.example.domain.appraiser.events.Appraiser_created;
import org.example.domain.appraiser.values.Appraisal_certification_id;
import org.example.domain.appraiser.values.Appraiser_id;
import org.example.generic_values.Email;
import org.example.generic_values.Full_name;
import org.example.generic_values.Phone_number;

public class Appraiser extends AggregateEvent<Appraiser_id> {

    protected Full_name full_name;
    protected Phone_number phone_number;
    protected Email email;
    protected Appraisal_certification_id appraisal_certification_id;

    public Appraiser(Appraiser_id entityId, Full_name full_name, Email email,
                     Phone_number phone_number) {
        super(entityId);
        appendChange(new Appraiser_created(full_name, email, phone_number)).apply();

    }


}
