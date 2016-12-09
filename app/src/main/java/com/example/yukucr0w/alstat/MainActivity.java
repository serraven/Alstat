package com.example.yukucr0w.alstat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.text.*;

public class MainActivity extends AppCompatActivity {

    private TextView textV_1;
    private TextView textV_2;
    private TextView textV_3;
    private TextView textV_4;
    private TextView textV_1_2;
    private TextView textV_2_2;
    private TextView textV_3_2;
    private TextView textV_4_2;
    private float allCount;
    private float count_1;
    private float count_2;
    private float count_3;
    private float count_4;
    private String str;
    private float percent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textV_1 = (TextView) findViewById(R.id.textV_1);
        textV_2 = (TextView) findViewById(R.id.textV_2);
        textV_3 = (TextView) findViewById(R.id.textV_3);
        textV_4 = (TextView) findViewById(R.id.textV_4);
        textV_1_2 = (TextView) findViewById(R.id.textV_1_2);
        textV_2_2 = (TextView) findViewById(R.id.textV_2_2);
        textV_3_2 = (TextView) findViewById(R.id.textV_3_2);
        textV_4_2 = (TextView) findViewById(R.id.textV_4_2);

        Button but_1 = (Button) findViewById(R.id.but_1);
        Button but_2 = (Button) findViewById(R.id.but_2);
        Button but_3 = (Button) findViewById(R.id.but_3);
        Button but_4 = (Button) findViewById(R.id.but_4);

        but_1.setOnClickListener(onClickListener);
        but_2.setOnClickListener(onClickListener);
        but_3.setOnClickListener(onClickListener);
        but_4.setOnClickListener(onClickListener);

        allCount = 0;
        count_1 = 0;
        count_2 = 0;
        count_3 = 0;
        count_4 = 0;
        percent = 0;
        str = Float.toString(count_1);
    }

    private void refreshCount(){
        DecimalFormat myFormatter = new DecimalFormat("###.##");

        percent = count_1 / allCount * 100;
        str = myFormatter.format(percent);
        textV_1_2.setText(str);

        percent = count_2 / allCount * 100;
        str = myFormatter.format(percent);
        textV_2_2.setText(str);

        percent = count_3 / allCount * 100;
        str = myFormatter.format(percent);
        textV_3_2.setText(str);

        percent = count_4 / allCount * 100;
        str = myFormatter.format(percent);
        textV_4_2.setText(str);
    };

    private final View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.but_1:
                    allCount++;
                    count_1++;
                    str = Integer.toString((int)count_1);
                    textV_1.setText(str);
                    refreshCount();
                    break;
                case R.id.but_2:
                    allCount++;
                    count_2++;
                    str = Integer.toString((int)count_2);
                    textV_2.setText(str);
                    refreshCount();
                    break;
                case R.id.but_3:
                    allCount++;
                    count_3++;
                    str = Integer.toString((int)count_3);
                    textV_3.setText(str);
                    refreshCount();
                    break;
                case R.id.but_4:
                    allCount++;
                    count_4++;
                    str = Integer.toString((int)count_4);
                    textV_4.setText(str);
                    refreshCount();
                    break;
            }

        }
    };

}
