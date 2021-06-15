package org.example.domain.vendor;

import co.com.sofka.domain.generic.EventChange;
import org.example.domain.vendor.events.Created_vendor;
import org.example.domain.vendor.events.Updated_email;
import org.example.domain.vendor.events.Updated_full_name;
import org.example.domain.vendor.events.Updated_phone_number;

public class Updated_vendor extends EventChange {
    public Updated_vendor(Vendor vendor) {
        apply((Created_vendor event)->{
            vendor.full_name = event.getFull_name();
            vendor.email = event.getEmail();
            vendor.phone_number = event.getPhone_number();
        });

        apply((Updated_full_name event)->{
            vendor.full_name = event.getFull_name();
        });

        apply((Updated_email event)->{
            vendor.email = event.getEmail();
        });

        apply((Updated_phone_number event)->{
            vendor.phone_number = event.getPhone_number();
        });
    }
}
