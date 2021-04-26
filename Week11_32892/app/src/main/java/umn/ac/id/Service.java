package umn.ac.id;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Service {
    @GET("posts")
    Call<ArrayList<Data>> getAllData();
}
