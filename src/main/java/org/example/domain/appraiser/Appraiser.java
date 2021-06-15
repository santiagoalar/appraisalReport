package org.example.domain.appraiser;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import org.example.domain.appraiser.events.*;
import org.example.domain.appraiser.values.Appraisal_certification_id;
import org.example.domain.appraiser.values.Appraiser_id;
import org.example.generic_values.Email;
import org.example.generic_values.Full_name;
import org.example.generic_values.Phone_number;

import java.util.List;

public class Appraiser extends AggregateEvent<Appraiser_id> {

    protected Full_name full_name;
    protected Phone_number phone_number;
    protected Email email;
    protected Appraisal_certification_id appraisal_certification_id;

    public Appraiser(Appraiser_id entityId, Full_name full_name, Email email,
                     Phone_number phone_number) {
        super(entityId);
        appendChange(new Created_appraiser(full_name, email, phone_number)).apply();
    }

    private Appraiser(Appraiser_id entityId){
        super(entityId);
        subscribe(new Updated_appraiser(this));
    }

    //Factory to create aggregates (aplicando cada evento)
    public static Appraiser from(Appraiser_id appraiser_id, List<DomainEvent> events){
        var appraiser = new Appraiser(appraiser_id);
        events.forEach(appraiser::applyEvent);
        return appraiser;
    }

    public void update_full_name(Full_name full_name){
        appendChange(new Updated_full_name(full_name)).apply();
    }

    public void update_phone_number(Phone_number phone_number){
        appendChange(new Updated_phone_number(phone_number)).apply();
    }

    public void update_email(Email email){
        appendChange(new Updated_email(email)).apply();
    }

    public void assign_appraisal_certification(Appraisal_certification_id appraisal_certification_id){
        appendChange(new Assigned_appraisal_certification(appraisal_certification_id)).apply();
    }

    public Full_name full_name() {
        return full_name;
    }

    public Phone_number phone_number() {
        return phone_number;
    }

    public Email email() {
        return email;
    }
}
