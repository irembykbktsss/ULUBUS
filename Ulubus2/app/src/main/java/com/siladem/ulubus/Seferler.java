package com.siladem.ulubus;

import android.content.ClipData;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

//import com.siladem.ulubus.db.MySqlDb;
//import com.siladem.ulubus.db.SeferDao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Seferler extends AppCompatActivity {
    int sefer_id,dolu_koltuklar;
    TextView bilgilerView;
    ListView listView;
    int sefer_ucret;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seferler);

        bilgilerView = findViewById(R.id.bilgilerView);
        listView = findViewById(R.id.listView);
        Bundle extras = getIntent().getExtras();
        final Veritabanı myDatabase = new Veritabanı(Seferler.this);

        final List<Integer> ids = new ArrayList<>();

        final String neredenTxt = extras.getString("nereden");
        final String nereyeTxt = extras.getString("nereye");
        final String tarihTxt = extras.getString("tarih");


        bilgilerView.setText(neredenTxt + " - " + nereyeTxt);




        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,myDatabase.seferListele(neredenTxt,nereyeTxt));

        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                Intent intent = new Intent(getApplicationContext(), Koltuk.class);
                intent.putExtra("nereden", neredenTxt);
                intent.putExtra("nereye", nereyeTxt);
                intent.putExtra("tarih", tarihTxt);
                intent.putExtra("id", sefer_id);
                intent.putExtra("ucret", myDatabase.getUcret(neredenTxt,nereyeTxt));

                startActivity(intent);

            }
        });



    }



    public void menuyeDon(View view){
        Intent intent = new Intent(getApplicationContext(),MainActivity.class);
        startActivity(intent);
    }
}
