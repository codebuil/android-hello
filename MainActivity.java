package p1.c1.app;

import android.app.*;
import android.os.*;
import android.app.AlertDialog;
import android.app.Activity;
import android.widget.Toast;


public class MainActivity extends Activity 
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        Toast toast=Toast.makeText(getApplicationContext(),"Hello world",Toast.LENGTH_SHORT);  
         toast.setMargin(50,50);  
         toast.show();  

         builder.setMessage("hello world");
         builder.setTitle("hello");


         AlertDialog dialog = builder.create();
        dialog.show();

    }
}
