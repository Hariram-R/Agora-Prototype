package com.hari.app.agora_prototype;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ElectionsActivity extends AppCompatActivity {

    Button election1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_elections);

        election1=findViewById(R.id.election1);
        election1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent openVote = new Intent(ElectionsActivity.this,VoteActivity.class);
                startActivity(openVote);
                finish();
            }
        });
    }
}
