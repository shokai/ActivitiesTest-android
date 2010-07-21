package org.shokai;

import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import android.os.Bundle;
import android.widget.*;

public class ConfigActivity extends Activity implements OnClickListener{

    private TextView textViewName;
    private Button buttonSave;
    private Logger logger;
    
    @Override
    public void onCreate(Bundle bundle){
        super.onCreate(bundle);
        this.logger = new Logger(this.getResources().getString(R.string.app_name));
        setContentView(R.layout.config);
        this.textViewName = (TextView)this.findViewById(R.id.EditTextName);
        this.buttonSave = (Button)this.findViewById(R.id.ButtonSave);
        this.buttonSave.setOnClickListener(this);
    }

    public void onClick(View v) {
        switch(v.getId()){
        case R.id.ButtonSave:
            logger.v("click : ButtonSave");
            break;
        }
    }

}
