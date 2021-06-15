package org.example.domain.appraiser.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.example.generic_values.Full_name;

public class Full_name_updated extends DomainEvent {
    private final Full_name full_name;

    public Full_name_updated(Full_name full_name) {
        super("sofka.appraiser.full_name_updated");
        this.full_name = full_name;
    }

    public Full_name getFull_name(){
        return full_name;
    }
}
