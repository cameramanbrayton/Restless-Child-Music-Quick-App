package com.rcmusicapp.restlesschildmusicquickapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.homeRcLinkText);
        textView.setMovementMethod(LinkMovementMethod.getInstance());

        textView = findViewById(R.id.loginRcLinkText);
        textView.setMovementMethod(LinkMovementMethod.getInstance());

        textView = findViewById(R.id.aboutRcLinkText);
        textView.setMovementMethod(LinkMovementMethod.getInstance());

        textView = findViewById(R.id.albumRcLinkText);
        textView.setMovementMethod(LinkMovementMethod.getInstance());

        textView = findViewById(R.id.duelingHomeLinkText);
        textView.setMovementMethod(LinkMovementMethod.getInstance());

        textView = findViewById(R.id.bgdHomeLinkText);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    public void openBrowser(View view){

        //Get url from tag
        String url = (String)view.getTag();

        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.addCategory(Intent.CATEGORY_BROWSABLE);

        //pass the url to intent data
        intent.setData(Uri.parse(url));

        startActivity(intent);
    }
}