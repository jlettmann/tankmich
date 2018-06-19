package com.example.tankmich.tankmich.dummy;

import com.example.tankmich.tankmich.model.Station;

import java.util.UUID;

/**
 * Created by Mona on 19.06.2018.
 */

public class DummyStationProvider {
    public static Station getStation(){
        Station station = new Station();
        station.id = UUID.randomUUID();
        station.name = "ARAL Paderborn";
        station.brand = "ARAL";
        station.place = "Paderborn";
        station.street = "Neuhäuser Straße";
        station.houseNumber =34;
        station.postCode = 33100;
        station.isOpen =true;
        station.distance = 2;
        station.lat = 44.00045f;
        station.lng = 14.00564f;
        station.wholeDay = false;
        station.e5 = 1.43f;
        station.e10 = 1.40f;
        station.diesel = 1.25f;
        return station;
    }
}
