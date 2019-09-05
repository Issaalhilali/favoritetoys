package com.issa.favoritetoys;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //TODO this is gat list name for ToyBox
        textView =(TextView)findViewById(R.id.toy_names);
        String[] toyName = ToyBox.getToyName();
        for (String toName: toyName){
            textView.append(toName + "\n\n\n");
        }
    }
}
