package com.example.ttx.appmessagerme;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.ttx.appmessagerme.Home.ComfirmFragment;
import com.example.ttx.appmessagerme.Home.HomeFragment;
import com.example.ttx.appmessagerme.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       binding = DataBindingUtil. setContentView(this,R.layout.activity_main);

       this.getSupportFragmentManager()
               .beginTransaction()
               .replace(R.id.container,new HomeFragment()) //
               .commit();
    }

    public void actionToPost(View view ){

        this.getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.container,new ComfirmFragment())
                .addToBackStack(null) //ยเก็บค่าก่อนหน้าเพื่อย้อนกลับ
                .commit();
    }
}
