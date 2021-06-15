package org.example.domain.appraiser.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.example.generic_values.Email;

public class Email_updated extends DomainEvent {

    private final Email email;

    public Email_updated(Email email) {
        super("sofka.appraiser.email_updated");
        this.email = email;
    }

    public Email getEmail() {
        return email;
    }
}
