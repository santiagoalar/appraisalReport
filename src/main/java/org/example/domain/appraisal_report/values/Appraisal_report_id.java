package org.example.domain.appraisal_report.values;

import co.com.sofka.domain.generic.Identity;

public class Appraisal_report_id extends Identity {
    public Appraisal_report_id(){

    }

    private Appraisal_report_id(String id){
        super(id);
    }

    public static Appraisal_report_id of(String id){
        return new Appraisal_report_id(id);
    }
}
