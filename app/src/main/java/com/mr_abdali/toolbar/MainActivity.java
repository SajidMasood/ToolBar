package com.mr_abdali.toolbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // back action  "<-"....
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.item1_id){
            // your cade is here to implement
            Toast.makeText(getApplicationContext(),"item 1 is clicked",Toast.LENGTH_SHORT).show();
        }
        else if (id == R.id.item2_id){
            // your cade is here to implement
            Toast.makeText(getApplicationContext(),"item 2 clicked", Toast.LENGTH_SHORT).show();
        }
        else if (id == R.id.item3_id){
            // your cade is here to implement
            Toast.makeText(getApplicationContext(),"item 3 clicked", Toast.LENGTH_SHORT).show();
        }
        else if (id == R.id.search_id){
            // your cade is here to implement
            Toast.makeText(getApplicationContext(),"Search icon", Toast.LENGTH_SHORT).show();
        }
        else if (id == R.id.adduser_id){
            // your cade is here to implement
            Toast.makeText(getApplicationContext(),"Add user icon", Toast.LENGTH_SHORT).show();
        }
        // for action backkkkk
        else if (id == android.R.id.home){
            // your <code>here</code>
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
