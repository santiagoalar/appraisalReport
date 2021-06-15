package org.example.domain.house_information.commands;

import co.com.sofka.domain.generic.Command;
import org.example.domain.house_information.values.House_information_id;
import org.example.domain.house_information.values.Improvements;

public class Assign_improvements implements Command {

    private final House_information_id house_information_id;
    private final Improvements improvements;

    public Assign_improvements(House_information_id house_information_id, Improvements improvements) {
        this.house_information_id = house_information_id;
        this.improvements = improvements;
    }

    public House_information_id getHouse_information_id() {
        return house_information_id;
    }

    public Improvements getImprovements() {
        return improvements;
    }
}
