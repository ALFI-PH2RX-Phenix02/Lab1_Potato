package com.example.potato;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.Toast;

import static android.view.View.INVISIBLE;
import static android.view.View.VISIBLE;

public class MainActivity extends AppCompatActivity {
    CheckBox check_arms, check_ears, check_eyebrows, check_eyes, check_glasses, check_hat, check_mouth, check_mustache, check_nose, check_shoes;
    ImageView img_arms,img_ears,img_eyebrows,img_eyes,img_glasses,img_hat,img_mouth,img_mustache,img_nose,img_shoes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        check_arms =findViewById(R.id.check_arms);
        check_ears =findViewById(R.id.check_ears);
        check_eyebrows =findViewById(R.id.check_eyebrows);
        check_eyes =findViewById(R.id.check_eyes);
        check_glasses =findViewById(R.id.check_glasses);
        check_hat =findViewById(R.id.check_hat);
        check_mouth =findViewById(R.id.check_mouth);
        check_mustache =findViewById(R.id.check_mustache);
        check_nose =findViewById(R.id.check_nose);
        check_shoes =findViewById(R.id.check_shoes);

        img_arms = findViewById(R.id.img_arms);
        img_ears = findViewById(R.id.img_ears);
        img_eyebrows = findViewById(R.id.img_eyebrows);
        img_eyes = findViewById(R.id.img_eyes);
        img_glasses = findViewById(R.id.img_glasses);
        img_hat = findViewById(R.id.img_hat);
        img_mouth = findViewById(R.id.img_mouth);
        img_mustache = findViewById(R.id.img_mustache);
        img_nose = findViewById(R.id.img_nose);
        img_shoes = findViewById(R.id.img_shoes);

        init();
    }

public void init(){
    check_arms.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
            if(check_arms.isChecked())
                img_arms.setVisibility(VISIBLE);
            else
                img_arms.setVisibility(INVISIBLE);
        }
    });
    check_ears.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
            if(check_ears.isChecked())
                img_ears.setVisibility(VISIBLE);
            else
                img_ears.setVisibility(INVISIBLE);
        }
    });
    check_eyebrows.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
            if(check_eyebrows.isChecked())
                img_eyebrows.setVisibility(VISIBLE);
            else
                img_eyebrows.setVisibility(INVISIBLE);
        }
    });
    check_eyes.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
            if(check_eyes.isChecked())
                img_eyes.setVisibility(VISIBLE);
            else
                img_eyes.setVisibility(INVISIBLE);
        }
    });
    check_glasses.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
            if(check_glasses.isChecked())
                img_glasses.setVisibility(VISIBLE);
            else
                img_glasses.setVisibility(INVISIBLE);
        }
    });
    check_hat.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
            if(check_hat.isChecked())
                img_hat.setVisibility(VISIBLE);
            else
                img_hat.setVisibility(INVISIBLE);
        }
    });
    check_mouth.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
            if(check_mouth.isChecked())
                img_mouth.setVisibility(VISIBLE);
            else
                img_mouth.setVisibility(INVISIBLE);
        }
    });
    check_mustache.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
            if(check_mustache.isChecked())
                img_mustache.setVisibility(VISIBLE);
            else
                img_mustache.setVisibility(INVISIBLE);
        }
    });
    check_nose.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
            if(check_nose.isChecked())
                img_nose.setVisibility(VISIBLE);
            else
                img_nose.setVisibility(INVISIBLE);
        }
    });
    check_shoes.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
            if(check_shoes.isChecked())
                img_shoes.setVisibility(VISIBLE);
            else
                img_shoes.setVisibility(INVISIBLE);
        }
    });
}
}
