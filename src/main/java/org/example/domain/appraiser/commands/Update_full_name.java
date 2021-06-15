package org.example.domain.appraiser.commands;

import co.com.sofka.domain.generic.Command;
import org.example.domain.appraiser.values.Appraiser_id;
import org.example.generic_values.Full_name;

public class Update_full_name implements Command {

    private final Appraiser_id appraiser_id;
    private final Full_name full_name;

    public Update_full_name(Appraiser_id appraiser_id, Full_name full_name) {
        this.appraiser_id = appraiser_id;
        this.full_name = full_name;
    }

    public Appraiser_id getAppraiser_id() {
        return appraiser_id;
    }

    public Full_name getFull_name() {
        return full_name;
    }
}
