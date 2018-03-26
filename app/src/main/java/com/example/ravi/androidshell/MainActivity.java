package com.example.ravi.androidshell;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText input;
    Button btn;
    TextView out;
    String command;
    String str1="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        input = (EditText)findViewById(R.id.txt);
        btn = (Button)findViewById(R.id.btn);
        out = (TextView)findViewById(R.id.out);
        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                ShellExecuter exe = new ShellExecuter();
                command = input.getText().toString();

                String outp = exe.Executer(command);
                if(outp.equals(str1)) {
                    out.setText("please write valid command");
                }
                else {
                    out.setText(outp);
                }
                Log.d("Output", outp);

            }
        });
    }}
