package com.itchihuahuaii.tutoriales;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ejemploMusic extends AppCompatActivity{

    Button inicio,parar;
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejemplo_music);

        inicio=(Button)findViewById(R.id.mus_play);
        parar=(Button)findViewById(R.id.mus_stop);

        mediaPlayer = MediaPlayer.create(this,R.raw.cancion);

        inicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.start();
            }
        });
        parar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.pause();
            }
        });
    }
}
