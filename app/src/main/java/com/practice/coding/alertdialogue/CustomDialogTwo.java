package com.practice.coding.alertdialogue;

import android.app.Dialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;

public class CustomDialogTwo extends DialogFragment {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        getActivity().setFinishOnTouchOutside(false);
        super.onCreate(savedInstanceState);
    }

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        LayoutInflater inflater = getActivity().getLayoutInflater();
        builder.setView(inflater.inflate(R.layout.custom_dialog_two, null));
        setCancelable(false);
        return builder.create();
    }
}
