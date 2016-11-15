package cuhktsa.cutsa;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;

/**
 * Created by Hank on 11/15/16.
 */

public class Splash extends Activity{
//    this variable is for splash display time
    private final int SPLASH_WAITING_TIME = 2000;
    //Bundle is a variable carried different data to different activity
    @Override
    public void onCreate(Bundle icicle){
        super.onCreate(icicle);
        setContentView(R.layout.splash_layout);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent mainIntent = new Intent(Splash.this, MainActivity.class);
                Splash.this.startActivity(mainIntent);
                Splash.this.finish();
            }
        }, SPLASH_WAITING_TIME);
        }

    }

