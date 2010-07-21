package org.shokai;

import android.content.res.Resources;
import android.util.Log;

public class Logger {
    
    private String name;
    
    public String getName(){
        return this.name;
    }
    
    public Logger(String name){
        this.name = name;
    }
    
    public void v(String message){
        Log.v(this.name, message);
    }
}
