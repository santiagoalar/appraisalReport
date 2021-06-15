package org.example.domain.appraisal_report.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.example.domain.appraisal_report.values.*;

public class Neighborhood_assigned extends DomainEvent {
    public Neighborhood_assigned(Neighborhood_id entityId, Neighborhood_name neighborhood_name,
                                 Map_reference map_reference, Neighborhood_growth neighborhood_growth,
                                 Description description, Boundaries boundaries) {
        super("");
    }
}
