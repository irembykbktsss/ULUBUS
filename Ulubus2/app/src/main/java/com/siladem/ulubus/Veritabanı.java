package com.siladem.ulubus;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

public class Veritabanı extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "ulubus";
    private static final int DATABASE_VERSION = 1;

    public Veritabanı(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE " + "seferler" + "("
                + "id" + " INTEGER PRIMARY KEY, "
                + "kalkis_yeri" + " TEXT NOT NULL, "
                + "varis_yeri" + " TEXT NOT NULL, "
                + "kalkis_zamani" + " TEXT NOT NULL, "
                + "varis_zamani" + " TEXT NOT NULL, "
                + "ucret" + " TEXT NOT NULL, "
                + "koltuk_sayisi" + " TEXT NOT NULL, "
                + "otobus_tipi" + " TEXT NOT NULL)");


       db.execSQL("CREATE TABLE " + "koltuklar" + "("
                + "id" + " INTEGER PRİMARY KEY, "
                + "koltuk1" + " INTEGER NOT NULL, "
                + "koltuk2" + " INTEGER NOT NULL, "
                + "koltuk3" + " INTEGER NOT NULL, "
                + "koltuk4" + " INTEGER NOT NULL, "
                + "koltuk5" + " INTEGER NOT NULL, "
                + "koltuk6" + " INTEGER NOT NULL, "
                + "koltuk7" + " INTEGER NOT NULL, "
                + "koltuk8" + " INTEGER NOT NULL, "
                + "koltuk9" + " INTEGER NOT NULL, "
                + "koltuk10" + "INTEGER NOT NULL, "
                + "koltuk11" + " INTEGER NOT NULL, "
                + "koltuk12" + " INTEGER NOT NULL, "
                + "koltuk13" + " INTEGER NOT NULL, "
                + "koltuk14" + " INTEGER NOT NULL, "
                + "koltuk15" + " INTEGER NOT NULL, "
                + "koltuk16" + " INTEGER NOT NULL, "
                + "koltuk17" + " INTEGER NOT NULL, "
                + "koltuk18" + " INTEGER NOT NULL, "
                + "koltuk19" + " INTEGER NOT NULL, "
                + "koltuk20" + " INTEGER NOT NULL, "
                + "koltuk21" + " INTEGER NOT NULL, "
                + "koltuk22" + " INTEGER NOT NULL, "
                + "koltuk23" + " INTEGER NOT NULL, "
                + "koltuk24" + " INTEGER NOT NULL, "
                + "koltuk25" + " INTEGER NOT NULL, "
                + "koltuk26" + " INTEGER NOT NULL, "
                + "koltuk27" + " INTEGER NOT NULL, "
                + "koltuk28" + " INTEGER NOT NULL, "
                + "koltuk29" + " INTEGER NOT NULL, "
                + "koltuk30" + " INTEGER NOT NULL, "
                + "koltuk31" + " INTEGER NOT NULL, "
                + "koltuk32" + " INTEGER NOT NULL, "
                + "koltuk33" + " INTEGER NOT NULL, "
                + "koltuk34" + " INTEGER NOT NULL, "
                + "koltuk35" + " INTEGER NOT NULL, "
                + "koltuk36" + " INTEGER NOT NULL, "
                + "koltuk37" + " INTEGER NOT NULL, "
                + "koltuk38" + " INTEGER NOT NULL, "
                + "koltuk39" + " INTEGER NOT NULL, "
                + "koltuk40" + " INTEGER NOT NULL)");


        try {
            db.execSQL("INSERT INTO \"seferler\" VALUES (1,\"ISTANBUL\",\"ANKARA\",\"10:00\",\"17:30\",\"75\",\"40\",\"2+1\")");
            db.execSQL("INSERT INTO \"seferler\" VALUES (2,\"ISTANBUL\",\"IZMIR\",\"10:00\",\"19:30\",\"100\",\"40\",\"2+1\")");
            db.execSQL("INSERT INTO \"seferler\" VALUES (3,\"ISTANBUL\",\"BURSA\",\"10:00\",\"14:00\",\"40\",\"40\",\"2+1\")");
            db.execSQL("INSERT INTO \"seferler\" VALUES (4,\"ISTANBUL\",\"ANTALYA\",\"9:00\",\"21:45\",\"120\",\"40\",\"2+1\")");
            db.execSQL("INSERT INTO \"seferler\" VALUES (5,\"ISTANBUL\",\"TRABZON\",\"18:00\",\"10:00\",\"120\",\"40\",\"2+1\")");
            db.execSQL("INSERT INTO \"seferler\" VALUES (6,\"ISTANBUL\",\"DIYARBAKIR\",\"14:45\",\"09:15\",\"150\",\"40\",\"2+1\")");
            db.execSQL("INSERT INTO \"seferler\" VALUES (7,\"ISTANBUL\",\"ERZURUM\",\"11:00\",\"05:30\",\"140\",\"40\",\"2+1\")");
            db.execSQL("INSERT INTO \"seferler\" VALUES (8,\"ISTANBUL\",\"SINOP\",\"08:30\",\"20:45\",\"100\",\"40\",\"2+1\")");
            db.execSQL("INSERT INTO \"seferler\" VALUES (9,\"ISTANBUL\",\"SIVAS\",\"17:30\",\"07:05\",\"125\",\"40\",\"2+1\")");
            db.execSQL("INSERT INTO \"seferler\" VALUES (10,\"ISTANBUL\",\"ESKIŞEHIR\",\"13:00\",\"18:30\",\"50\",\"40\",\"2+1\")");
            db.execSQL("INSERT INTO \"seferler\" VALUES (11,\"ANKARA\",\"IZMIR\",\"10:00\",\"18:00\",\"85\",\"40\",\"2+1\")");
            db.execSQL("INSERT INTO \"seferler\" VALUES (12,\"ANKARA\",\"BURSA\",\"9:00\",\"14:45\",\"60\",\"40\",\"2+1\")");
            db.execSQL("INSERT INTO \"seferler\" VALUES (13,\"ANKARA\",\"ANTALYA\",\"11:00\",\"18:30\",\"75\",\"40\",\"2+1\")");
            db.execSQL("INSERT INTO \"seferler\" VALUES (14,\"ANKARA\",\"DIYARBAKIR\",\"14:00\",\"04:30\",\"100\",\"40\",\"2+1\")");
            db.execSQL("INSERT INTO \"seferler\" VALUES (15,\"ANKARA\",\"TRABZON\",\"00:00\",\"12:00\",\"85\",\"40\",\"2+1\")");
            db.execSQL("INSERT INTO \"seferler\" VALUES (16,\"ANKARA\",\"ISTANBUL\",\"19:00\",\"02:30\",\"75\",\"40\",\"2+1\")");
            db.execSQL("INSERT INTO \"seferler\" VALUES (17,\"ANKARA\",\"ERZURUM\",\"10:00\",\"23:30\",\"100\",\"40\",\"2+1\")");
            db.execSQL("INSERT INTO \"seferler\" VALUES (18,\"ANKARA\",\"SINOP\",\"10:30\",\"18:00\",\"70\",\"40\",\"2+1\")");
            db.execSQL("INSERT INTO \"seferler\" VALUES (19,\"ANKARA\",\"ESKIŞEHIR\",\"9:00\",\"12:00\",\"30\",\"40\",\"2+1\")");
            db.execSQL("INSERT INTO \"seferler\" VALUES (20,\"IZMIR\",\"ISTANBUL\",\"10:30\",\"20:00\",\"100\",\"40\",\"2+1\")");
            db.execSQL("INSERT INTO \"seferler\" VALUES (21,\"IZMIR\",\"ANKARA\",\"11:00\",\"19:00\",\"85\",\"40\",\"2+1\")");
            db.execSQL("INSERT INTO \"seferler\" VALUES (22,\"IZMIR\",\"BURSA\",\"10:30\",\"16:00\",\"50\",\"40\",\"2+1\")");
            db.execSQL("INSERT INTO \"seferler\" VALUES (23,\"IZMIR\",\"ANTALYA\",\"10:00\",\"17:15\",\"75\",\"40\",\"2+1\")");
            db.execSQL("INSERT INTO \"seferler\" VALUES (24,\"IZMIR\",\"TRABZON\",\"14:00\",\"10:30\",\"145\",\"40\",\"2+1\")");
            db.execSQL("INSERT INTO \"seferler\" VALUES (26,\"IZMIR\",\"ERZURUM\",\"15:00\",\"12:30\",\"140\",\"40\",\"2+1\")");
            db.execSQL("INSERT INTO \"seferler\" VALUES (27,\"IZMIR\",\"SINOP\",\"16:30\",\"10:00\",\"130\",\"40\",\"2+1\")");
            db.execSQL("INSERT INTO \"seferler\" VALUES (28,\"IZMIR\",\"ESKIŞEHIR\",\"10:30\",\"16:45\",\"70\",\"40\",\"2+1\")");
            db.execSQL("INSERT INTO \"seferler\" VALUES (29,\"BURSA\",\"ISTANBUL\",\"11:00\",\"15:00\",\"40\",\"40\",\"2+1\")");
            db.execSQL("INSERT INTO \"seferler\" VALUES (30,\"BURSA\",\"ANKARA\",\"11:00\",\"16:45\",\"60\",\"40\",\"2+1\")");
            db.execSQL("INSERT INTO \"seferler\" VALUES (31,\"BURSA\",\"IZMIR\",\"10:00\",\"15:30\",\"50\",\"40\",\"2+1\")");
            db.execSQL("INSERT INTO \"seferler\" VALUES (32,\"BURSA\",\"TRABZON\",\"19:30\",\"13:00\",\"130\",\"40\",\"2+1\")");
            db.execSQL("INSERT INTO \"seferler\" VALUES (33,\"BURSA\",\"ANTALYA\",\"08:00\",\"17:00\",\"80\",\"40\",\"2+1\")");
            db.execSQL("INSERT INTO \"seferler\" VALUES (34,\"BURSA\",\"SINOP\",\"22:30\",\"10:00\",\"100\",\"40\",\"2+1\")");
            db.execSQL("INSERT INTO \"seferler\" VALUES (36,\"BURSA\",\"ERZURUM\",\"15:30\",\"09:40\",\"140\",\"40\",\"2+1\")");
            db.execSQL("INSERT INTO \"seferler\" VALUES (38,\"BURSA\",\"ESKIŞEHIR\",\"09:00\",\"11:30\",\"30\",\"40\",\"2+1\")");
            db.execSQL("INSERT INTO \"seferler\" VALUES (39,\"ANTALYA\",\"ISTANBUL\",\"08:00\",\"20:45\",\"120\",\"40\",\"2+1\")");
            db.execSQL("INSERT INTO \"seferler\" VALUES (40,\"ANTALYA\",\"IZMIR\",\"09:00\",\"16:15\",\"75\",\"40\",\"2+1\")");
            db.execSQL("INSERT INTO \"seferler\" VALUES (41,\"ANTALYA\",\"ANKARA\",\"10:00\",\"17:30\",\"75\",\"40\",\"2+1\")");
            db.execSQL("INSERT INTO \"seferler\" VALUES (42,\"ANTALYA\",\"BURSA\",\"08:30\",\"17:30\",\"80\",\"40\",\"2+1\")");
            db.execSQL("INSERT INTO \"seferler\" VALUES (43,\"ANTALYA\",\"ERZURUM\",\"10:00\",\"07:55\",\"140\",\"40\",\"2+1\")");
            db.execSQL("INSERT INTO \"seferler\" VALUES (46,\"ANTALYA\",\"TRABZON\",\"16:30\",\"12:40\",\"140\",\"40\",\"2+1\")");
            db.execSQL("INSERT INTO \"seferler\" VALUES (47,\"ANTALYA\",\"ESKIŞEHIR\",\"10:00\",\"16:45\",\"60\",\"40\",\"2+1\")");
            db.execSQL("INSERT INTO \"seferler\" VALUES (48,\"ESKIŞEHIR\",\"ISTANBUL\",\"11:00\",\"18:30\",\"50\",\"40\",\"2+1\")");
            db.execSQL("INSERT INTO \"seferler\" VALUES (49,\"ESKIŞEHIR\",\"BURSA\",\"08:00\",\"10:30\",\"30\",\"40\",\"2+1\")");
            db.execSQL("INSERT INTO \"seferler\" VALUES (50,\"ESKIŞEHIR\",\"ANKARA\",\"07:30\",\"10:30\",\"30\",\"40\",\"2+1\")");
            db.execSQL("INSERT INTO \"seferler\" VALUES (51,\"ESKIŞEHIR\",\"ANTALYA\",\"9:00\",\"17:45\",\"60\",\"40\",\"2+1\")");
            db.execSQL("INSERT INTO \"seferler\" VALUES (52,\"ESKIŞEHIR\",\"IZMIR\",\"09:30\",\"15:45\",\"70\",\"40\",\"2+1\")");
            db.execSQL("INSERT INTO \"seferler\" VALUES (53,\"ESKIŞEHIR\",\"TRABZON\",\"21:00\",\"12:10\",\"100\",\"40\",\"2+1\")");
            db.execSQL("INSERT INTO \"seferler\" VALUES (54,\"TRABZON\",\"ISTANBUL\",\"10:30\",\"02:30\",\"120\",\"40\",\"2+1\")");
            db.execSQL("INSERT INTO \"seferler\" VALUES (55,\"TRABZON\",\"ANKARA\",\"9:00\",\"21:00\",\"85\",\"40\",\"2+1\")");
            db.execSQL("INSERT INTO \"seferler\" VALUES (56,\"TRABZON\",\"IZMIR\",\"10:00\",\"08:30\",\"145\",\"40\",\"2+1\")");
            db.execSQL("INSERT INTO \"seferler\" VALUES (57,\"TRABZON\",\"ESKIŞEHIR\",\"07:30\",\"22:40\",\"100\",\"40\",\"2+1\")");
            db.execSQL("INSERT INTO \"seferler\" VALUES (58,\"TRABZON\",\"ANTALYA\",\"11:00\",\"07:10\",\"140\",\"40\",\"2+1\")");
            db.execSQL("INSERT INTO \"seferler\" VALUES (59,\"TRABZON\",\"SINOP\",\"11:30\",\"21:15\",\"70\",\"40\",\"2+1\")");
            db.execSQL("INSERT INTO \"seferler\" VALUES (60,\"TRABZON\",\"BURSA\",\"12:30\",\"07:30\",\"126\",\"40\",\"2+1\")");
            db.execSQL("INSERT INTO \"seferler\" VALUES (64,\"SINOP\",\"ISTANBUL\",\"09:30\",\"21:00\",\"100\",\"40\",\"2+1\")");
            db.execSQL("INSERT INTO \"seferler\" VALUES (65,\"SINOP\",\"ANKARA\",\"10:30\",\"18:45\",\"70\",\"40\",\"2+1\")");
            db.execSQL("INSERT INTO \"seferler\" VALUES (66,\"SINOP\",\"IZMIR\",\"15:00\",\"08:50\",\"130\",\"40\",\"2+1\")");
            db.execSQL("INSERT INTO \"seferler\" VALUES (67,\"SINOP\",\"BURSA\",\"16:00\",\"04:45\",\"100\",\"40\",\"2+1\")");
            db.execSQL("INSERT INTO \"seferler\" VALUES (69,\"SINOP\",\"TRABZON\",\"10:00\",\"19:45\",\"70\",\"40\",\"2+1\")");
            db.execSQL("INSERT INTO \"seferler\" VALUES (70,\"ERZURUM\",\"ISTANBUL\",\"16:00\",\"10:45\",\"140\",\"40\",\"2+1\")");
            db.execSQL("INSERT INTO \"seferler\" VALUES (71,\"ERZURUM\",\"ANKARA\",\"10:00\",\"23:30\",\"100\",\"40\",\"2+1\")");
            db.execSQL("INSERT INTO \"seferler\" VALUES (72,\"ERZURUM\",\"IZMIR\",\"10:00\",\"07:30\",\"140\",\"40\",\"2+1\")");
            db.execSQL("INSERT INTO \"seferler\" VALUES (73,\"ERZURUM\",\"BURSA\",\"13:00\",\"08:45\",\"140\",\"40\",\"2+1\")");
            db.execSQL("INSERT INTO \"seferler\" VALUES (74,\"ERZURUM\",\"ANTALYA\",\"10:30\",\"08:00\",\"140\",\"40\",\"2+1\")");
            db.execSQL("INSERT INTO \"seferler\" VALUES (75,\"ERZURUM\",\"TRABZON\",\"19:00\",\"00:30\",\"50\",\"40\",\"2+1\")");
            db.execSQL("INSERT INTO \"seferler\" VALUES (76,\"ISTANBUL\",\"ANKARA\",\"12:00\",\"19:30\",\"75\",\"40\",\"2+1\")");
            db.execSQL("INSERT INTO \"seferler\" VALUES (77,\"ISTANBUL\",\"IZMIR\",\"14:00\",\"23:30\",\"100\",\"40\",\"2+1\")");
            db.execSQL("INSERT INTO \"seferler\" VALUES (78,\"ISTANBUL\",\"BURSA\",\"13:00\",\"17:00\",\"40\",\"40\",\"2+1\")");
            db.execSQL("INSERT INTO \"seferler\" VALUES (79,\"ISTANBUL\",\"ANTALYA\",\"15:00\",\"03:45\",\"120\",\"40\",\"2+1\")");
            db.execSQL("INSERT INTO \"seferler\" VALUES (83,\"ISTANBUL\",\"SINOP\",\"15:30\",\"03:45\",\"100\",\"40\",\"2+1\")");
            db.execSQL("INSERT INTO \"seferler\" VALUES (85,\"ISTANBUL\",\"ESKIŞEHIR\",\"17:00\",\"22:30\",\"50\",\"40\",\"2+1\")");
            db.execSQL("INSERT INTO \"seferler\" VALUES (86,\"ANKARA\",\"IZMIR\",\"15:00\",\"23:00\",\"85\",\"40\",\"2+1\")");
            db.execSQL("INSERT INTO \"seferler\" VALUES (87,\"ANKARA\",\"BURSA\",\"12:45\",\"18:30\",\"60\",\"40\",\"2+1\")");
            db.execSQL("INSERT INTO \"seferler\" VALUES (88,\"ANKARA\",\"ANTALYA\",\"14:30\",\"22:00\",\"75\",\"40\",\"2+1\")");
            db.execSQL("INSERT INTO \"seferler\" VALUES (90,\"ANKARA\",\"TRABZON\",\"11:00\",\"23:00\",\"85\",\"40\",\"2+1\")");
            db.execSQL("INSERT INTO \"seferler\" VALUES (91,\"ANKARA\",\"ISTANBUL\",\"10:30\",\"20:00\",\"75\",\"40\",\"2+1\")");
            db.execSQL("INSERT INTO \"seferler\" VALUES (94,\"ANKARA\",\"ESKIŞEHIR\",\"11:00\",\"14:00\",\"30\",\"40\",\"2+1\")");
            db.execSQL("INSERT INTO \"seferler\" VALUES (95,\"IZMIR\",\"ISTANBUL\",\"12:00\",\"21:30\",\"100\",\"40\",\"2+1\")");
            db.execSQL("INSERT INTO \"seferler\" VALUES (96,\"IZMIR\",\"ANKARA\",\"13:00\",\"21:00\",\"85\",\"40\",\"2+1\")");
            db.execSQL("INSERT INTO \"seferler\" VALUES (97,\"IZMIR\",\"BURSA\",\"12:00\",\"17:30\",\"50\",\"40\",\"2+1\")");
            db.execSQL("INSERT INTO \"seferler\" VALUES (98,\"IZMIR\",\"ANTALYA\",\"13:30\",\"20:45\",\"75\",\"40\",\"2+1\")");
            db.execSQL("INSERT INTO \"seferler\" VALUES (99,\"IZMIR\",\"TRABZON\",\"20:00\",\"16:30\",\"145\",\"40\",\"2+1\")");
            db.execSQL("INSERT INTO \"seferler\" VALUES (103,\"IZMIR\",\"ESKIŞEHIR\",\"13:15\",\"19:30\",\"70\",\"40\",\"2+1\")");
            db.execSQL("INSERT INTO \"seferler\" VALUES (104,\"BURSA\",\"ISTANBUL\",\"13:00\",\"17:00\",\"40\",\"40\",\"2+1\")");
            db.execSQL("INSERT INTO \"seferler\" VALUES (105,\"BURSA\",\"ANKARA\",\"14:30\",\"20:15\",\"60\",\"40\",\"2+1\")");
            db.execSQL("INSERT INTO \"seferler\" VALUES (106,\"BURSA\",\"IZMIR\",\"15:00\",\"20:30\",\"50\",\"40\",\"2+1\")");
            db.execSQL("INSERT INTO \"seferler\" VALUES (107,\"BURSA\",\"TRABZON\",\"08:00\",\"01:30\",\"130\",\"40\",\"2+1\")");
            db.execSQL("INSERT INTO \"seferler\" VALUES (108,\"BURSA\",\"ANTALYA\",\"12:45\",\"21:45\",\"80\",\"40\",\"2+1\")");
            db.execSQL("INSERT INTO \"seferler\" VALUES (109,\"BURSA\",\"SINOP\",\"10:00\",\"21:30\",\"100\",\"40\",\"2+1\")");
            db.execSQL("INSERT INTO \"seferler\" VALUES (113,\"BURSA\",\"ESKIŞEHIR\",\"11:30\",\"14:00\",\"30\",\"40\",\"2+1\")");
            db.execSQL("INSERT INTO \"seferler\" VALUES (114,\"ANTALYA\",\"ISTANBUL\",\"23:00\",\"11:45\",\"120\",\"40\",\"2+1\")");
            db.execSQL("INSERT INTO \"seferler\" VALUES (115,\"ANTALYA\",\"IZMIR\",\"15:00\",\"22:15\",\"75\",\"40\",\"2+1\")");
            db.execSQL("INSERT INTO \"seferler\" VALUES (116,\"ANTALYA\",\"ANKARA\",\"13:30\",\"20:30\",\"75\",\"40\",\"2+1\")");
            db.execSQL("INSERT INTO \"seferler\" VALUES (117,\"ANTALYA\",\"BURSA\",\"14:00\",\"23:00\",\"80\",\"40\",\"2+1\")");
            db.execSQL("INSERT INTO \"seferler\" VALUES (122,\"ANTALYA\",\"ESKIŞEHIR\",\"14:30\",\"21:15\",\"60\",\"40\",\"2+1\")");
            db.execSQL("INSERT INTO \"seferler\" VALUES (123,\"ESKIŞEHIR\",\"ISTANBUL\",\"14:30\",\"22:00\",\"50\",\"40\",\"2+1\")");
            db.execSQL("INSERT INTO \"seferler\" VALUES (124,\"ESKIŞEHIR\",\"BURSA\",\"10:00\",\"12:30\",\"30\",\"40\",\"2+1\")");
            db.execSQL("INSERT INTO \"seferler\" VALUES (125,\"ESKIŞEHIR\",\"ANKARA\",\"13:00\",\"16:00\",\"30\",\"40\",\"2+1\")");
            db.execSQL("INSERT INTO \"seferler\" VALUES (126,\"ESKIŞEHIR\",\"ANTALYA\",\"15:00\",\"23:45\",\"60\",\"40\",\"2+1\")");
            db.execSQL("INSERT INTO \"seferler\" VALUES (127,\"ESKIŞEHIR\",\"IZMIR\",\"17:45\",\"00:00\",\"70\",\"40\",\"2+1\")");
            db.execSQL("INSERT INTO \"seferler\" VALUES (130,\"TRABZON\",\"ANKARA\",\"23:00\",\"11:00\",\"85\",\"40\",\"2+1\")");
            db.execSQL("INSERT INTO \"seferler\" VALUES (131,\"TRABZON\",\"IZMIR\",\"20:00\",\"18:30\",\"145\",\"40\",\"2+1\")");
            db.execSQL("INSERT INTO \"seferler\" VALUES (132,\"TRABZON\",\"ESKIŞEHIR\",\"20:00\",\"11:10\",\"100\",\"40\",\"2+1\")");
            db.execSQL("INSERT INTO \"seferler\" VALUES (134,\"TRABZON\",\"SINOP\",\"22:00\",\"07:45\",\"70\",\"40\",\"2+1\")");
            db.execSQL("INSERT INTO \"seferler\" VALUES (135,\"TRABZON\",\"BURSA\",\"20:00\",\"15:00\",\"126\",\"40\",\"2+1\")");
            db.execSQL("INSERT INTO \"seferler\" VALUES (139,\"SINOP\",\"ISTANBUL\",\"22:00\",\"09:30\",\"100\",\"40\",\"2+1\")");
            db.execSQL("INSERT INTO \"seferler\" VALUES (142,\"SINOP\",\"BURSA\",\"23:00\",\"11:45\",\"100\",\"40\",\"2+1\")");
            db.execSQL("INSERT INTO \"seferler\" VALUES (144,\"SINOP\",\"TRABZON\",\"21:30\",\"07:15\",\"70\",\"40\",\"2+1\")");
            db.execSQL("INSERT INTO \"seferler\" VALUES (147,\"ERZURUM\",\"IZMIR\",\"21:00\",\"18:30\",\"140\",\"40\",\"2+1\")");
            db.execSQL("INSERT INTO \"seferler\" VALUES (151,\"ISTANBUL\",\"ANKARA\",\"19:00\",\"02:30\",\"75\",\"40\",\"2+1\")");
            db.execSQL("INSERT INTO \"seferler\" VALUES (152,\"ISTANBUL\",\"IZMIR\",\"21:00\",\"06:30\",\"100\",\"40\",\"2+1\")");
            db.execSQL("INSERT INTO \"seferler\" VALUES (153,\"ISTANBUL\",\"BURSA\",\"16:00\",\"20:00\",\"40\",\"40\",\"2+1\")");
            db.execSQL("INSERT INTO \"seferler\" VALUES (154,\"ISTANBUL\",\"ANTALYA\",\"21:00\",\"09:45\",\"120\",\"40\",\"2+1\")");
            db.execSQL("INSERT INTO \"seferler\" VALUES (160,\"ISTANBUL\",\"ESKIŞEHIR\",\"22:00\",\"03:30\",\"50\",\"40\",\"2+1\")");
            db.execSQL("INSERT INTO \"seferler\" VALUES (161,\"ANKARA\",\"IZMIR\",\"21:00\",\"05:00\",\"85\",\"40\",\"2+1\")");
            db.execSQL("INSERT INTO \"seferler\" VALUES (162,\"ANKARA\",\"BURSA\",\"19:00\",\"00:45\",\"60\",\"40\",\"2+1\")");
            db.execSQL("INSERT INTO \"seferler\" VALUES (163,\"ANKARA\",\"ANTALYA\",\"19:30\",\"03:00\",\"75\",\"40\",\"2+1\")");
            db.execSQL("INSERT INTO \"seferler\" VALUES (164,\"ANKARA\",\"DIYARBAKIR\",\"22:00\",\"12:30\",\"100\",\"40\",\"2+1\")");
            db.execSQL("INSERT INTO \"seferler\" VALUES (166,\"ANKARA\",\"ISTANBUL\",\"15:30\",\"01:00\",\"75\",\"40\",\"2+1\")");
            db.execSQL("INSERT INTO \"seferler\" VALUES (169,\"ANKARA\",\"ESKIŞEHIR\",\"15:00\",\"18:00\",\"30\",\"40\",\"2+1\")");
            db.execSQL("INSERT INTO \"seferler\" VALUES (170,\"IZMIR\",\"ISTANBUL\",\"13:30\",\"23:00\",\"100\",\"40\",\"2+1\")");
            db.execSQL("INSERT INTO \"seferler\" VALUES (171,\"IZMIR\",\"ANKARA\",\"16:00\",\"00:00\",\"85\",\"40\",\"2+1\")");
            db.execSQL("INSERT INTO \"seferler\" VALUES (172,\"IZMIR\",\"BURSA\",\"20:30\",\"02:00\",\"50\",\"40\",\"2+1\")");
            db.execSQL("INSERT INTO \"seferler\" VALUES (173,\"IZMIR\",\"ANTALYA\",\"20:15\",\"03:30\",\"75\",\"40\",\"2+1\")");
            db.execSQL("INSERT INTO \"seferler\" VALUES (178,\"IZMIR\",\"ESKIŞEHIR\",\"20:45\",\"03:00\",\"70\",\"40\",\"2+1\")");
            db.execSQL("INSERT INTO \"seferler\" VALUES (179,\"BURSA\",\"ISTANBUL\",\"18:00\",\"22:00\",\"40\",\"40\",\"2+1\")");
            db.execSQL("INSERT INTO \"seferler\" VALUES (180,\"BURSA\",\"ANKARA\",\"20:00\",\"01:45\",\"60\",\"40\",\"2+1\")");
            db.execSQL("INSERT INTO \"seferler\" VALUES (181,\"BURSA\",\"IZMIR\",\"22:00\",\"03:30\",\"50\",\"40\",\"2+1\")");
            db.execSQL("INSERT INTO \"seferler\" VALUES (183,\"BURSA\",\"ANTALYA\",\"21:30\",\"06:30\",\"80\",\"40\",\"2+1\")");
            db.execSQL("INSERT INTO \"seferler\" VALUES (188,\"BURSA\",\"ESKIŞEHIR\",\"13:00\",\"15:30\",\"30\",\"40\",\"2+1\")");
            db.execSQL("INSERT INTO \"seferler\" VALUES (189,\"ANTALYA\",\"ISTANBUL\",\"15:00\",\"03:45\",\"120\",\"40\",\"2+1\")");
            db.execSQL("INSERT INTO \"seferler\" VALUES (190,\"ANTALYA\",\"IZMIR\",\"22:30\",\"05:45\",\"75\",\"40\",\"2+1\")");
            db.execSQL("INSERT INTO \"seferler\" VALUES (191,\"ANTALYA\",\"ANKARA\",\"20:00\",\"03:30\",\"75\",\"40\",\"2+1\")");
            db.execSQL("INSERT INTO \"seferler\" VALUES (192,\"ANTALYA\",\"BURSA\",\"21:15\",\"06:15\",\"80\",\"40\",\"2+1\")");
            db.execSQL("INSERT INTO \"seferler\" VALUES (197,\"ANTALYA\",\"ESKIŞEHIR\",\"19:00\",\"01:45\",\"60\",\"40\",\"2+1\")");
            db.execSQL("INSERT INTO \"seferler\" VALUES (198,\"ESKIŞEHIR\",\"ISTANBUL\",\"23:00\",\"06:30\",\"50\",\"40\",\"2+1\")");
            db.execSQL("INSERT INTO \"seferler\" VALUES (199,\"ESKIŞEHIR\",\"BURSA\",\"13:15\",\"15:45\",\"30\",\"40\",\"2+1\")");
            db.execSQL("INSERT INTO \"seferler\" VALUES (200,\"ESKIŞEHIR\",\"ANKARA\",\"15:15\",\"18:15\",\"30\",\"40\",\"2+1\")");
            db.execSQL("INSERT INTO \"seferler\" VALUES (201,\"ESKIŞEHIR\",\"ANTALYA\",\"23:30\",\"08:15\",\"60\",\"40\",\"2+1\")");
            db.execSQL("INSERT INTO \"seferler\" VALUES (202,\"ESKIŞEHIR\",\"IZMIR\",\"23:45\",\"06:00\",\"70\",\"40\",\"2+1\")");
            db.execSQL("INSERT INTO \"seferler\" VALUES (203,\"ESKIŞEHIR\",\"TRABZON\",\"15:00\",\"06:10\",\"100\",\"40\",\"2+1\")");
            db.execSQL("INSERT INTO \"seferler\" VALUES (212,\"ISTANBUL\",\"BURSA\",\"21:00\",\"01:00\",\"40\",\"40\",\"2+1\")");
            db.execSQL("INSERT INTO \"seferler\" VALUES (213,\"ANKARA\",\"ESKIŞEHIR\",\"19:00\",\"22:00\",\"30\",\"40\",\"2+1\")");
            db.execSQL("INSERT INTO \"seferler\" VALUES (214,\"ANKARA\",\"ESKIŞEHIR\",\"23:00\",\"02:00\",\"30\",\"40\",\"2+1\")");
            db.execSQL("INSERT INTO \"seferler\" VALUES (215,\"IZMIR\",\"ISTANBUL\",\"16:00\",\"00:30\",\"100\",\"40\",\"2+1\")");
            db.execSQL("INSERT INTO \"seferler\" VALUES (216,\"IZMIR\",\"ISTANBUL\",\"20:30\",\"06:00\",\"100\",\"40\",\"2+1\")");
            db.execSQL("INSERT INTO \"seferler\" VALUES (217,\"IZMIR\",\"ISTANBUL\",\"00:00\",\"09:30\",\"100\",\"40\",\"2+1\")");
            db.execSQL("INSERT INTO \"seferler\" VALUES (218,\"IZMIR\",\"ANKARA\",\"21:30\",\"05:30\",\"85\",\"40\",\"2+1\")");
            db.execSQL("INSERT INTO \"seferler\" VALUES (219,\"IZMIR\",\"ERZURUM\",\"22:00\",\"19:30\",\"140\",\"40\",\"2+1\")");
            db.execSQL("INSERT INTO \"seferler\" VALUES (220,\"BURSA\",\"ISTANBUL\",\"23:30\",\"03:30\",\"40\",\"40\",\"2+1\")");
            db.execSQL("INSERT INTO \"seferler\" VALUES (221,\"BURSA\",\"ESKIŞEHIR\",\"18:45\",\"21:15\",\"30\",\"40\",\"2+1\")");
            db.execSQL("INSERT INTO \"seferler\" VALUES (222,\"BURSA\",\"ESKIŞEHIR\",\"23:00\",\"01:30\",\"30\",\"40\",\"2+1\")");
            db.execSQL("INSERT INTO \"seferler\" VALUES (223,\"ESKIŞEHIR\",\"ANKARA\",\"19:45\",\"22:45\",\"30\",\"40\",\"2+1\")");
            db.execSQL("INSERT INTO \"seferler\" VALUES (224,\"ESKIŞEHIR\",\"ANKARA\",\"23:30\",\"02:30\",\"30\",\"40\",\"2+1\")");
            db.execSQL("INSERT INTO \"seferler\" VALUES (225,\"ESKIŞEHIR\",\"BURSA\",\"16:30\",\"19:00\",\"30\",\"40\",\"2+1\")");
            db.execSQL("INSERT INTO \"seferler\" VALUES (226,\"ESKIŞEHIR\",\"BURSA\",\"21:00\",\"23:30\",\"30\",\"40\",\"2+1\")");
            db.execSQL("INSERT INTO \"seferler\" VALUES (227,\"TRABZON\",\"ERZURUM\",\"11:00\",\"16:30\",\"50\",\"40\",\"2+1\")");


            db.execSQL("INSERT INTO \"koltuklar\" VALUES (1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)");
            db.execSQL("INSERT INTO \"koltuklar\" VALUES (2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)");
            db.execSQL("INSERT INTO \"koltuklar\" VALUES (3,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)");
            db.execSQL("INSERT INTO \"koltuklar\" VALUES (4,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)");
            db.execSQL("INSERT INTO \"koltuklar\" VALUES (5,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)");
            db.execSQL("INSERT INTO \"koltuklar\" VALUES (6,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)");
            db.execSQL("INSERT INTO \"koltuklar\" VALUES (7,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)");
            db.execSQL("INSERT INTO \"koltuklar\" VALUES (8,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)");
            db.execSQL("INSERT INTO \"koltuklar\" VALUES (9,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)");
            db.execSQL("INSERT INTO \"koltuklar\" VALUES (10,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)");
            db.execSQL("INSERT INTO \"koltuklar\" VALUES (11,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)");
            db.execSQL("INSERT INTO \"koltuklar\" VALUES (12,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)");
            db.execSQL("INSERT INTO \"koltuklar\" VALUES (13,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)");
            db.execSQL("INSERT INTO \"koltuklar\" VALUES (14,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)");
            db.execSQL("INSERT INTO \"koltuklar\" VALUES (15,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)");
            db.execSQL("INSERT INTO \"koltuklar\" VALUES (16,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)");
            db.execSQL("INSERT INTO \"koltuklar\" VALUES (17,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)");
            db.execSQL("INSERT INTO \"koltuklar\" VALUES (18,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)");
            db.execSQL("INSERT INTO \"koltuklar\" VALUES (19,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)");
            db.execSQL("INSERT INTO \"koltuklar\" VALUES (20,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)");
            db.execSQL("INSERT INTO \"koltuklar\" VALUES (21,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)");
            db.execSQL("INSERT INTO \"koltuklar\" VALUES (22,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)");
            db.execSQL("INSERT INTO \"koltuklar\" VALUES (23,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)");
            db.execSQL("INSERT INTO \"koltuklar\" VALUES (24,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)");
            db.execSQL("INSERT INTO \"koltuklar\" VALUES (26,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)");
            db.execSQL("INSERT INTO \"koltuklar\" VALUES (27,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)");
            db.execSQL("INSERT INTO \"koltuklar\" VALUES (28,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)");
            db.execSQL("INSERT INTO \"koltuklar\" VALUES (29,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)");
            db.execSQL("INSERT INTO \"koltuklar\" VALUES (30,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)");
            db.execSQL("INSERT INTO \"koltuklar\" VALUES (31,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)");
            db.execSQL("INSERT INTO \"koltuklar\" VALUES (32,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)");
            db.execSQL("INSERT INTO \"koltuklar\" VALUES (33,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)");
            db.execSQL("INSERT INTO \"koltuklar\" VALUES (34,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)");
            db.execSQL("INSERT INTO \"koltuklar\" VALUES (36,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)");
            db.execSQL("INSERT INTO \"koltuklar\" VALUES (38,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)");
            db.execSQL("INSERT INTO \"koltuklar\" VALUES (39,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)");
            db.execSQL("INSERT INTO \"koltuklar\" VALUES (40,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)");
            db.execSQL("INSERT INTO \"koltuklar\" VALUES (41,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)");
            db.execSQL("INSERT INTO \"koltuklar\" VALUES (42,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)");
            db.execSQL("INSERT INTO \"koltuklar\" VALUES (43,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)");
            db.execSQL("INSERT INTO \"koltuklar\" VALUES (46,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)");
            db.execSQL("INSERT INTO \"koltuklar\" VALUES (47,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)");
            db.execSQL("INSERT INTO \"koltuklar\" VALUES (48,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)");
            db.execSQL("INSERT INTO \"koltuklar\" VALUES (49,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)");
            db.execSQL("INSERT INTO \"koltuklar\" VALUES (50,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)");
            db.execSQL("INSERT INTO \"koltuklar\" VALUES (51,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)");
            db.execSQL("INSERT INTO \"koltuklar\" VALUES (52,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)");
            db.execSQL("INSERT INTO \"koltuklar\" VALUES (53,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)");
            db.execSQL("INSERT INTO \"koltuklar\" VALUES (54,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)");
            db.execSQL("INSERT INTO \"koltuklar\" VALUES (55,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)");
            db.execSQL("INSERT INTO \"koltuklar\" VALUES (56,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)");
            db.execSQL("INSERT INTO \"koltuklar\" VALUES (57,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)");
            db.execSQL("INSERT INTO \"koltuklar\" VALUES (58,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)");
            db.execSQL("INSERT INTO \"koltuklar\" VALUES (59,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)");
            db.execSQL("INSERT INTO \"koltuklar\" VALUES (60,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)");
            db.execSQL("INSERT INTO \"koltuklar\" VALUES (64,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)");
            db.execSQL("INSERT INTO \"koltuklar\" VALUES (65,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)");
            db.execSQL("INSERT INTO \"koltuklar\" VALUES (66,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)");
            db.execSQL("INSERT INTO \"koltuklar\" VALUES (67,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)");
            db.execSQL("INSERT INTO \"koltuklar\" VALUES (69,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)");
            db.execSQL("INSERT INTO \"koltuklar\" VALUES (70,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)");
            db.execSQL("INSERT INTO \"koltuklar\" VALUES (71,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)");
            db.execSQL("INSERT INTO \"koltuklar\" VALUES (72,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)");
            db.execSQL("INSERT INTO \"koltuklar\" VALUES (73,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)");
            db.execSQL("INSERT INTO \"koltuklar\" VALUES (74,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)");
            db.execSQL("INSERT INTO \"koltuklar\" VALUES (75,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)");
            db.execSQL("INSERT INTO \"koltuklar\" VALUES (76,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)");
            db.execSQL("INSERT INTO \"koltuklar\" VALUES (77,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)");
            db.execSQL("INSERT INTO \"koltuklar\" VALUES (78,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)");
            db.execSQL("INSERT INTO \"koltuklar\" VALUES (79,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)");
            db.execSQL("INSERT INTO \"koltuklar\" VALUES (83,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)");
            db.execSQL("INSERT INTO \"koltuklar\" VALUES (85,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)");
            db.execSQL("INSERT INTO \"koltuklar\" VALUES (86,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)");
            db.execSQL("INSERT INTO \"koltuklar\" VALUES (87,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)");
            db.execSQL("INSERT INTO \"koltuklar\" VALUES (88,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)");
            db.execSQL("INSERT INTO \"koltuklar\" VALUES (90,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)");
            db.execSQL("INSERT INTO \"koltuklar\" VALUES (91,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)");
            db.execSQL("INSERT INTO \"koltuklar\" VALUES (94,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)");
            db.execSQL("INSERT INTO \"koltuklar\" VALUES (95,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)");
            db.execSQL("INSERT INTO \"koltuklar\" VALUES (96,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)");
            db.execSQL("INSERT INTO \"koltuklar\" VALUES (97,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)");
            db.execSQL("INSERT INTO \"koltuklar\" VALUES (98,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)");
            db.execSQL("INSERT INTO \"koltuklar\" VALUES (99,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)");
            db.execSQL("INSERT INTO \"koltuklar\" VALUES (103,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)");
            db.execSQL("INSERT INTO \"koltuklar\" VALUES (104,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)");
            db.execSQL("INSERT INTO \"koltuklar\" VALUES (105,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)");
            db.execSQL("INSERT INTO \"koltuklar\" VALUES (106,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)");
            db.execSQL("INSERT INTO \"koltuklar\" VALUES (107,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)");
            db.execSQL("INSERT INTO \"koltuklar\" VALUES (108,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)");
            db.execSQL("INSERT INTO \"koltuklar\" VALUES (109,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)");
            db.execSQL("INSERT INTO \"koltuklar\" VALUES (113,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)");
            db.execSQL("INSERT INTO \"koltuklar\" VALUES (114,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)");
            db.execSQL("INSERT INTO \"koltuklar\" VALUES (115,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)");
            db.execSQL("INSERT INTO \"koltuklar\" VALUES (116,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)");
            db.execSQL("INSERT INTO \"koltuklar\" VALUES (117,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)");
            db.execSQL("INSERT INTO \"koltuklar\" VALUES (122,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)");
            db.execSQL("INSERT INTO \"koltuklar\" VALUES (123,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)");
            db.execSQL("INSERT INTO \"koltuklar\" VALUES (124,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)");
            db.execSQL("INSERT INTO \"koltuklar\" VALUES (125,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)");
            db.execSQL("INSERT INTO \"koltuklar\" VALUES (126,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)");
            db.execSQL("INSERT INTO \"koltuklar\" VALUES (127,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)");
            db.execSQL("INSERT INTO \"koltuklar\" VALUES (130,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)");
            db.execSQL("INSERT INTO \"koltuklar\" VALUES (131,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)");
            db.execSQL("INSERT INTO \"koltuklar\" VALUES (132,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)");
            db.execSQL("INSERT INTO \"koltuklar\" VALUES (134,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)");
            db.execSQL("INSERT INTO \"koltuklar\" VALUES (135,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)");
            db.execSQL("INSERT INTO \"koltuklar\" VALUES (139,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)");
            db.execSQL("INSERT INTO \"koltuklar\" VALUES (142,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)");
            db.execSQL("INSERT INTO \"koltuklar\" VALUES (144,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)");
            db.execSQL("INSERT INTO \"koltuklar\" VALUES (147,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)");
            db.execSQL("INSERT INTO \"koltuklar\" VALUES (151,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)");
            db.execSQL("INSERT INTO \"koltuklar\" VALUES (152,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)");
            db.execSQL("INSERT INTO \"koltuklar\" VALUES (153,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)");
            db.execSQL("INSERT INTO \"koltuklar\" VALUES (154,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)");
            db.execSQL("INSERT INTO \"koltuklar\" VALUES (160,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)");
            db.execSQL("INSERT INTO \"koltuklar\" VALUES (161,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)");
            db.execSQL("INSERT INTO \"koltuklar\" VALUES (162,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)");
            db.execSQL("INSERT INTO \"koltuklar\" VALUES (163,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)");
            db.execSQL("INSERT INTO \"koltuklar\" VALUES (164,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)");
            db.execSQL("INSERT INTO \"koltuklar\" VALUES (166,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)");
            db.execSQL("INSERT INTO \"koltuklar\" VALUES (169,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)");
            db.execSQL("INSERT INTO \"koltuklar\" VALUES (170,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)");
            db.execSQL("INSERT INTO \"koltuklar\" VALUES (171,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)");
            db.execSQL("INSERT INTO \"koltuklar\" VALUES (172,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)");
            db.execSQL("INSERT INTO \"koltuklar\" VALUES (173,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)");
            db.execSQL("INSERT INTO \"koltuklar\" VALUES (178,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)");
            db.execSQL("INSERT INTO \"koltuklar\" VALUES (179,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)");
            db.execSQL("INSERT INTO \"koltuklar\" VALUES (180,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)");
            db.execSQL("INSERT INTO \"koltuklar\" VALUES (181,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)");
            db.execSQL("INSERT INTO \"koltuklar\" VALUES (182,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)");
            db.execSQL("INSERT INTO \"koltuklar\" VALUES (183,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)");
            db.execSQL("INSERT INTO \"koltuklar\" VALUES (189,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)");
            db.execSQL("INSERT INTO \"koltuklar\" VALUES (190,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)");
            db.execSQL("INSERT INTO \"koltuklar\" VALUES (191,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)");
            db.execSQL("INSERT INTO \"koltuklar\" VALUES (192,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)");
            db.execSQL("INSERT INTO \"koltuklar\" VALUES (197,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)");
            db.execSQL("INSERT INTO \"koltuklar\" VALUES (198,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)");
            db.execSQL("INSERT INTO \"koltuklar\" VALUES (199,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)");
            db.execSQL("INSERT INTO \"koltuklar\" VALUES (200,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)");
            db.execSQL("INSERT INTO \"koltuklar\" VALUES (201,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)");
            db.execSQL("INSERT INTO \"koltuklar\" VALUES (202,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)");
            db.execSQL("INSERT INTO \"koltuklar\" VALUES (203,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)");
            db.execSQL("INSERT INTO \"koltuklar\" VALUES (212,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)");
            db.execSQL("INSERT INTO \"koltuklar\" VALUES (213,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)");
            db.execSQL("INSERT INTO \"koltuklar\" VALUES (214,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)");
            db.execSQL("INSERT INTO \"koltuklar\" VALUES (215,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)");
            db.execSQL("INSERT INTO \"koltuklar\" VALUES (216,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)");
            db.execSQL("INSERT INTO \"koltuklar\" VALUES (217,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)");
            db.execSQL("INSERT INTO \"koltuklar\" VALUES (218,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)");
            db.execSQL("INSERT INTO \"koltuklar\" VALUES (219,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)");
            db.execSQL("INSERT INTO \"koltuklar\" VALUES (220,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)");
            db.execSQL("INSERT INTO \"koltuklar\" VALUES (221,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)");
            db.execSQL("INSERT INTO \"koltuklar\" VALUES (222,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)");
            db.execSQL("INSERT INTO \"koltuklar\" VALUES (223,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)");
            db.execSQL("INSERT INTO \"koltuklar\" VALUES (224,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)");
            db.execSQL("INSERT INTO \"koltuklar\" VALUES (225,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)");
            db.execSQL("INSERT INTO \"koltuklar\" VALUES (226,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)");
            db.execSQL("INSERT INTO \"koltuklar\" VALUES (227,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)");


        } catch (Exception e) {

            db.close();
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + "seferler");
        db.execSQL("DROP TABLE IF EXISTS " + "koltuklar");

        onCreate(db);
    }

    public ArrayList<String> seferListele(String neredenTxt,String nereyeTxt) {
        ArrayList<String> seferlerList = new ArrayList<String>();
        SQLiteDatabase db = this.getReadableDatabase();
        try {
            //String[] stunlar = {"id", "kalkis_yeri", "varis_yeri", "kalkis_zamani", "varis_zamani", "ucret", "koltuk_sayisi", "otobus_tipi"};
            //Cursor cursor = db.query("seferler", stunlar,null,null,null,null,null);
            Cursor cursor = db.rawQuery("SELECT * FROM seferler WHERE kalkis_yeri='" + neredenTxt + "' AND  varis_yeri= '" + nereyeTxt + "'", null);
            while (cursor.moveToNext()) {

                seferlerList.add(cursor.getString(1) + " - " + cursor.getString(2) + "         Saat : " + cursor.getString(3) + "     " + cursor.getString(5) + " TL");

            }


        } catch (Exception e) {
        }
        db.close();
        return seferlerList;

    }
    public int getUcret(String neredenTxt,String nereyeTxt){
        SQLiteDatabase db = this.getReadableDatabase();
        int ucret = 0;
        try{
            Cursor cursor = db.rawQuery("SELECT * FROM seferler WHERE kalkis_yeri='" + neredenTxt + "' AND  varis_yeri= '" + nereyeTxt + "'", null);
            while(cursor.moveToNext()){
                ucret = Integer.parseInt(cursor.getString(5));

            }

        }catch(Exception e){

        }
    db.close();
    return ucret;
    }

    /*public boolean koltukEkranı(int sefer_id,int koltuk_no) {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery("SELECT * FROM koltuklar WHERE id = "+sefer_id+"",null);
        boolean bool = true;
        cursor.moveToFirst();
        while (cursor.moveToNext()) {

                if(cursor.getInt(koltuk_no) == 0){
                    String tmp = "koltuk" + Integer.toString(koltuk_no);
                    db.execSQL("UPDATE koltuklar SET '" + tmp + "' = 1 WHERE id = "+sefer_id+"");
                    bool =  true;

                }else if(cursor.getInt(koltuk_no) == 1){
                    bool = false;


                }


        }
        db.close();
        return bool;
    }*/
    public int getId(String neredenTxt,String nereyeTxt){
        SQLiteDatabase db = this.getReadableDatabase();
        int id = 0;
        try{
            Cursor cursor = db.rawQuery("SELECT * FROM seferler WHERE kalkis_yeri='" + neredenTxt + "' AND  varis_yeri= '" + nereyeTxt + "'", null);
            while(cursor.moveToNext()){
                id = cursor.getInt(0);
            }

        }catch(Exception e){

        }
        db.close();
        return id;
    }


}