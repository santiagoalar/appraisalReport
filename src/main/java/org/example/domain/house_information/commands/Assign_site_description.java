package org.example.domain.house_information.commands;

import co.com.sofka.domain.generic.Command;
import org.example.domain.appraisal_report.values.Description;
import org.example.domain.house_information.values.House_information_id;

public class Assign_site_description implements Command {

    private final House_information_id house_information_id;
    private final Description description;

    public Assign_site_description(House_information_id house_information_id, Description description) {
        this.house_information_id = house_information_id;
        this.description = description;
    }

    public House_information_id getHouse_information_id() {
        return house_information_id;
    }

    public Description getDescription() {
        return description;
    }
}
