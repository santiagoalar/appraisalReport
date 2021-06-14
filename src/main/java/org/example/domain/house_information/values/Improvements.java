package org.example.domain.house_information.values;

import co.com.sofka.domain.generic.ValueObject;

public class Improvements implements ValueObject<String> {
    private String type_basement;
    private Integer number_of_stories;
    private Integer year_built;
    //private Dependency dependency;

    public String value() {
        return null;
    }
}
