package com.siladem.ulubus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class dilek_sikayet extends AppCompatActivity {

    EditText editText;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dilek_sikayet);

        editText = findViewById(R.id.oneriTxt);




    }

    public void oneriEkle(View view) {

        String oneri = editText.getText().toString();
        Intent emailIntent = new Intent(android.content.Intent.ACTION_SEND);
        emailIntent.setType("plain/text");
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Dilek-Sikayet");
        emailIntent.putExtra(Intent.EXTRA_TEXT, oneri);
        String aEmailList[] = {"ulubusturizm@gmail.com"};
        emailIntent.putExtra(android.content.Intent.EXTRA_EMAIL, aEmailList);
        startActivity(emailIntent);

    }
}
