package com.dam.profesor.paint;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        imagebutton_create();
//        imagebutton_help();
//        imagebutton_about();
    }

    //BUTTONS, IMAGE BUTTONS
    protected void imagebutton_create(){
        ImageButton createFont = (ImageButton) findViewById(R.id.imagebutton_createfont);
        createFont.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent;
                intent = new Intent("com.dam.profesor.paint.MainActivity");
                startActivity(intent);
            }
        });
    }

    /*
    protected void imagebutton_help(){
        ImageButton help = (ImageButton) findViewById(R.id.imagebutton_help);
        help.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent;
                intent = new Intent("com.thesis.fontasticmaker_multipleactivities.HelpActivity");
                startActivity(intent);
            }
        });
    }

    protected void imagebutton_about(){
        ImageButton about = (ImageButton) findViewById(R.id.imagebutton_about);
        about.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent;
                intent = new Intent("com.thesis.fontasticmaker_multipleactivities.AboutActivity");
                startActivity(intent);
            }
        });
    }
*/


}
