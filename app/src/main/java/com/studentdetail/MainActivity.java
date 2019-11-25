package com.studentdetail;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import javax.xml.transform.Result;

public class MainActivity extends AppCompatActivity {
    public EditText etName;
    public EditText etAge;
    public RadioGroup radioGender;
    public RadioButton radioButton;
    public EditText etAddress;
    public Button btnSave;
    public TextView tvResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etName=findViewById(R.id.etName);
        etAge=findViewById(R.id.etAge);
        radioGender=findViewById(R.id.radioGender);
        etAddress=findViewById(R.id.etAddress);
        btnSave=findViewById(R.id.btnSave);
        tvResult=findViewById(R.id.tvResult);

        btnSave.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View v) {
                                           if (TextUtils.isEmpty(etName.getText())) {
                                               etName.setError("Please enter Name");
                                               return;
                                           }

                                           if (TextUtils.isEmpty(etAge.getText())) {
                                               etAge.setError("Please enter Age");
                                               return;
                                           }

                                           if (TextUtils.isEmpty(etAddress.getText()))
                                           {
                                               etAddress.setError("Please enter Address");
                                               return;
                                           }


                                           String name, address, gender;
                                           int age;
                                           name = etName.getText().toString();
                                           age = Integer.parseInt(etAge.getText().toString());
                                           address = etAddress.getText().toString();

                                           int selectedId=radioGender.getCheckedRadioButtonId();
                                           radioButton = findViewById(selectedId);
                                           gender = radioButton.getText().toString();
                                           String str = "Name :" + name + ",Age:" + age + ", address:" + address  + "and gender:" + gender + "\n";
                                           tvResult.append(str);
                                       }
                                   }
        );





    }
}
