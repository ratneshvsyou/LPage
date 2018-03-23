package com.example.android.lpage;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends Activity {

    Button button;
    Intent intent ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView foo = (TextView)findViewById(R.id.foo);
        foo.setText(Html.fromHtml(getString(R.string.nice_html)));

        button = (Button)findViewById(R.id.button1);

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

                intent = new Intent(android.content.Intent.ACTION_VIEW);

                //Copy App URL from Google Play Store.
                intent.setData(Uri.parse("https://play.google.com/store/apps/details?id=com.amazon.avod.thirdpartyclient"));

                startActivity(intent);

            }
        });
    }
}