package com.example.veigar.locationdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ThirdActivity extends AppCompatActivity implements View.OnClickListener{

    private MultiViewGroup mViewGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.multiview);
        mViewGroup = (MultiViewGroup) findViewById(R.id.mymultiViewGroup);
        Button btn1 = (Button) findViewById(R.id.bt_scrollLeft);
        Button btn2 = (Button) findViewById(R.id.bt_scrollRight);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);

        //mViewGroup.stopMove();
    }




    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.bt_scrollLeft:
                mViewGroup.startMove();
                break;
            case R.id.bt_scrollRight:
                mViewGroup.stopMove();
                break;
        }
    }
}
