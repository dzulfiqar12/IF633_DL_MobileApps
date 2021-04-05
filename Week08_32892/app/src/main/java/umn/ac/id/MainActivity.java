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

        Button btnWeek8a, btnWeek8b;
        btnWeek8a = findViewById(R.id.Week8a);
        btnWeek8b = findViewById(R.id.Week8b);

        btnWeek8a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openWeek8a();
            }
        });

        btnWeek8b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openWeek8b();
            }
        });
    }

    public void openWeek8a (){
        Intent intent = new Intent(MainActivity.this, Week8a.class);
        startActivity(intent);
    }

    public void openWeek8b (){
        Intent intent = new Intent(MainActivity.this, Week8b.class);
        startActivity(intent);
    }

}