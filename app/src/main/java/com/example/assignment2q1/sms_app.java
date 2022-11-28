package com.example.assignment2q1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class sms_app extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sms_app);

        getSupportActionBar().hide();


        Button send=findViewById(R.id.send);

        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sms();
            }
        });

    }
    public void sms(){

        EditText number=findViewById(R.id.number);
        EditText message=findViewById(R.id.message);

        String num=number.getText().toString();
        String sms=message.getText().toString();

        SmsManager smsmanager= SmsManager.getDefault();
        smsmanager.sendTextMessage(num,null,sms,null,null);

        Toast.makeText(getApplicationContext(),"Sms Send",Toast.LENGTH_LONG).show();
    }
}