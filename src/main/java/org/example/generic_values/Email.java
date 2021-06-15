package org.example.generic_values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Email implements ValueObject<String> {
    private final String value;
    
    public Email(String value) throws IllegalAccessException {
        this.value = Objects.requireNonNull(value);
        if(this.value.isBlank()){
            throw new IllegalAccessException("Email cannot be empty");
        }

        if (this.value.matches("^[_A-za-z0-9-\\+]+(\\.[ _A-za-z0-9-]+)*@[A-za-z0-9-]+(\\.[A-za-z0-9]+)*(\\.[A-za-z]{2,})$")){
            throw new IllegalAccessException("Enter a valid email");
        }
    }
    public String value() {
        return value;
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
        Email that = (Email) obj;
        return Objects.equals(value, that.value);
    }
}
