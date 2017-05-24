package com.example.zeeshan.textcolor;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView menu_textview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        menu_textview = (TextView) findViewById(R.id.sub_textview);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.options_submenu, menu); //Menu Resource
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.subMenuRED:
                Toast.makeText(MainActivity.this, "Red selected", Toast.LENGTH_LONG).show();
                menu_textview.setTextColor(Color.RED);
                return true;
            case R.id.subMenuGREEN:
                Toast.makeText(MainActivity.this, "Green Selected", Toast.LENGTH_LONG).show();
                menu_textview.setTextColor(Color.GREEN);
                return true;
            case R.id.subMenuBLUE:
                Toast.makeText(MainActivity.this, "Blue Selected", Toast.LENGTH_LONG).show();
                menu_textview.setTextColor(Color.BLUE);
                return true;
            case R.id.subMenuYELL:
                Toast.makeText(MainActivity.this, "Yellow Selected", Toast.LENGTH_LONG).show();
                menu_textview.setTextColor(Color.YELLOW);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}