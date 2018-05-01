package jp.techacademy.takuya.sunohara.aisatsuapp;

import android.app.TimePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.app.TimePickerDialog;
import android.widget.TimePicker;
import android.view.View;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(this);

        mTextView = (TextView) findViewById(R.id.textView);
    }

    @Override public void onClick(View v) {
        showTimePickerDialog();
    }

    private void showTimePickerDialog() {
        TimePickerDialog timePickerDialog = new TimePickerDialog(this, new TimePickerDialog.OnTimeSetListener() {
            @Override
            public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                if (2 <= hourOfDay && hourOfDay <= 9) {
                    mTextView.setText("おはよう");
                } else if (10 <= hourOfDay && hourOfDay <= 17) {
                    mTextView.setText("こんにちは");
                } else {
                    mTextView.setText("こんばんは");
                }
            }
        },
        13,
        0,
        true);

        timePickerDialog.show();
    }
}
