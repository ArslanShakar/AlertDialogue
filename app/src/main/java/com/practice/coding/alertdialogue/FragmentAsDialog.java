package com.practice.coding.alertdialogue;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class FragmentAsDialog extends DialogFragment implements View.OnClickListener{

    private Button bt_ok;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_as_dialog, null);
        getDialog().requestWindowFeature(STYLE_NO_TITLE);
        setCancelable(false);
        bt_ok = (view).findViewById(R.id.bt_FragmentAsDialog);
        bt_ok.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.bt_FragmentAsDialog)
        {
            dismiss();
        }
    }
}
