package com.practice.coding.alertdialogue;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Test extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
    }

    public void testDialog(View view) {
        SimpleCustomDialog fraqmentDialog = new SimpleCustomDialog();
        fraqmentDialog.show(getSupportFragmentManager(), "SimpleCustomfragmentDialog");
    }
}
