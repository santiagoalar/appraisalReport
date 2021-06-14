package org.example.domain.appraisal_report.entity;

import co.com.sofka.domain.generic.Entity;
import org.example.domain.appraisal_report.values.*;

import java.util.Objects;

public class Neighborhood extends Entity<Neighborhood_id> {
    //Map_reference is an Object Value
    private Neighborhood_name neighborhood_name;
    private Map_reference map_reference;
    private Neighborhood_growth neighborhood_growth;
    private Description description;
    private Boundaries boundaries;


    public Neighborhood(Neighborhood_id entityId, Neighborhood_name neighborhood_name,
                        Map_reference map_reference, Neighborhood_growth neighborhood_growth,
                        Description description, Boundaries boundaries) {
        super(entityId);
        this.neighborhood_name = neighborhood_name;
        this.map_reference = map_reference;
        this.neighborhood_growth = neighborhood_growth;
        this.description = description;
        this.boundaries = boundaries;
    }

    public void update_growth(Neighborhood_growth neighborhood_growth){
        this.neighborhood_growth = Objects.requireNonNull(neighborhood_growth, "Fatal Error!");
    }

    public void update_description(Description description){
        this.description = Objects.requireNonNull(description);
    }

    public void update_boundaries(Boundaries boundaries){
        this.boundaries = boundaries;
    }

    public Neighborhood_name neighborhood_name(){
        return this.neighborhood_name;
    }

    public Map_reference map_reference(){
        return this.map_reference;
    }

    public Neighborhood_growth neighborhood_growth(){
        return this.neighborhood_growth;
    }

    public Description description(){
        return this.description;
    }

    public Boundaries boundaries(){
        return this.boundaries;
    }
}
