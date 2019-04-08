package com.luoxiang.limitability;

import android.os.Bundle;
import android.widget.TextView;

import com.compatsdk.LiteApi;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity
        extends AppCompatActivity
{

    // Used to load the 'native-lib' library on application startup.
   /* static {
        System.loadLibrary("native-lib");
    }
*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LiteApi liteApi = LiteApi.getLiteApi();
        // Example of a call to a native method
        TextView tv = (TextView) findViewById(R.id.sample_text);
        tv.setText(liteApi.iniSdk() + "");
    }

    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */
    //public native String stringFromJNI();
}
