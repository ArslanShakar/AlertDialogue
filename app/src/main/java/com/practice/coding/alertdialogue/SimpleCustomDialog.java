package com.practice.coding.alertdialogue;

import android.app.Dialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;

public class SimpleCustomDialog extends DialogFragment implements View.OnClickListener {

    private Button bt_ok;
    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        LayoutInflater inflater = getActivity().getLayoutInflater();
        View view = inflater.inflate(R.layout.simple_custom_dialog, null);
        builder.setView(view);
        setCancelable(false);

        bt_ok = (view).findViewById(R.id.bt_simpleCustomDialogOK);
        bt_ok.setOnClickListener(this);

        return builder.create();
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.bt_simpleCustomDialogOK)
        {
            dismiss();
        }

    }
}
