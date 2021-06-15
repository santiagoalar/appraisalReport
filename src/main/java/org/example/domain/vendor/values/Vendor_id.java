package org.example.domain.vendor.values;

import co.com.sofka.domain.generic.Identity;

public class Vendor_id extends Identity {

    public Vendor_id(){
        
    }

    private Vendor_id(String id){
        super(id);
    }

    public static Vendor_id of(String id){
        return new Vendor_id(id);
    }
}
