package org.example.domain.house_information.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.example.domain.house_information.values.Site_description;

public class Assigned_site_description extends DomainEvent {

    private final Site_description site_description;
    public Assigned_site_description(Site_description site_description) {
        super("sofka.house_information.site_description_assigned");
        this.site_description = site_description;
    }

    public Site_description getSite_description() {
        return site_description;
    }
}
