package com.patrick.a4itb_sept19_alert;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DialogTitle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnShowAlert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnShowAlert = (Button) findViewById(R.id.btn_alert);
    }

    public void showAlertDialog (View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Do you want to close the application?")
                .setMessage("This is an alert message!")
                .setCancelable(true)
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        finish();
                    }
                })
                .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }
}
