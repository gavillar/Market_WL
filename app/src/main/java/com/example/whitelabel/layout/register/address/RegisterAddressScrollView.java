package com.example.whitelabel.layout.register.address;

import android.content.Context;
import android.view.ViewGroup;

import com.example.whitelabel.components.EditTextComponent;
import com.example.whitelabel.components.layout_params.LinearLayoutParams;
import com.example.whitelabel.components.PairEditTexts;
import com.example.whitelabel.components.SpinnerContentComponent;
import com.example.whitelabel.layout.register.RegisterScrollView;

public class RegisterAddressScrollView extends RegisterScrollView {

    private PairEditTexts roadNdNumberPairEditTexts;
    private EditTextComponent cityEditText;
    private SpinnerContentComponent spinner;

    public RegisterAddressScrollView(Context context) {
        super(context);
        addView(getRoadNdNumberPairEditTexts());
        addView(getCityEditText());
        addView(getSpinner());
    }

    public PairEditTexts getRoadNdNumberPairEditTexts() {
        if(roadNdNumberPairEditTexts == null) {
            roadNdNumberPairEditTexts = new PairEditTexts(getContext());
            LinearLayoutParams linearLayoutParams = LinearLayoutParams.ofSize(
                    ViewGroup.LayoutParams.MATCH_PARENT,
                    ViewGroup.LayoutParams.MATCH_PARENT
            );
            linearLayoutParams.setMargins(0,20,0,0);
            roadNdNumberPairEditTexts.setLayoutParams(linearLayoutParams);
            roadNdNumberPairEditTexts.setPairWeight(.65f,.35f);
        }
        return roadNdNumberPairEditTexts;
    }

    public EditTextComponent getCityEditText() {
        if(cityEditText == null) {
            cityEditText = new EditTextComponent(getContext());
        }
        return cityEditText;
    }

    public SpinnerContentComponent getSpinner() {
        if (spinner == null) {
            spinner = new SpinnerContentComponent(getContext());
            spinner.setElements(
                "RJ", "SP", "RS"
            );
        }
        return spinner;
    }


    public void setLabelNdHint(
        final int addressLabel,
        final int cepHint,
        final int roadHint,
        final int numberHint,
        final int cityHint
    ) {
        super.setLabelNdHint(addressLabel, cepHint);
        getRoadNdNumberPairEditTexts().setPairHint(roadHint, numberHint);
        getCityEditText().setHint(cityHint);
    }
}