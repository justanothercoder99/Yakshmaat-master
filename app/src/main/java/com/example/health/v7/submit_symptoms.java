package com.example.health.v7;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class submit_symptoms extends AppCompatActivity {

    Button button;
    CheckBox symptom1, symptom2, symptom3, symptom4, symptom5, symptom6, symptom7, symptom8;
    EditText et1;
    DatabaseReference mRef;
    String phoneNo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_submit_symptoms);

        Bundle bundle = getIntent().getExtras();
        phoneNo = bundle.getString("phoneNo");
        mRef = FirebaseDatabase.getInstance().getReference("Patient");

        symptom1 = findViewById(R.id.sym1);
        symptom2 = findViewById(R.id.sym2);
        symptom3 = findViewById(R.id.sym3);
        symptom4 = findViewById(R.id.sym4);
        symptom5 = findViewById(R.id.sym5);
        symptom6 = findViewById(R.id.sym6);
        symptom7 = findViewById(R.id.sym7);
        symptom8 = findViewById(R.id.sym8);

        et1 = findViewById(R.id.editText2);

        button = findViewById(R.id.button3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mRef.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        addListenerOnButton();
                        Intent in = new Intent(submit_symptoms.this,submit_medical.class);
                        in.putExtra("phoneNo",phoneNo);
                        startActivity(in);
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });
            }
        });
    }

    public void addListenerOnButton() {

        StringBuffer result = new StringBuffer();
        result.append("Weight Loss:").append(symptom1.isChecked());
        result.append("  Loss of Appetite:").append(symptom2.isChecked());
        result.append("  Night Sweat:").append(symptom3.isChecked());
        result.append("  Fever:").append(symptom4.isChecked());
        result.append("  Fatigue:").append(symptom5.isChecked());
        result.append("  Coughing:").append(symptom6.isChecked());
        result.append("  Hemoptysis:").append(symptom7.isChecked());
        result.append("  Chest Pain:").append(symptom8.isChecked());

        String a1 = et1.getText().toString();

        Symptom symptom = new Symptom(result.toString(),a1);
        mRef.child(phoneNo).child("Symptoms").setValue(symptom);

    }
}
