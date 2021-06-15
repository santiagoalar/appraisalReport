package org.example.domain.house_information.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.example.domain.house_information.values.Improvements;

public class Assigned_improvements extends DomainEvent {

    private final Improvements improvements;
    public Assigned_improvements(Improvements improvements) {
        super("sofka.house_information.improvements_assigned");
        this.improvements = improvements;
    }

    public Improvements getImprovements() {
        return improvements;
    }
}
