package sg.edu.rp.c346.p05_quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class FlightDetail extends AppCompatActivity {

    TextView tvDisplay;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flight_detail);

        tvDisplay = findViewById(R.id.display);

        Intent intent = getIntent();
        String value = intent.getStringExtra("Desc");
        tvDisplay.setText(value);
    }
}
