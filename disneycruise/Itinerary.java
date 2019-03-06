package com.example.stephanie.disneycruise;

import android.content.Intent;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Itinerary extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_itinerary);

        Button btn = (Button) findViewById(R.id.itiBack);
        TextView day = (TextView) findViewById(R.id.daytxt);
        TextView port = (TextView) findViewById(R.id.porttxt);
        TextView ashore = (TextView) findViewById(R.id.ashoretxt);
        TextView onboard = (TextView) findViewById(R.id.onboardtxt);

        day.setPaintFlags(day.getPaintFlags() |   Paint.UNDERLINE_TEXT_FLAG);
        port.setPaintFlags(port.getPaintFlags() |   Paint.UNDERLINE_TEXT_FLAG);
        ashore.setPaintFlags(ashore.getPaintFlags() |   Paint.UNDERLINE_TEXT_FLAG);
        onboard.setPaintFlags(onboard.getPaintFlags() |   Paint.UNDERLINE_TEXT_FLAG);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Itinerary.this, Menu.class);
                startActivity(i);
            }
        });
    }
}
