package org.shokai;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.os.Bundle;
import android.widget.*;

public class ConfigActivity extends Activity implements OnClickListener{

    private EditText editTextName;
    private Button buttonSave;
    private Logger logger;
    
    @Override
    public void onCreate(Bundle bundle){
        super.onCreate(bundle);
        logger = new Logger(this.getResources().getString(R.string.app_name));
        setContentView(R.layout.config);
        editTextName = (EditText)findViewById(R.id.EditTextName);
        buttonSave = (Button)findViewById(R.id.ButtonSave);
        buttonSave.setOnClickListener(this);
        Intent it = getIntent();
        String name = it.getStringExtra("name");
        if(name != null) editTextName.setText(name);
    }

    public void onClick(View v) {
        switch(v.getId()){
        case R.id.ButtonSave:
            logger.v("click : ButtonSave");
            Intent it = new Intent();
            it.putExtra("name", this.editTextName.getText().toString());
            this.setResult(0, it);
            this.finish();
            break;
        }
    }

}
