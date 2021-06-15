package org.example.domain.vendor;

import co.com.sofka.domain.generic.AggregateEvent;
import org.example.domain.vendor.events.Created_vendor;
import org.example.domain.vendor.values.Vendor_id;
import org.example.generic_values.Email;
import org.example.generic_values.Full_name;
import org.example.generic_values.Phone_number;

public class Vendor extends AggregateEvent<Vendor_id> {
    protected Full_name full_name;
    protected Email email;
    protected Phone_number phone_number;

    public Vendor(Vendor_id entityId, Full_name full_name, Email email, Phone_number phone_number) {
        super(entityId);
        appendChange(new Created_vendor(full_name, email, phone_number)).apply();
    }
}
