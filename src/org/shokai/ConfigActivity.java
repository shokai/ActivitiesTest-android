package org.shokai;

import android.app.Activity;
import android.os.Bundle;
import android.widget.*;

public class ConfigActivity extends Activity {

    private TextView textView;
    
    @Override
    public void onCreate(Bundle bundle){
        super.onCreate(bundle);
        this.textView = new TextView(this);
        this.textView.setText("config activity");
        this.setContentView(this.textView);
    }

}
