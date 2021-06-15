package org.example.domain.appraisal_report.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.example.domain.vendor.values.Vendor_id;
import org.example.generic_values.Email;
import org.example.generic_values.Full_name;
import org.example.generic_values.Phone_number;

public class Vendor_assigned extends DomainEvent {
    private final Vendor_id vendor_id;
    private final Full_name full_name;
    private final Email email;
    private final Phone_number phone_number;
    public Vendor_assigned(Vendor_id vendor_id, Full_name full_name, Email email, Phone_number phone_number) {
        super("sofka.appraisal_report.vendor_added");
        this.vendor_id = vendor_id;
        this.full_name =  full_name;
        this.email = email;
        this.phone_number = phone_number;
    }
}
