package com.tweak.splashscreen;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_splash_screen);

        Thread thread=new Thread() {

            public void run() {
                try {
                    sleep(4000);
                }
                catch (Exception e) {
                    e.printStackTrace();
                }
                finally {
                    Intent intent=new Intent(SplashScreen.this, MainActivity.class);    //(the activity which we are on, the activity on which we have to go)
                    startActivity(intent);
                }
            }
        };
        thread.start();
    }
}