package com.example.mateusjose.boutiques;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

    }



    public void SignUp(View view){
        Toast.makeText(this, "sign up", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(LoginActivity.this, SignUpActivity.class);
        startActivity(intent);

    }

    public void Login(View view){

        EditText cellphone= (EditText) findViewById(R.id.etNumeroTelefone);
        EditText password= (EditText) findViewById(R.id.etPalavraPasse);



        if(cellphone.getText().toString().equals("912444444") && password.getText().toString().equals("qwertyuiop")){
            Toast.makeText(this, "succesfull login", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(LoginActivity.this, MainActivity.class);
            startActivity(intent);
        }
        else{
            Toast.makeText(this, "a palavra-passe e o numero nao combinao", Toast.LENGTH_SHORT).show();
        }
    }

    public void ForgotPassword(View view){
        Toast.makeText(this, "esqueci a palavra-passa", Toast.LENGTH_SHORT).show();
    }


}
