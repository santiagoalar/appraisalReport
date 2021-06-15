package org.example.domain.house_information.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.example.domain.house_information.values.Improvements;
import org.example.domain.house_information.values.Site_description;
import org.example.domain.house_information.values.Value;

public class Created_house_information extends DomainEvent {
    private Improvements improvements;
    private Site_description site_description;
    private Value value;

    public Created_house_information(Improvements improvements,
                                     Site_description site_description,
                                     Value value) {
        super("sofka.house_information.house_information_created");
        this.improvements = improvements;
        this.site_description = site_description;
        this.value = value;
    }

    public Improvements getImprovements() {
        return improvements;
    }

    public Site_description getSite_description() {
        return site_description;
    }

    public Value getValue() {
        return value;
    }
}
