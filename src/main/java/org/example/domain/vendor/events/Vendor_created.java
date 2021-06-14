package org.example.domain.vendor.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.example.generic_values.Email;
import org.example.generic_values.Full_name;
import org.example.generic_values.Phone_number;

public class Vendor_created extends DomainEvent {
    private Full_name full_name;
    private Email email;
    private Phone_number phone_number;

    public Vendor_created(Full_name full_name, Email email, Phone_number phone_number) {
        super("sofka.vendor.vendor_created");
        this.full_name = full_name;
        this.email = email;
        this.phone_number = phone_number;
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
