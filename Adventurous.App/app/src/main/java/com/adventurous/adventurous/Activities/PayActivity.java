package com.adventurous.adventurous.Activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.adventurous.adventurous.R;

public class PayActivity extends AppCompatActivity {

    private EditText mCodeText;
    private Button mCodeApproveButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pay);

        mCodeText = (EditText)findViewById(R.id.activity_pay_code_input_field);
        mCodeApproveButton = (Button)findViewById(R.id.activity_pay_approve_button);

        mCodeApproveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mCodeText.getText().toString().equals("kodas"))
                {
                    Intent returnIntent = new Intent();
                    setResult(Activity.RESULT_OK, returnIntent);
                    finish();
                }
                else {
                    Toast.makeText(PayActivity.this, getResources().getString(R.string.game_activity_wrong_code), Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
