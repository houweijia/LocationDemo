package com.example.veigar.locationdemo;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class MainActivity extends AppCompatActivity {
    private int a = 2;
    private int b = 3;
    private int c = 4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        User user = new User("veigar","12");

        try {
            FileOutputStream f  = openFileOutput("cache1.txt",Context.MODE_PRIVATE);
            ObjectOutputStream out = new ObjectOutputStream(f);
            out.writeObject(user);
            out.close();
            //Log.e("main",user.getName());
            FileInputStream fis = openFileInput("cache1.txt");
            ObjectInputStream in = new ObjectInputStream(fis);

            User newUser = (User) in.readObject();
            in.close();
            Log.e("main",newUser.getName());
        } catch (Exception e) {
            Log.e("main",e+"");
            e.printStackTrace();
        }

    }

    public void main(View view) {
        startActivity(new Intent(this,SecondActivity.class));
    }
}
