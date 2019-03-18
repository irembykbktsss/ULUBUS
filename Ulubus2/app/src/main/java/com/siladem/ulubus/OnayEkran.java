package com.siladem.ulubus;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import java.util.Random;

public class OnayEkran extends AppCompatActivity {
    String nereden,nereye,tarih,ad,soyad,tc,telefon,email,koltuk_no,mesaj;
    private static final int MY_PERMISSIONS_REQUEST_SEND_SMS =0 ;
    int toplam_ucret , def_ucret , yolcuSayi;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle extras = getIntent().getExtras();

        nereden = extras.getString("nereden");
        nereye = extras.getString("nereye");
        tarih = extras.getString("tarih");
        yolcuSayi = extras.getInt("yolcuSayi");
        toplam_ucret = extras.getInt("toplam_ucret");
        def_ucret = extras.getInt("def_ucret");
        ad = extras.getString("ad");
        soyad = extras.getString("soyad");
        tc = extras.getString("tc");
        telefon = extras.getString("telefon");
        email = extras.getString("email");
        koltuk_no = extras.getString("koltuk_no");
        setContentView(R.layout.activity_onay_ekran);


        Random r=new Random();
        int ran=r.nextInt(1000000000);
        mesaj = ran + " " +  " NUMARALI BILETINIZ : " + "\n" +  nereden + " " + "-" + " " +  nereye + "\n" + "Tarih :" + " " + tarih + "\n" + "Koltuk/Koltuklar : " + " " + koltuk_no ;







    }
    public void email(View View){

        Intent emailIntent = new Intent(android.content.Intent.ACTION_SEND);
        emailIntent.setType("plain/text");
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Biletiniz");
        emailIntent.putExtra(Intent.EXTRA_TEXT, mesaj);
        String aEmailList[] = { email };
        emailIntent.putExtra(android.content.Intent.EXTRA_EMAIL, aEmailList);
        startActivity(emailIntent);

    }
    public void sms(View view) {
        Log.i("Send SMS", "");
        Intent smsIntent = new Intent(Intent.ACTION_VIEW);

        smsIntent.setData(Uri.parse("smsto:"));
        smsIntent.setType("vnd.android-dir/mms-sms");
        smsIntent.putExtra("address"  , new String (telefon));
        smsIntent.putExtra("sms_body"  , mesaj);

        try {
            startActivity(smsIntent);
            finish();
            Log.i("Finished sending SMS...", "");
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(OnayEkran.this,
                    "SMS faild, please try again later.", Toast.LENGTH_SHORT).show();
        }
    }


    public void onay(View view){
        Intent intent = new Intent(getApplicationContext(),MainActivity.class);
        startActivity(intent);

    }
}
