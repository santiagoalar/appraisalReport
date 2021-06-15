package org.example.domain.appraisal_report.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Map_reference implements ValueObject<String> {

    private final String value;

    public String value() {
        return null;
    }

    public Map_reference(String value) throws IllegalAccessException {
        this.value = value;

        if(this.value.isBlank()){
            throw new IllegalAccessException("Map reference cannot be empty");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Map_reference that = (Map_reference) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
