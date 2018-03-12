package com.example.android.inclassassignment07_christinab;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView displayText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        displayText = (TextView) findViewById(R.id.animal_final_view);

        Intent animalActivity = getIntent();
        Animal newAnimal = (Animal) animalActivity.getSerializableExtra(Keys.ANIMAL);

    }

    public void addAnimal(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivityForResult(intent, RequestCodes.ADD_ANIMAL);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == RequestCodes.ADD_ANIMAL && resultCode == RESULT_OK) {
            Animal animal = (Animal) data.getSerializableExtra(Keys.ANIMAL);
            displayText.setText(animal.toString());
        }

    }
}