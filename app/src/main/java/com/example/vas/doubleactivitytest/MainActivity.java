package com.example.vas.doubleactivitytest;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends Activity {
    private EditText lat;
    private EditText lon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lat= (EditText) findViewById(R.id.lat);
        lon= (EditText) findViewById(R.id.lon);
    }

    public void showMe(View view){
        String _lat=lat.getText().toString();
        String _lon=lon.getText().toString();
        Uri uri =Uri.parse("geo:"+_lat+","+_lon);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));
    }

}
