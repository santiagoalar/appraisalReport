package org.example.domain.vendor.commands;

import org.example.domain.vendor.values.Vendor_id;
import org.example.generic_values.Email;
import org.example.generic_values.Full_name;
import org.example.generic_values.Phone_number;

public class Create_vendor {
    private final Vendor_id entityId;
    private final Full_name full_name;
    private final Email email;
    private final Phone_number phone_number;

    public Create_vendor(Vendor_id entityId, Full_name full_name, Email email, Phone_number phone_number) {
        this.entityId = entityId;
        this.full_name = full_name;
        this.email = email;
        this.phone_number = phone_number;
    }

    public Vendor_id getEntityId() {
        return entityId;
    }

    public Full_name getFull_name() {
        return full_name;
    }

    public Email getEmail() {
        return email;
    }

    public Phone_number getPhone_number() {
        return phone_number;
    }
}
