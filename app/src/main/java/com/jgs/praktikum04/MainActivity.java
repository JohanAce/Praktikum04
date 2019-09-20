package com.jgs.praktikum04;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "Aktifitas";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void MunculkanToast(View view){
        Toast.makeText(getApplicationContext(),"Sisfo OK", 	Toast.LENGTH_SHORT).show();
    }
    public void MunculkanLog(View view){
        Log.i(TAG, "Ini mestinya muncul di logcat"  );
    }
    public void MenujuKedua(View view) {
        Intent intent = new Intent(this,KetigaActivity.class);
        startActivity(intent);
    }
}