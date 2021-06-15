package org.example.domain.appraiser.commands;

import co.com.sofka.domain.generic.Command;
import org.example.domain.appraiser.values.Appraiser_id;
import org.example.generic_values.Email;

public class Update_email implements Command {

    private final Appraiser_id appraiser_id;
    private final Email email;

    public Update_email(Appraiser_id appraiser_id, Email email) {
        this.appraiser_id = appraiser_id;
        this.email = email;
    }

    public Appraiser_id getAppraiser_id() {
        return appraiser_id;
    }

    public Email getEmail() {
        return email;
    }
}
