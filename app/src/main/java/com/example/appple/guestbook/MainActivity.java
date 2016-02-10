package com.example.appple.guestbook;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    EditText firstName;
    EditText lastName;
    EditText phoneNumber;
    EditText emailAdd;
    ListView showName;
    Button submitButton;
    ArrayList<String> storePlace = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        submitButton = (Button) findViewById(R.id.button);
        showName = (ListView)findViewById(R.id.listView);
        firstName =(EditText) findViewById(R.id.fname);
        lastName = (EditText) findViewById(R.id.lname);
        phoneNumber = (EditText) findViewById(R.id.phonenum);
        emailAdd = (EditText) findViewById(R.id.emailaddress);
//some changes hhh
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String getInput = firstName.getText().toString() + lastName.getText().toString();
                if(storePlace.contains(getInput)){
                    Toast.makeText(getApplicationContext(),"Item exists",Toast.LENGTH_SHORT).show();
                }else if(getInput == null || getInput.trim().equals("")){
                    Toast.makeText(getApplicationContext(),"Item exists",Toast.LENGTH_SHORT).show();
                }else {
                    storePlace.add(getInput);
                    ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,storePlace);
                    Toast.makeText(getApplicationContext(), "Successfully Submit", Toast.LENGTH_SHORT).show();
                    showName.setAdapter(adapter);
                    ((EditText) findViewById(R.id.fname)).setText("  ");
                    ((EditText) findViewById(R.id.lname)).setText("  ");
                }
            }
        });
    }
}
