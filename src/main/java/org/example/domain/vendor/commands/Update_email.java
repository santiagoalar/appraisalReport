package org.example.domain.vendor.commands;

import co.com.sofka.domain.generic.Command;
import org.example.domain.vendor.values.Vendor_id;
import org.example.generic_values.Email;
import org.example.generic_values.Full_name;

public class Update_email implements Command {
    private final Vendor_id vendor_id;
    private final Email email;

    public Update_email(Vendor_id vendor_id, Email email) {
        this.vendor_id = vendor_id;
        this.email = email;
    }

    public Vendor_id getVendor_id() {
        return vendor_id;
    }

    public Email getEmail() {
        return email;
    }
}
