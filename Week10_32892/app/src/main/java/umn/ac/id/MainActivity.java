package umn.ac.id;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnWeek10a, btnWeek10b, btnWeek10c;
        btnWeek10a = findViewById(R.id.Week10a);
        btnWeek10b = findViewById(R.id.Week10b);
        btnWeek10c = findViewById(R.id.Week10c);

        btnWeek10a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openWeek10a();
            }
        });

        btnWeek10b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openWeek10b();
            }
        });

        btnWeek10c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openWeek10c();
            }
        });
    }


    public void openWeek10a (){
        Intent intent = new Intent(MainActivity.this, Week10a.class);
        startActivity(intent);
    }

    public void openWeek10b (){
        Intent intent = new Intent(MainActivity.this, Week10b.class);
        startActivity(intent);
    }

    public void openWeek10c (){
        Intent intent = new Intent(MainActivity.this, Week10c.class);
        startActivity(intent);
    }
}