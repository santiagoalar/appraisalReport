package org.example.domain.appraiser.values;

import co.com.sofka.domain.generic.Identity;

public class Appraiser_id extends Identity {
    public Appraiser_id(){

    }

    private Appraiser_id(String id){
        super(id);
    }

    public static Appraiser_id of(String id){
        return new Appraiser_id(id);
    }
}
