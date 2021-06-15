package org.example.domain.house_information;

import co.com.sofka.domain.generic.AggregateEvent;
import org.example.domain.house_information.events.House_information_created;
import org.example.domain.house_information.values.House_information_id;
import org.example.domain.house_information.values.Improvements;
import org.example.domain.house_information.values.Site_description;
import org.example.domain.house_information.values.Value;

public class House_information extends AggregateEvent<House_information_id> {

    private Improvements improvements;
    private Site_description site_description;
    private Value value;

    public House_information(House_information_id entityId, Improvements improvements,
                             Site_description site_description,
                             Value value) {
        super(entityId);

        appendChange(new House_information_created(improvements, site_description, value)).apply();
    }
}
