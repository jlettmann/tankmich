package com.example.tankmich.tankmich.model;

import com.example.tankmich.tankmich.location.ILocation;

import java.util.UUID;

/**
 * Created by Mona on 19.06.2018.
 */

public class Station implements ILocation{
    public UUID id;
    public String name;
    public String brand;
    public float distance;
    public float diesel;
    public float e5;
    public float e10;
    public boolean isOpen;
    public String place;
    public OpeningTime[] openingTimes;
    public String[] overrides;
    public boolean wholeDay;
    public String state;


}
