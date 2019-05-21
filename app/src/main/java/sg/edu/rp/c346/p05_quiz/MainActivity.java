package sg.edu.rp.c346.p05_quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox cbOW, cbRT;
    Button btnLess, btnMore, btnSubmit;
    TextView tvCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cbOW = findViewById(R.id.cbOW);
        cbRT = findViewById(R.id.cbRT);

        btnLess = findViewById(R.id.btnLess);
        btnMore = findViewById(R.id.btnMore);
        btnSubmit = findViewById(R.id.btnSubmit);

        tvCount = findViewById(R.id.tvCount);

        double cost = 0.0;


        cbOW.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cbOW.isChecked()){
                }
            }
        });

        cbRT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cbRT.isChecked()){
                }
            }
        });


        btnLess.setOnClickListener(new View.OnClickListener() {
            int count = 0;
            @Override
            public void onClick(View v) {
                count = count-1;
                tvCount.setText(count);

                if(count == 0 || count <0){
                    Toast.makeText(MainActivity.this, "Pax cannot be 0 or -1", Toast.LENGTH_SHORT).show();
                }
            }

        });

        btnMore.setOnClickListener(new View.OnClickListener() {
            int count = 0;
            @Override
            public void onClick(View v) {
                count = count+1;
                tvCount.setText(count);
            }
        });



        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, FlightDetail.class);
                intent.putExtra("Desc", "You have selected \n Your air ticket costs $");
                startActivity(intent);
            }
        });
    }
}
