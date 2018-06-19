package com.example.tankmich.tankmich;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import com.example.tankmich.tankmich.dummy.DummyStationProvider;
import com.example.tankmich.tankmich.model.Station;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button button = findViewById(R.id.options_button);
        button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                try {
                    Intent i = new Intent(v.getContext(), SettingsActivity.class);
                    startActivity(i);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        List<Station> stationListNear = new ArrayList<Station>();
        stationListNear.add(DummyStationProvider.getStation());
        if(!stationListNear.isEmpty() && stationListNear.size()>1){
            Collections.sort(stationListNear, new Comparator<Station>() {
                @Override
                public int compare(Station o1, Station o2) {
                    if(o1 instanceof Station && o2 instanceof Station){
                        float diff = ((Station) o1).distance - ((Station) o2).distance;
                        if(diff == 0){
                            diff = ((Station) o1).selectedPrice - ((Station) o2).selectedPrice;
                        }
                        return (int)diff;
                    }
                    return 0;
                }
            });
        }


        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,stationListNear);
        ListView lv_near = findViewById(R.id.lv_near);
        lv_near.setAdapter(adapter);
    }

}
