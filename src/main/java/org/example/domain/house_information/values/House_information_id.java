package org.example.domain.house_information.values;

import co.com.sofka.domain.generic.Identity;

public class House_information_id extends Identity {
    public House_information_id(){

    }

    private House_information_id(String id){
        super(id);
    }

    public static House_information_id of(String id){
        return new House_information_id(id);
    }
}
