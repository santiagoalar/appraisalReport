package org.example.domain.appraiser.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.example.generic_values.Phone_number;

public class Phone_number_updated extends DomainEvent {
    private final Phone_number phone_number;

    public Phone_number_updated(Phone_number phone_number) {
        super("sofka.appraiser.phone_number_updated");
        this.phone_number = phone_number;
    }

    public Phone_number getPhone_number() {
        return phone_number;
    }
}
