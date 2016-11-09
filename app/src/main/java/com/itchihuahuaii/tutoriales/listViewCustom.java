package com.itchihuahuaii.tutoriales;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class listViewCustom extends AppCompatActivity {

    ListView listview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_custom);

        FrutasVerduras[] frutasVerduras = new FrutasVerduras[]{
          new FrutasVerduras(R.drawable.apple,"Manzana"),
                new FrutasVerduras(R.drawable.apple,"Pepino"),
                new FrutasVerduras(R.drawable.apple,"Mango"),
                new FrutasVerduras(R.drawable.coco,"Coco"),
                new FrutasVerduras(R.drawable.lemon,"Limon"),
                new FrutasVerduras(R.drawable.pimiento,"Pimiento"),
                new FrutasVerduras(R.drawable.melon,"Melon"),
                };

        FrutasVerdurasAdapter adapter = new FrutasVerdurasAdapter(this,R.layout.listview_item_row,frutasVerduras);

        listview=(ListView)findViewById(R.id.listview);
        View header = (View) getLayoutInflater().inflate(R.layout.list_header_row,null);
        listview.addHeaderView(header);
        listview.setAdapter(adapter);


        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                TextView v = (TextView)view.findViewById(R.id.list_texto);

                Toast.makeText(getApplicationContext(),v.getText(),Toast.LENGTH_SHORT).show();
            }
        });
    }
}
