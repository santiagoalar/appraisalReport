package org.example.domain.house_information;

import co.com.sofka.domain.generic.EventChange;
import org.example.domain.house_information.events.Assigned_improvements;
import org.example.domain.house_information.events.Assigned_site_description;
import org.example.domain.house_information.events.Created_house_information;

public class Updated_house_information extends EventChange {
    public Updated_house_information(House_information house_information) {

        /*apply((Created_house_information event)->{
        
        });*/

        apply((Assigned_improvements event)->{
            house_information.improvements = event.getImprovements();
        });

        apply((Assigned_site_description event)->{
            house_information.site_description = event.getSite_description();
        });

    }
}
