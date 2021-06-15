package org.example.domain.appraisal_report.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.example.domain.vendor.Vendor;
import org.example.domain.vendor.values.Vendor_id;
import org.example.generic_values.Email;
import org.example.generic_values.Full_name;
import org.example.generic_values.Phone_number;

public class Assigned_vendor extends DomainEvent {
    protected Vendor_id vendor_id;
    protected Full_name full_name;
    protected Email email;
    protected Phone_number phone_number;
    protected Vendor vendor;

    public Assigned_vendor(Vendor_id vendor_id, Full_name full_name, Email email, Phone_number phone_number) {
        super("sofka.appraisal_report.vendor_added");
        this.vendor_id = vendor_id;
        this.full_name =  full_name;
        this.email = email;
        this.phone_number = phone_number;
        this.vendor = new Vendor(vendor_id, full_name, email, phone_number);

    }

    public Vendor_id getVendor_id() {
        return vendor_id;
    }
}
