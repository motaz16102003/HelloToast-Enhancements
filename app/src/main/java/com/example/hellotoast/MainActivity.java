package com.example.hellotoast;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

public class MainActivity extends AppCompatActivity {

    private int mCount = 0;
    private TextView mShowCount;
    private Button buttonZero;
    private Button buttonCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mShowCount = findViewById(R.id.show_count);
        buttonZero = findViewById(R.id.button_zero);
        buttonCount = findViewById(R.id.button_count);
    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(this, R.string.toast_message, Toast.LENGTH_SHORT);
        toast.show();
    }

    public void countUp(View view) {
        mCount++;
        if (mShowCount != null) {
            mShowCount.setText(Integer.toString(mCount));
        }

        if (mCount % 2 == 1) {
            buttonCount.setBackgroundColor(ContextCompat.getColor(this, R.color.green));
        } else {
            buttonCount.setBackgroundColor(ContextCompat.getColor(this, R.color.blue));
        }

        buttonZero.setBackgroundColor(ContextCompat.getColor(this, R.color.orange));
    }

    public void showZero(View view) {
        mCount = 0;
        if (mShowCount != null) {
            mShowCount.setText(Integer.toString(mCount));
        }
        buttonZero.setBackgroundColor(ContextCompat.getColor(this, R.color.gray));
    }
}
