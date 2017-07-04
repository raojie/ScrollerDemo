package com.raoj.scrollerdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Scroller;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Scroller scroller;
    private Button btn_start_scrollby;
    private Button btn_start_scrollto;
    private TextView txt;
    private LinearLayout ll_content;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_start_scrollby = (Button) findViewById(R.id.btn_start_scrollby);
        btn_start_scrollto = (Button) findViewById(R.id.btn_start_scrollto);
        ll_content = (LinearLayout) findViewById(R.id.ll_content);
        txt = (TextView) findViewById(R.id.txt);
        scroller = new Scroller(this);

        btn_start_scrollby.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scrollBy();
            }
        });

        btn_start_scrollto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scrollTo();
            }
        });
    }

    private void scrollBy() {
        ll_content.scrollBy(-100,0);
    }
    private void scrollTo() {
        ll_content.scrollTo(0,0);
    }
}
