package org.example.domain.house_information.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.example.domain.house_information.values.Value;

public class Assigned_value extends DomainEvent {

    private final Value value;

    public Assigned_value(Value value) {
        super("sofka.house_information.assigned_value");
        this.value = value;
    }

    public Value getValue() {
        return value;
    }
}
