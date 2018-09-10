package com.mobileapplikationenfhws.fotodiary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void onButtonTap(View v) {
        Toast myToast = Toast.makeText(getApplicationContext(), "Well DONE!", Toast.LENGTH_LONG);
        myToast.show();
    }
}
