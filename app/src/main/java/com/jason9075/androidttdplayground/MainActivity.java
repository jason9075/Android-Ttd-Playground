package com.jason9075.androidttdplayground;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView resultTextview;
    private Button changeTextButton;
    private EditText accountEdittext;
    private TextView githubResultTextview;
    private Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        resultTextview = (TextView) findViewById(R.id.result_textview);
        changeTextButton = (Button) findViewById(R.id.change_text_button);
        accountEdittext = (EditText) findViewById(R.id.account_edittext);
        githubResultTextview = (TextView) findViewById(R.id.submit_result_textview);
        submitButton = (Button) findViewById(R.id.submit_button);

        changeTextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultTextview.setText("Yo!");
            }
        });

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(accountEdittext.getText().toString().equals(""))
                    githubResultTextview.setText("account is empty!");
            }
        });
    }
}
