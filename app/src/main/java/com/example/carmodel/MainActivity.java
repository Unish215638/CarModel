package com.example.carmodel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText make, year, color, purchase_price, engine_size;
    TextView showres;
    Button btnCreate;
    String makes, years, colors;
    double purchase_priced, engine_sized;
    int i=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        make = findViewById(R.id.maket);
        year = findViewById(R.id.yeart);
        color = findViewById(R.id.colort);
        purchase_price = findViewById(R.id.purchaset);
        engine_size = findViewById(R.id.enginet);
        btnCreate = findViewById(R.id.btncreate);
        showres = findViewById(R.id.show);

        btnCreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                carShow();
            }
        });
    }

    public void carShow() {
        if (make.getText().toString().trim().isEmpty()) {
            make.setError("Make Required");
        } else if (year.getText().toString().trim().isEmpty()) {

            year.setError("Year Required");
        } else if (color.getText().toString().trim().isEmpty()) {
            color.setError("Color Required");
        } else if (purchase_price.getText().toString().isEmpty()) {
            purchase_price.setError("Purchase Required");
        } else if (engine_size.getText().toString().trim().isEmpty()) {
            engine_size.setError("Engine Size Required");
        } else {

            i++;

            makes = make.getText().toString().trim();
            years = year.getText().toString().trim();
            colors = color.getText().toString().trim();
            purchase_priced = Double.parseDouble(purchase_price.getText().toString());
            engine_sized = Double.parseDouble(engine_size.getText().toString());
            CarDetails cdr = new CarDetails(makes, years, colors, purchase_priced, engine_sized);

            showres.append("This is Vehicle no."+i + "\n" + "Manufacture:" + cdr.getMake() +
                    "\n" + "Year:" + cdr.getYear() + "\n" + "Color:" + cdr.getColor() +
                    "\n" + "Purchase Price:" + cdr.getPurchase_price() + "\n" +
                    "Engine Size:" + cdr.getEngine_size() + "\n"+"--------------------------"+"\n");

        }
    }
}
