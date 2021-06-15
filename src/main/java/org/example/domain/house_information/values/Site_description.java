package org.example.domain.house_information.values;

import co.com.sofka.domain.generic.ValueObject;

import java.awt.*;
import java.util.Objects;

public class Site_description implements ValueObject<String> {
    /*private String shape;
    private Dimension dimension;
    private List<Utility>
    */

    private final String value;

    public String value() {
        return null;
    }

    public Site_description(String value) throws IllegalAccessException {
        this.value = value;

        if(this.value.isBlank()){
            throw new IllegalAccessException("Site description cannot be empty");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Site_description that = (Site_description) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
