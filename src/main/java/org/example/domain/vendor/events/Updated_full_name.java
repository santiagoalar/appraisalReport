package org.example.domain.vendor.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.example.generic_values.Full_name;

public class Updated_full_name extends DomainEvent {
    private final Full_name full_name;

    public Updated_full_name(Full_name full_name) {
        super("sofka.vendor.full_name_updated");
        this.full_name = full_name;
    }

    public Full_name getFull_name(){
        return full_name;
    }
}
