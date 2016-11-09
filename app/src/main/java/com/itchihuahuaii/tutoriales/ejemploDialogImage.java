package com.itchihuahuaii.tutoriales;

import android.app.Dialog;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DialogTitle;
import android.view.View;
import android.widget.Button;

public class ejemploDialogImage extends AppCompatActivity implements View.OnClickListener{

    Button boton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejemplo_dialog_image);

        boton = (Button)findViewById(R.id.boton);
        boton.setOnClickListener(this);
    }

    protected Dialog onCreateDialog(int id){
      Dialog dialog=null;
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder=builder.setIcon(R.mipmap.ic_launcher);
        builder=builder.setTitle("Dialog con imagen");
        dialog = builder.create();

        return dialog;
    }

    @Override
    public void onClick(View v) {
        onCreateDialog(0).show();
    }
}
