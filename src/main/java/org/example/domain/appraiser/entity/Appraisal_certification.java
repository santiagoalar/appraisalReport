package org.example.domain.appraiser.entity;

import co.com.sofka.domain.generic.Entity;
import org.example.domain.appraiser.values.Appraisal_certification_id;
import org.example.domain.appraiser.values.Expedition_date;
import org.example.domain.appraiser.values.Expiration_date;

public class Appraisal_certification extends Entity<Appraisal_certification_id> {
    private Expedition_date expedition_date;
    private Expiration_date expiration_date;

    public Appraisal_certification(Appraisal_certification_id entityId,
                                   Expedition_date expedition_date,
                                   Expiration_date expiration_date) {
        super(entityId);
        this.expedition_date = expedition_date;
        this.expiration_date = expiration_date;
    }

    public void update_expedition_date(Expedition_date expedition_date){
        this.expedition_date = expedition_date;
    }

    public void update_expiration_date(Expiration_date expiration_date){
        this.expiration_date = expiration_date;
    }

    public Expiration_date expiration_date(){
        return this.expiration_date;
    }

    public Expedition_date expedition_date(){
        return this.expedition_date;
    }
}
