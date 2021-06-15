package org.example.domain.vendor.commands;

import co.com.sofka.domain.generic.Command;
import org.example.domain.vendor.values.Vendor_id;
import org.example.generic_values.Full_name;

public class Update_full_name implements Command {
    private final Vendor_id vendor_id;
    private final Full_name full_name;

    public Update_full_name(Vendor_id vendor_id, Full_name full_name) {
        this.vendor_id = vendor_id;
        this.full_name = full_name;
    }

    public Vendor_id getVendor_id() {
        return vendor_id;
    }

    public Full_name getFull_name() {
        return full_name;
    }
}
