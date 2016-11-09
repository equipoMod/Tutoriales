package com.itchihuahuaii.tutoriales;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ejemploAutoComplete extends AppCompatActivity {

    Button boton;
    AutoCompleteTextView auto;
    TextView texto;

    String[] nombres = {"Juanito","Juan","Maria","Maria Fernanda","Laura","Miguel"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejemplo_auto_complete);

        boton = (Button)findViewById(R.id.auto_boton);
        auto=(AutoCompleteTextView)findViewById(R.id.auto);
        texto=(TextView)findViewById(R.id.auto_texto);

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.auto_boton:
                        String cambio = auto.getText().toString();
                        texto.setText(cambio);
                        break;
                }
            }
        });

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line,nombres);
        auto.setThreshold(3);
        auto.setAdapter(adapter);
    }
}
