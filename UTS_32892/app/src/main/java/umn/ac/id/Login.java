package umn.ac.id;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    Button btnLogin;
    EditText loginText, passwordText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampilan_login);

        loginText = findViewById(R.id.email);
        passwordText = findViewById(R.id.password);
        btnLogin = findViewById(R.id.btnLogin);


        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = loginText.getText().toString();
                String password = passwordText.getText().toString();

                if(username.equals("uasmobile") && (password.equals("uasmobilegenap"))) {
                    openDaftarMusic();
                }else{
                    Toast.makeText(Login.this, "Wrong Email/Password ", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    public void openDaftarMusic (){
        Intent intent = new Intent(Login.this, DaftarLagu.class);
        startActivity(intent);
    }



}