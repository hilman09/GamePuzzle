package com.example.gamepuzzle;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Button;
import android.view.View;
import android.os.Bundle;
import android.graphics.Color;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button btn = findViewById(R.id.a);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn.setBackgroundColor(Color.RED);
            }
        });
    }
     @Override
        public boolean onCreateOptionsMenu(Menu menu) {
            MenuInflater inflater = getMenuInflater();
            inflater.inflate(R.menu.optionmenu,menu);
            return true;
        }

        @Override
        public boolean onOptionsItemSelected(MenuItem item) {
            if (item.getItemId()==R.id.ulang){
                startActivity(new Intent( this, Ulang.class));
            } else if (item.getItemId() == R.id.keluar) {
                startActivity(new Intent (this, Keluar.class));
            }
            return super.onOptionsItemSelected(item);
        }

}