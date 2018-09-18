package com.tekshia.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity {
    //Button
    private Button btnRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        //Button OnClick
        btnRegister = findViewById(R.id.btnRegister);
        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                registerUser(getEmail(), getPassword(), getName());
            }
        });
    }

    private void registerUser(String email, String password, String name) {


    }

    //Obtain EditText Data Fields
    private String getEmail(){
        EditText editText = findViewById(R.id.edtEmail);
        return editText.getText().toString();
    }
    private String getPassword(){
        EditText editText = findViewById(R.id.edtPassword);
        return editText.getText().toString();
    }
    private String getName(){
        EditText editText = findViewById(R.id.edtName);
        return editText.getText().toString();
    }
}
