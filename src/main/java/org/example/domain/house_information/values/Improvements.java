package org.example.domain.house_information.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Improvements implements ValueObject<String> {
    private String type_basement;
    private Integer number_of_stories;
    private Integer year_built;
    //private Dependency dependency;

    private final String value;

    public String value() {
        return null;
    }

    public Improvements(String value) throws IllegalAccessException {
        this.value = Objects.requireNonNull(value);
        if(this.value.isBlank()){
            throw new IllegalAccessException("Improvements cannot be empty");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Improvements that = (Improvements) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
