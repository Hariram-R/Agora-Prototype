package com.hari.app.agora_prototype;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SignIn extends AppCompatActivity {

    Button SignIn;
    TextView signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        SignIn = findViewById(R.id.signIn);
        signup=findViewById(R.id.text2);

        SignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent openHome = new Intent(SignIn.this,HomeActivity.class);
                startActivity(openHome);
                finishAffinity();
            }
        });

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent openSignup = new Intent(SignIn.this,SignUp.class);
                startActivity(openSignup);
            }
        });
    }
}
