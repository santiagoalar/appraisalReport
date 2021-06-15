package org.example.domain.appraisal_report.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Neighborhood_growth implements ValueObject<String> {

    private final String value;

    public String value() {
        return null;
    }

    public Neighborhood_growth(String value) throws IllegalAccessException {
        this.value = value;

        if(this.value.isBlank()){
            throw new IllegalAccessException("Neighborhood growth cannot be empty");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Neighborhood_growth that = (Neighborhood_growth) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
