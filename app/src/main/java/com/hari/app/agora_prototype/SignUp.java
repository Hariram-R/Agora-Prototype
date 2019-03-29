package com.hari.app.agora_prototype;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SignUp extends AppCompatActivity {

    Button signUp;
    TextView signIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        signUp=findViewById(R.id.SignUp);
        signIn=findViewById(R.id.text22);

        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent openHome = new Intent(SignUp.this,HomeActivity.class);
                startActivity(openHome);
                finishAffinity();
            }
        });

        signIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent signup = new Intent(SignUp.this,SignIn.class);
                startActivity(signup);
                finishAffinity();
            }
        });
    }
}
