package org.shokai;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.*;

public class MainActivity extends Activity implements OnClickListener{
    
    private Button buttonOpen;
    private Logger logger;
    
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        this.logger = new Logger(this.getResources().getString(R.string.app_name));
        buttonOpen = (Button)findViewById(R.id.ButtonOpen);
        buttonOpen.setOnClickListener(this);
    }

    public void onClick(View arg0) {
        switch(arg0.getId()){
        case R.id.ButtonOpen:
            logger.v("click : ButtonOpen");
            Intent it = new Intent(this, ConfigActivity.class);
            this.startActivity(it);
            break;
        }
        
    }
}
