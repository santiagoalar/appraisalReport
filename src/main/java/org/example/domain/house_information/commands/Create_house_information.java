package org.example.domain.house_information.commands;

import co.com.sofka.domain.generic.Command;
import org.example.domain.house_information.values.House_information_id;
import org.example.domain.house_information.values.Improvements;
import org.example.domain.house_information.values.Site_description;
import org.example.domain.house_information.values.Value;

public class Create_house_information implements Command {

    private final House_information_id house_information_id;
    private final Improvements improvements;
    private final Site_description site_description;
    private final Value value;

    public Create_house_information(House_information_id house_information_id,
                                    Improvements improvements,
                                    Site_description site_description,
                                    Value value) {
        this.house_information_id = house_information_id;
        this.improvements = improvements;
        this.site_description = site_description;
        this.value = value;
    }

    public House_information_id getHouse_information_id() {
        return house_information_id;
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
