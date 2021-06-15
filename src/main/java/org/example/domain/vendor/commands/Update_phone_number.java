package org.example.domain.vendor.commands;

import co.com.sofka.domain.generic.Command;
import org.example.domain.vendor.values.Vendor_id;
import org.example.generic_values.Phone_number;

public class Update_phone_number implements Command {
    private final Vendor_id vendor_id;
    private final Phone_number phone_number;

    public Update_phone_number(Vendor_id vendor_id, Phone_number phone_number) {
        this.vendor_id = vendor_id;
        this.phone_number = phone_number;
    }

    public Vendor_id getVendor_id() {
        return vendor_id;
    }

    public Phone_number getPhone_number() {
        return phone_number;
    }
}
