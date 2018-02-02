package com.example.switchbuttonview;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Toast;

import com.example.switchbuttonview.view.SwitchButton;

public class MainActivity extends AppCompatActivity {

    private SwitchButton mSwitchButton,sb_ios;
    private Context mContext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mContext=getApplicationContext();

        mSwitchButton=findViewById(R.id.SwitchButton);
        sb_ios=findViewById(R.id.sb_ios);
        mSwitchButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    Toast.makeText(mContext,"打开",Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(mContext,"关闭",Toast.LENGTH_SHORT).show();
                }
            }
        });
        sb_ios.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    Toast.makeText(mContext,"打开hello",Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(mContext,"关闭hello",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
