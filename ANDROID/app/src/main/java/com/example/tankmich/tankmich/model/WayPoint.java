package com.example.tankmich.tankmich.model;

import com.example.tankmich.tankmich.location.ILocation;

import java.util.UUID;

/**
 * Created by Mona on 19.06.2018.
 */

public class WayPoint implements ILocation{
    public String name;
    public final UUID id;
    public boolean active;

    public WayPoint(){
        this.id = UUID.randomUUID();
    }
}
