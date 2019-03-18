 package com.siladem.ulubus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

 public class MainActivity extends AppCompatActivity {

     TextView neredenText;
     TextView nereyetext;
     TextView tarihText;
     EditText yolcuSayi;

     //Spinner için oluşturulan arrayler
     private String[] nereden_iller = {"ISTANBUL", "ANKARA","IZMIR","BURSA","ANTALYA","TRABZON","DIYARBAKIR","ERZURUM","SINOP","SIVAS","ESKISEHIR"};
     private String[] nereye_iller = {"ISTANBUL","ANKARA","BURSA","ANTALYA","IZMIR","TRABZON","ESKISEHIR"};
     private ArrayAdapter<String> neredenAdapter;
     private ArrayAdapter<String> nereyeAdapter;
     private Spinner nereden_spinner;
     private Spinner nereye_spinner;

     // Menü inflater, 2 activity calıstırıyor
     @Override
     public boolean onCreateOptionsMenu(Menu menu) {

         MenuInflater menuInflater = getMenuInflater();
         menuInflater.inflate(R.menu.kullanici_menu,menu);

         return super.onCreateOptionsMenu(menu);

     }

     @Override
     public boolean onOptionsItemSelected(MenuItem item) {
         if(item.getItemId()  == R.id.dilekSikayet){
             Intent intent = new Intent(getApplicationContext(),dilek_sikayet.class);
             startActivity(intent);
         }
         if(item.getItemId() == R.id.iletisim){
             Intent intent = new Intent(getApplicationContext(),iletisim.class);
             startActivity(intent);
         }

         return super.onOptionsItemSelected(item);
     }

     @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        tarihText = findViewById(R.id.tarihText);


        nereden_spinner = findViewById(R.id.spinner_nereden);
        nereye_spinner = findViewById(R.id.spinner_nereye);

        neredenAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, nereden_iller);
        nereyeAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,nereden_iller);

         neredenAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
         nereyeAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

         nereden_spinner.setAdapter(neredenAdapter);
         nereye_spinner.setAdapter(nereyeAdapter);



     }


    public void seferAra(View view){
         String nereden = nereden_spinner.getSelectedItem().toString();
         String nereye = nereye_spinner.getSelectedItem().toString();
         String tarih = tarihText.getText().toString();




        if (nereden.trim().equals("")) {
            Toast.makeText(this, "Nereden Bölümü Boş Bırakılamaz.", Toast.LENGTH_LONG).show();
        } else if (nereye.trim().equals("")) {
            Toast.makeText(this, "Nereye Bölümü Boş Bırakılamaz", Toast.LENGTH_LONG).show();
        } else if (tarih.trim().equals("")) {
            Toast.makeText(this, "Tarih Bölümü Boş Bırakılamaz", Toast.LENGTH_LONG).show();
        }else{
            Intent intent = new Intent(getApplicationContext(),Seferler.class);
            intent.putExtra("nereden",nereden);
            intent.putExtra("nereye",nereye);
            intent.putExtra("tarih",tarih);


            startActivity(intent);
        }

    }


}
