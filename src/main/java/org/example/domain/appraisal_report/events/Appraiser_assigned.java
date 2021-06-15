package org.example.domain.appraisal_report.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.example.domain.appraisal_report.values.*;
import org.example.domain.appraiser.values.Appraiser_id;
import org.example.generic_values.Email;
import org.example.generic_values.Full_name;
import org.example.generic_values.Phone_number;

public class Appraiser_assigned extends DomainEvent {
    public Appraiser_assigned(Appraiser_id entityId,
                              Full_name full_name,
                              Email email,
                              Phone_number phone_number) {
        super("");
    }
}
