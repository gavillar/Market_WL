package com.example.whitelabel.components;


import android.content.Context;
import android.view.Gravity;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.annotation.NonNull;

import com.example.whitelabel.R;
import com.example.whitelabel.components.layout_params.LinearLayoutParams;
import com.example.whitelabel.extensions.LinearLayoutExtended;
import com.example.whitelabel.utils.EditTextUtils;

public class SpinnerContentComponent extends LinearLayoutExtended {

    private Spinner spinner;

    public SpinnerContentComponent(@NonNull Context context) {
        super(context);
        addView(getSpinner());
        setBackground(R.drawable.spinner_content);
        setLayoutParams(
            LinearLayoutParams.line(
                EditTextUtils.getDefaultHeight()
            )
        );
        setGravity(Gravity.CENTER_VERTICAL);
    }

    public Spinner getSpinner() {
        if(spinner == null) {
            spinner = new Spinner(getContext());
            spinner.setLayoutParams(LinearLayoutParams.fill());
        }
        return spinner;
    }

    public void setElements(final String... elements) {
        ArrayAdapter<String> adapter = new ArrayAdapter<>(
            getContext(),
            R.layout.spinner_item,
            elements
        );
        adapter.setDropDownViewResource(R.layout.spinner_dropdown_item);
        getSpinner().setAdapter(adapter);
    }
}
