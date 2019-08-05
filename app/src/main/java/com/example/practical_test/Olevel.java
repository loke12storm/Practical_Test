package com.example.practical_test;

import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Olevel extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_olevel);
    }

    public void validateMarks(View view) {
        EditText bm = (EditText)findViewById(R.id.in_bm);
        String value_bm = bm.getText().toString();

        EditText eng = (EditText)findViewById(R.id.in_eng);
        String value_eng = eng.getText().toString();

        EditText math = (EditText)findViewById(R.id.in_math);
        String value_math = math.getText().toString();

        EditText other = (EditText)findViewById(R.id.in_other);
        String temp_other = other.getText().toString();
        int value_other = Integer.valueOf(temp_other);

        boolean failed = false;

        if(value_other >= 5)
            if(value_bm == "A" || value_bm == "B" || value_bm == "C")
                if(value_eng == "A" || value_eng == "B" || value_eng == "C")
                    failed = false;
                else
                    failed = true;
            else
                failed = true;
        else
            failed = true;

        if(failed = false) {
            DialogFragment dialog = new ReturnMessage();
            dialog.show(getSupportFragmentManager(), "ReturnMessageTag");
        }
        else{
            DialogFragment dialog = new FailedMessage();
            dialog.show(getSupportFragmentManager(), "FailedMessageTag");
        }
    }
}
