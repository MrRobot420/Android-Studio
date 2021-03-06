package com.mobileapplikationenfhws.fotodiary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


/*      MAIN MENU
*
* User can:
    - Look at Story
    - Add a Photo (take photo, open library, go to web)
    - Change Settings (Set time intervall, appearance, restrictions)
*
*/



public class Menu extends AppCompatActivity {

    private Button settings_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        settings_button = (Button) findViewById(R.id.settings);
        settings_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onClickSettings();
            }
        });
    }

    public void onShowStory(View v) {
        Toast myToast = Toast.makeText(getApplicationContext(), "Well DONE!", Toast.LENGTH_LONG);
        myToast.show();
    }


    public void onAddPhotos(View v) {
        Toast myToast = Toast.makeText(getApplicationContext(), "Well DONE!", Toast.LENGTH_LONG);
        myToast.show();
    }


    // Transits to the Settings Screen
    public void onClickSettings() {
        Intent intent = new Intent(Menu.this, Settings.class);
        startActivity(intent);
    }

}
