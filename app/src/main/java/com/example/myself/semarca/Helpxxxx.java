package com.example.myself.semarca;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

import com.example.myself.semarca.MainActivity;
import com.example.myself.semarca.PlayActivity;
import com.example.myself.semarca.R;

public class Helpxxxx extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.help_xxxx);

        //sound
        final MediaPlayer clickSound = MediaPlayer.create(Helpxxxx.this, R.raw.select);

        //Inten Layout  menu button
        ImageButton btnBack;
        btnBack = (ImageButton) findViewById(R.id.backmenu);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickSound.start();
                Intent intent = new Intent(Helpxxxx.this, MainActivity.class);
                startActivity(intent);
            }
        });

        ImageButton btnPrev;
        btnPrev = (ImageButton) findViewById(R.id.previous);
        btnPrev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickSound.start();
                Intent intent = new Intent(Helpxxxx.this, Helpxxx.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
