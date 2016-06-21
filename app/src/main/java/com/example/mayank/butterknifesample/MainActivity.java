package com.example.mayank.butterknifesample;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.OnLongClick;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.editText) EditText editText;
    @Bind(R.id.editText2) EditText editText2;
    @Bind(R.id.editText3) TextView editText3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);                 //In fragment the command is ButterKnife.bind(this, <corresponding view>);
    }

    @OnClick({R.id.button,R.id.button2})
    public void onClick1(View view)
    {
        int text1 = Integer.parseInt(editText.getText().toString());            //Generate Error if No value is entered
        int text2 = Integer.parseInt(editText2.getText().toString());

        switch (view.getId())
        {
            case R.id.button : editText3.setText(String.valueOf(text1+text2));
                break;
            case R.id.button2 : editText3.setText(String.valueOf(text1-text2));
        }
    }

    @OnLongClick(R.id.button) boolean pressedsum() {
        Toast.makeText(this, "Hey I do only sum. So no use of long press.", Toast.LENGTH_SHORT).show();
        return true;
    }

    @OnLongClick(R.id.button2) boolean presseddiff() {
        Toast.makeText(this, "Hey I do only subtraction. So no use of long press.", Toast.LENGTH_SHORT).show();
        return true;
    }



}
