package org.example.domain.house_information.commands;

import co.com.sofka.domain.generic.Command;
import org.example.domain.house_information.values.House_information_id;
import org.example.domain.house_information.values.Value;

public class Assign_value implements Command {

    private final House_information_id house_information_id;
    private final Value value;

    public Assign_value(House_information_id house_information_id, Value value) {
        this.house_information_id = house_information_id;
        this.value = value;
    }

    public House_information_id getHouse_information_id() {
        return house_information_id;
    }

    public Value getValue() {
        return value;
    }
}
