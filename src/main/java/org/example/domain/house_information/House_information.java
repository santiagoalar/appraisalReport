package org.example.domain.house_information;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import org.example.domain.house_information.events.Assigned_value;
import org.example.domain.house_information.events.Created_house_information;
import org.example.domain.house_information.events.Assigned_improvements;
import org.example.domain.house_information.events.Assigned_site_description;
import org.example.domain.house_information.values.House_information_id;
import org.example.domain.house_information.values.Improvements;
import org.example.domain.house_information.values.Site_description;
import org.example.domain.house_information.values.Value;

import java.util.List;

public class House_information extends AggregateEvent<House_information_id> {

    protected Improvements improvements;
    protected Site_description site_description;
    protected Value value;

    public House_information(House_information_id entityId, Improvements improvements,
                             Site_description site_description,
                             Value value) {
        super(entityId);

        appendChange(new Created_house_information(improvements, site_description, value)).apply();
    }

    private House_information(House_information_id entityId){
        super(entityId);
        subscribe(new Updated_house_information(this));
    }

    public static House_information from(House_information_id house_information_id, List<DomainEvent> events){
        var house_information = new House_information(house_information_id);
        events.forEach(house_information::applyEvent);
        return house_information;
    }

    public void assign_site_description(Site_description site_description){
        appendChange(new Assigned_site_description(site_description)).apply();
    }

    public void assign_improvements(Improvements improvements){
        appendChange(new Assigned_improvements(improvements)).apply();
    }

    public void assign_value(Value value){
        appendChange(new Assigned_value(value)).apply();
    }

    public Improvements improvements() {
        return improvements;
    }

    public Site_description site_description() {
        return site_description;
    }

    public Value value() {
        return value;
    }
}
