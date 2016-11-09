package com.itchihuahuaii.tutoriales;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ejemploListView extends AppCompatActivity {

    ListView listview;

    String[] elementos = {"Jose","Pedro","Maria","Miguel","Luis","Daniel","Elena","Laura","Sofia"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejemplo_list_view);

        listview = (ListView)findViewById(R.id.listview);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1,elementos);

        listview.setAdapter(adapter);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),""+position,Toast.LENGTH_SHORT).show();
            }
        });

    }
}
