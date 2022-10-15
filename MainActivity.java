package com.mycompany.myapp;

import android.app.*;
import android.os.*;
import android.app.AlertDialog;
import android.app.Activity;


public class MainActivity extends Activity 
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        AlertDialog.Builder builder = new AlertDialog.Builder(this);


builder.setMessage("hello world");
       builder.setTitle("hello");


AlertDialog dialog = builder.create();
dialog.show();

    }
}
