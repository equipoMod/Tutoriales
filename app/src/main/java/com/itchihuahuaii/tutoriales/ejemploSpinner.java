package com.itchihuahuaii.tutoriales;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CompoundButton;
import android.widget.Spinner;
import android.widget.Toast;
import android.widget.ToggleButton;

import java.util.ArrayList;
import java.util.List;

public class ejemploSpinner extends AppCompatActivity {

    Spinner sp;
    ToggleButton toggleButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);

        sp = (Spinner)findViewById(R.id.spinner);
        toggleButton = (ToggleButton)findViewById(R.id.tgge);
        toggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    Toast.makeText(ejemploSpinner.this,"TRUE",Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(ejemploSpinner.this,"FALSE",Toast.LENGTH_SHORT).show();
                }

            }
        });
        List list = new ArrayList();
        list.add("Item 1");
        list.add("Item 2");
        list.add("Item 3");
        list.add("Item 4");
        list.add("Item 5");
        list.add("Item 6");
        list.add("Item 7");
        list.add("Item 8");

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line,list);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp.setAdapter(arrayAdapter);

        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(ejemploSpinner.this,"Item: "+sp.getSelectedItem(),Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }
}
