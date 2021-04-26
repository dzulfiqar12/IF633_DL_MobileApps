package umn.ac.id;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        View mainLayout = findViewById(R.id.mainLayout);


        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        Retrofit retrofit = new Retrofit
                .Builder()
                .baseUrl("https://jsonplaceholder.typicode.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        Service service = retrofit.create(Service.class);


        Call<ArrayList<Data>> dataCall = service.getAllData();

        dataCall.enqueue(new Callback<ArrayList<Data>>() {
            @Override
            public void onResponse(@NonNull Call<ArrayList<Data>> call, @NonNull Response<ArrayList<Data>> response) {

                recyclerView.setVisibility(View.VISIBLE);
                    ArrayList<Data> data = response.body();
                    recyclerView.setAdapter(new AdapterData(data));

            }

            @Override
            public void onFailure(@NonNull Call<ArrayList<Data>> call, @NonNull Throwable t) {


            }
        });
    }
}
