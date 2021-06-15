package org.example.domain.appraisal_report.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.example.domain.appraisal_report.values.*;

public class Assigned_neighborhood extends DomainEvent {

    protected Neighborhood_id neighborhood_id;

    public Assigned_neighborhood(Neighborhood_id entityId, Neighborhood_name neighborhood_name,
                                 Map_reference map_reference, Neighborhood_growth neighborhood_growth,
                                 Description description, Boundaries boundaries) {
        super("sofka.appraisal_report.assigned_neighborhood");
        this.neighborhood_id = entityId;
    }

    public Neighborhood_id getNeighborhood_id() {
        return neighborhood_id;
    }
}
