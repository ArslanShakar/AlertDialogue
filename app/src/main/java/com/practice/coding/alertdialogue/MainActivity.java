package com.practice.coding.alertdialogue;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private CustomDialogTwo fragmentTwo = new CustomDialogTwo();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onClickAlert(View view) {
        /*
        new android.support.v7.app.AlertDialog.Builder(this)
                .setIcon(android.R.drawable.ic_dialog_info)
                .setCancelable(false)
                .setTitle(" ")
                .setMessage("Login ID or password is incorrect.Please enter the correct credentials.")
                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialogInterface, int arg1) {
                        dialogInterface.dismiss();
                    }
                }).create().show();
        */
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setCancelable(false);
        builder.setTitle("Title");
        builder.setIcon(R.drawable.logo);
        builder.setMessage("Login ID or password is incorrect.Please enter the correct credentials.");
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }


    public void customDialog(View view) {
        CustomDialogFragment fragment = new CustomDialogFragment();
        FragmentManager manager = getSupportFragmentManager();
        fragment.show(manager, "CustomDialog");
    }

    public void customDialog_2(View view) {

        FragmentManager manager = getSupportFragmentManager();
        fragmentTwo.show(manager,"JEMS");

    }

    public void onClickDialogTwo(View view) {
        /* his is a onClick Method of button inside a xml of fragemt layout custom_dialog_two. a way to perform onclick operation
        on button */
        fragmentTwo.dismiss();
    }

    //See difference when normal fragment is showing as dialog
    public void showFragmentAsDialog(View view) {

        //See difference when normal fragment is showing as dialog ..
        // dialog no pop up just simply show in an activity as part of activity just like other components
        //here in the main activity a linear layout inside that the fragment sy showing

        /*FragmentAsDialog fragment = new FragmentAsDialog();
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.add(R.id.linearLayoutForDialog, fragment, "myFragmentAsDialog");
        transaction.commit();
        */
        FragmentAsDialog fragment = new FragmentAsDialog();
        fragment.show(getSupportFragmentManager(), "myFragmentAsDialog");
    }

    public void simpleCustomDialog(View view) {
        Intent intent = new Intent(this, Test.class);
        startActivity(intent);
    }
}
