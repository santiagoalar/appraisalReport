package org.example.domain.appraiser.commands;

import co.com.sofka.domain.generic.Command;
import org.example.domain.appraiser.values.Appraiser_id;
import org.example.generic_values.Phone_number;

public class Update_phone_number implements Command {

    private final Appraiser_id appraiser_id;
    private final Phone_number phone_number;

    public Update_phone_number(Appraiser_id appraiser_id, Phone_number phone_number) {
        this.appraiser_id = appraiser_id;
        this.phone_number = phone_number;
    }

    public Appraiser_id getAppraiser_id() {
        return appraiser_id;
    }

    public Phone_number getPhone_number() {
        return phone_number;
    }
}
