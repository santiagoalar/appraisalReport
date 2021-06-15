package org.example.domain.appraiser.values;

import co.com.sofka.domain.generic.Identity;

public class Appraisal_certification_id extends Identity {
    public Appraisal_certification_id(){

    }

    private Appraisal_certification_id(String id){
        super(id);
    }

    public static Appraisal_certification_id of(String id){
        return new Appraisal_certification_id(id);
    }
}
