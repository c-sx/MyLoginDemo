package com.example.a19633.logindemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

class Contact {
    String contactName;
    String contactTelenum;

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public void setContactTelenum(String contactTelenum) {
        this.contactTelenum = contactTelenum;
    }
}

public class NewContactActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_contact);
        Button btnNewContact = findViewById(R.id.btn_new_contact_confirm);
        btnNewContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Contact contact = new Contact();
                final EditText name = findViewById(R.id.et_new_contact_name);
                final EditText num = findViewById(R.id.et_new_contact_telenum);
                String contactName = name.getText().toString();
                String contactTelenum = num.getText().toString();
                contact.setContactName(contactName);
                contact.setContactTelenum(contactTelenum);
            }
        });
    }
}
