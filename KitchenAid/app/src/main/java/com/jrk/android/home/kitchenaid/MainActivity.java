package com.jrk.android.home.kitchenaid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.TextView;

import com.jrk.android.home.util.Spices;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    TextView spiceTextView;
    TextView lastUpdtTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //TODO: Add current date and last update date
        lastUpdtTextView = (TextView) findViewById(R.id.tv_lastupdt);
        StringBuffer sb = new StringBuffer ("Last Update on ");

        initSpiceView();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.actions, menu);
        return true;
    }

    private void initSpiceView()  {
        spiceTextView = (TextView) findViewById(R.id.tv_spice_list);
        String[] spiceNames = Spices.getSpiceNames();
        for (String spice: spiceNames) {
            spiceTextView.append("\n\n\n" + spice);
        }
    }
}
