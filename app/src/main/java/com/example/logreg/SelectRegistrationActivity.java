package com.example.logreg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SelectRegistrationActivity extends AppCompatActivity {
    private Button donor_button;
    private Button recipient_button;
    private TextView back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_registration);
        donor_button=findViewById(R.id.donor);
        recipient_button=findViewById(R.id.recipient);
        donor_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SelectRegistrationActivity.this,DonorRegistrationActivity.class);
                startActivity(intent);
            }
        });
        recipient_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SelectRegistrationActivity.this,RecipientRegistrationActivity.class);
                startActivity(intent);
            }
        });
        back=findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SelectRegistrationActivity.this,LogIn.class);
                startActivity(intent);
            }
        });
    }
}