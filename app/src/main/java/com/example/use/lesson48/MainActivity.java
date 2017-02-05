package com.example.use.lesson48;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinkAdapter linkAdapter = new LinkAdapter(this, Link.links);
        ListView lvSimple = (ListView) findViewById(R.id.lvSimple);
        lvSimple.setAdapter(linkAdapter);
    }
}
