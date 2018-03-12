package com.example.android.inclassassignment07_christinab;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class SecondActivity extends AppCompatActivity {


    TextView name;
    TextView legs;
    TextView moreInfo;
    CheckBox hasFur;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        name = (EditText) findViewById(R.id.animal_name_view);
        legs = (EditText) findViewById(R.id.legs_view);
        moreInfo = (EditText) findViewById(R.id.more_info_view);
        hasFur = (CheckBox) findViewById(R.id.has_fur_view);

        String nameText = name.getEditableText().toString();
        String legsText = legs.getEditableText().toString();
        String moreInfoText = moreInfo.getEditableText().toString();
        boolean fur = hasFur.isChecked();


        Animal animal = new Animal(nameText, legsText, moreInfoText, fur);
    }


    public void submitAnimal(View view) {
        Intent addAnimal = new Intent(this, MainActivity.class);
        addAnimal.putExtra(Keys.ANIMAL, addAnimal);
        setResult(RESULT_OK, addAnimal);
        finish();
    }
}
