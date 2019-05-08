package com.duq.android.instantwitcher;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final MediaPlayer haaaa = MediaPlayer.create(this, R.raw.witcher_haaaa);
        ImageButton haaaaButton = this.findViewById(R.id.imageButton);

        haaaaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                haaaa.start();
            }
        });
    }
}
