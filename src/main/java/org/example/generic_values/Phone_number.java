package org.example.generic_values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Phone_number implements ValueObject<String> {

    private final String value;

    public String value() {
        return null;
    }

    public Phone_number(String value) throws IllegalAccessException {
        this.value = Objects.requireNonNull(value);
        if(this.value.isBlank()){
            throw new IllegalAccessException("Full name cannot be empty");
        }
        if (this.value.length() <= 11){
            throw new IllegalAccessException("Enter a valid phone number");
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
        Phone_number that = (Phone_number) obj;
        return Objects.equals(value, that.value);
    }
}
