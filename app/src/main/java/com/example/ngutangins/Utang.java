package com.example.ngutangins;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

public class Utang extends Activity {
    Button button1;
    @SuppressLint("WrongViewCast")
    @Override
    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(R.layout.utang);

        // Bind the components to their respective objects
        // by assigning their IDs
        // with the help of findViewById() method
        button1 = (Button) findViewById(R.id.backbutton);

        button1.setOnClickListener(new OnClickListener() {
            public void onClick(View view)
            {
                // Creating explicit intent
                Intent i = new Intent(getApplicationContext(),
                        MainActivity.class);
                startActivity(i);
            }
        });
    }
}
