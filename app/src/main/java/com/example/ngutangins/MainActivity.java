package com.example.ngutangins;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button buttonCek;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        viewPager = findViewById(R.id.view_pager);
//        tabLayout = findViewById(R.id.tabs);
//
//        viewPagerAdapter = new ViewPagerAdapter(
//                getSupportFragmentManager());
//        viewPager.setAdapter(viewPagerAdapter);
//
//        // It is used to join TabLayout with ViewPager.
//        tabLayout.setupWithViewPager(viewPager);

        buttonCek = (Button) findViewById(R.id.buttonCek);
        buttonCek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Buat Explicit Intent
                Intent i = new Intent(getApplicationContext(), Utang.class);
                startActivity(i);
            }

            public void CekHutang(View view) {
                //Buat Explicit Intent
                Intent i = new Intent(getApplicationContext(), Utang.class);
                startActivity(i);
            }
        });
    }
}

