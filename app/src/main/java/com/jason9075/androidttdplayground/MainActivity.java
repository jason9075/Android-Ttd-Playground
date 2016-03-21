package com.jason9075.androidttdplayground;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.jason9075.androidttdplayground.network.NetworkManager;
import com.jason9075.androidttdplayground.network.model.GithubUserDto;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    NetworkManager networkManager;

    private TextView resultTextview;
    private Button changeTextButton;
    private EditText accountEdittext;
    private TextView githubResultTextview;
    private Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TtdApplication.getComponent().inject(this);
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
                if (accountEdittext.getText().toString().equals("")) {
                    githubResultTextview.setText("account is empty!");
                    return;
                }
                GithubUserDto githubUserDto = networkManager.userCheck(accountEdittext.getText().toString());

                githubResultTextview.setText("find it!");
            }
        });
    }
}
