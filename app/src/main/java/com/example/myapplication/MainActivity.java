package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView txt1;
    private Button btn1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initUI();
        doActions();

    }


    private void initUI() {

    }

    private void doActions() {
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog dg=new Dialog(MainActivity.this);
                dg.setCancelable(false);
                dg.setCanceledOnTouchOutside(false);

                dg.setContentView(R.layout.sample_popup);

                ( (TextView) dg.findViewById(R.id.txtTitle) ).setText("Salam");
                Button btn=dg.findViewById(R.id.btnOk);
                btn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dg.dismiss();
                    }
                });
                dg.show();
            }
        });
    }

}
