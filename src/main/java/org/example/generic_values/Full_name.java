package org.example.generic_values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Full_name implements ValueObject<String> {

    private final String value;

    public String value() {
        return value;
    }

    public Full_name(String value) throws IllegalAccessException {
        this.value = Objects.requireNonNull(value);
        if(this.value.isBlank()){
            throw new IllegalAccessException("Full name cannot be empty");
        }
    }

    @Override
    public int hashCode() {
        //return super.hashCode();
        return Objects.hash(value);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        Full_name that = (Full_name) obj;
        return Objects.equals(value, that.value);
    }

}
