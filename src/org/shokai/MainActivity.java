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
    private TextView textViewName;
    private String name;
    
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        logger = new Logger(this.getResources().getString(R.string.app_name));
        textViewName = (TextView)findViewById(R.id.TextViewName);
        buttonOpen = (Button)findViewById(R.id.ButtonOpen);
        buttonOpen.setOnClickListener(this);
    }

    public void onClick(View arg0) {
        switch(arg0.getId()){
        case R.id.ButtonOpen:
            logger.v("click : ButtonOpen");
            Intent it = new Intent(this, ConfigActivity.class);
            if(name != null) it.putExtra("name", name);
            this.startActivityForResult(it, 1234);
            break;
        }
    }
    
    protected void onActivityResult(int reqCode, int resCode, Intent it) {
        logger.v("responseCode:"+resCode+", requestCode:"+reqCode);
        switch(reqCode){
        case 1234:
            setName(it.getStringExtra("name"));
            break;
        }
    }
    
    private void setName(String name){
        this.name = name;
        this.textViewName.setText(name);
    }
}
