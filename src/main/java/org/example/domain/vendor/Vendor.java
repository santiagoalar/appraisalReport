package org.example.domain.vendor;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import org.example.domain.appraiser.events.Updated_email;
import org.example.domain.appraiser.events.Updated_full_name;
import org.example.domain.appraiser.events.Updated_phone_number;
import org.example.domain.vendor.events.Created_vendor;
import org.example.domain.vendor.values.Vendor_id;
import org.example.generic_values.Email;
import org.example.generic_values.Full_name;
import org.example.generic_values.Phone_number;

import java.util.List;

public class Vendor extends AggregateEvent<Vendor_id> {
    protected Full_name full_name;
    protected Email email;
    protected Phone_number phone_number;

    public Vendor(Vendor_id entityId, Full_name full_name, Email email, Phone_number phone_number) {
        super(entityId);
        appendChange(new Created_vendor(full_name, email, phone_number)).apply();
    }

    private Vendor(Vendor_id entityId){
        super(entityId);
        subscribe(new Updated_vendor(this));
    }

    public static Vendor from(Vendor_id vendor_id, List<DomainEvent> events){
        var vendor = new Vendor(vendor_id);
        events.forEach(vendor::applyEvent);
        return vendor;
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
}
