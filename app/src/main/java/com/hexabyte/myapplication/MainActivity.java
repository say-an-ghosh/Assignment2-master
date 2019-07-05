package com.hexabyte.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {
    ImageView img;
    ImageButton imgB;
    Switch sw;
    CheckBox chk;
    Button btn;
    RadioGroup rg;
    int rbe,rbd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sw=findViewById(R.id.switch1);
        img=findViewById(R.id.imageView);
        chk=findViewById(R.id.checkBox);
        imgB=findViewById(R.id.imageButton);
        rg=findViewById(R.id.radioGroup);
        btn=findViewById(R.id.button);
        sw.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                img.setVisibility(View.VISIBLE);
                else
                img.setVisibility(View.INVISIBLE);
            }
        });
        chk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(((CheckBox)v).isChecked())
                    imgB.setVisibility(View.VISIBLE);
                else
                    imgB.setVisibility(View.INVISIBLE);
            }
        });
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                startActivity(getIntent());
            }
        });

    }

    public void onCLick(View view)
    {
        int sel=rg.getCheckedRadioButtonId();
        rbe=R.id.radioButton2;
        rbd=R.id.radioButton;
        if(sel==rbe)
            sw.setClickable(true);
        else
            sw.setClickable(false);
    }
}
