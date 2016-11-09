package com.itchihuahuaii.tutoriales;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ejemploLogin extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejemplo_login);

        Button boton =(Button)findViewById(R.id.log_btn);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String usuario=((EditText)findViewById(R.id.log_user)).getText().toString();
                String pass=((EditText)findViewById(R.id.log_pass)).getText().toString();

                if(usuario.equals("admin")&&pass.equals("admin")){
                    Intent intent = new Intent(getApplicationContext(),ejemploLogin2.class);
                    startActivity(intent);
                }else{
                    Toast.makeText(getApplicationContext(),"Nombre o pass incorrecto",Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}
