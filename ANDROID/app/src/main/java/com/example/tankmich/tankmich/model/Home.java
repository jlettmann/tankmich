package com.example.tankmich.tankmich.model;

import com.example.tankmich.tankmich.location.ALocation;

import java.util.UUID;

/**
 * Created by Mona on 19.06.2018.
 */

public class Home extends ALocation {

    public String name;
    public boolean active;
    public final UUID id;

    public Home(){
        this.id = UUID.randomUUID();
    }
}
