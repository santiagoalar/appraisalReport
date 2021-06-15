package org.example.domain.house_information.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Value implements ValueObject<String> {
    /*private Integer land_value;
    private Integer construction_value;
    private Integer total_value;*/

    private final String value;

    public String value() {
        return null;
    }

    public Value(String value) throws IllegalAccessException {
        this.value = value;

        if(this.value.isBlank()){
            throw new IllegalAccessException("Value cannot be empty");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Value value1 = (Value) o;
        return Objects.equals(value, value1.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
