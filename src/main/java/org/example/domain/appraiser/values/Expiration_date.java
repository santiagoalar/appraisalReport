package org.example.domain.appraiser.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Expiration_date implements ValueObject<String> {

    private final String value;

    public String value() {
        return null;
    }

    public Expiration_date(String value) throws IllegalAccessException {
        this.value = value;

        if(this.value.isBlank()){
            throw new IllegalAccessException("Expiration date cannot be empty");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Expiration_date that = (Expiration_date) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
