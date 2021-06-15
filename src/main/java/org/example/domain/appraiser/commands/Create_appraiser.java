package org.example.domain.appraiser.commands;

import co.com.sofka.domain.generic.Command;
import org.example.domain.appraiser.values.Appraiser_id;
import org.example.generic_values.Email;
import org.example.generic_values.Full_name;
import org.example.generic_values.Phone_number;

public class Create_appraiser implements Command {

    private final Appraiser_id appraiser_id;
    private final Full_name full_name;
    private final Phone_number phone_number;
    private final Email email;

    public Create_appraiser(Appraiser_id appraiser_id, Full_name full_name, Phone_number phone_number, Email email) {
        this.appraiser_id = appraiser_id;
        this.full_name = full_name;
        this.phone_number = phone_number;
        this.email = email;
    }

    public Appraiser_id getAppraiser_id() {
        return appraiser_id;
    }

    public Full_name getFull_name() {
        return full_name;
    }

    public Phone_number getPhone_number() {
        return phone_number;
    }

    public Email getEmail() {
        return email;
    }
}
