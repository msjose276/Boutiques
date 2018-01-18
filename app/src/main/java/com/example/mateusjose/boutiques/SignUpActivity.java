package com.example.mateusjose.boutiques;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SignUpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        EditText fullName= (EditText) findViewById(R.id.etFullName);
        EditText cellPhone= (EditText) findViewById(R.id.etCellPhone);
        EditText birthday= (EditText) findViewById(R.id.etBirthday);
        EditText password= (EditText) findViewById(R.id.etPassword);
        EditText confirmPassword= (EditText) findViewById(R.id.etConfirmPassword);
        TextView signUp= (TextView) findViewById(R.id.tvSignup);
        TextView login= (TextView) findViewById(R.id.tvLogin);

    }


    //mateus: login method
    public void Login (View view){
        Toast.makeText(this, "sign up", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(SignUpActivity.this, LoginActivity.class);
        startActivity(intent);


    }
    //mateus : sign up method
    public void SignUp (View view){
        EditText fullName= (EditText) findViewById(R.id.etFullName);
        EditText cellPhone= (EditText) findViewById(R.id.etCellPhone);
        EditText birthday= (EditText) findViewById(R.id.etBirthday);
        EditText password= (EditText) findViewById(R.id.etPassword);
        EditText confirmPassword= (EditText) findViewById(R.id.etConfirmPassword);

        if(fullName.getText().toString().equals("")){
            Toast.makeText(this, "preenche o nome completo", Toast.LENGTH_SHORT).show();

        }
        else if(cellPhone.getText().toString().equals("")){
            Toast.makeText(this, "preenche o numero", Toast.LENGTH_SHORT).show();

        }
        else if(birthday.getText().toString().equals("")){
            Toast.makeText(this, "preenche a a data de nascimento", Toast.LENGTH_SHORT).show();

        }
        else if(password.getText().toString().equals("")){
            Toast.makeText(this, "precisa-se da palavra passe", Toast.LENGTH_SHORT).show();

        }
        else if(confirmPassword.getText().toString().equals("")){
            Toast.makeText(this, "confirma a palavra passe", Toast.LENGTH_SHORT).show();

        }
        else if(!confirmPassword.getText().toString().equals(password.getText().toString())){
            Toast.makeText(this, "as palavras-passes nao sao iguais", Toast.LENGTH_SHORT).show();

        }
        else if(password.getText().toString().length()<8){
            Toast.makeText(this, "palavra passe muito curta", Toast.LENGTH_SHORT).show();

        }
        else{

            Toast.makeText(this, "successful sign up", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(SignUpActivity.this, MainActivity.class);
            startActivity(intent);

        }




    }

}
