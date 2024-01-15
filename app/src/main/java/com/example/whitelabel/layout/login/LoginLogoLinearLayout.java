package com.example.whitelabel.layout.login;

import android.content.Context;
import android.view.Gravity;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.whitelabel.R;
import com.example.whitelabel.components.LinearLayoutComponent;
import com.example.whitelabel.components.layout_params.LinearLayoutParams;
import com.example.whitelabel.components.layout_params.RelativeLayoutParams;
import com.example.whitelabel.components.TextViewComponent;
import com.example.whitelabel.extensions.ImageViewExtended;

class LoginLogoLinearLayout extends LinearLayoutComponent {

    private TextView greetTextView;
    private ImageViewExtended greetImageView;
    private RelativeLayout greetRelativeLayout;

    public LoginLogoLinearLayout(Context context) {
        super(context);
        setGravity(Gravity.CENTER);
        setLayoutParams(LinearLayoutParams.line());
        addView(getGreetRelativeLayout());
    }

    private RelativeLayout getGreetRelativeLayout() {
        if(greetRelativeLayout == null) {
            greetRelativeLayout = new RelativeLayout(getContext());
            greetRelativeLayout.setLayoutParams(LinearLayoutParams.line());
            greetRelativeLayout.setGravity(Gravity.CENTER);
            greetRelativeLayout.addView(getGreetImageView());
            greetRelativeLayout.addView(getGreetTextView());
        }
        return greetRelativeLayout;
    }

    private ImageView getGreetImageView() {
        if(greetImageView == null) {
            greetImageView = new ImageViewExtended(getContext());
            final RelativeLayoutParams layoutParams = (
                    RelativeLayoutParams.ofSize(115,115)
            );
            layoutParams.setToLeftOf(getGreetTextView());
            layoutParams.setCenterVertical();
            layoutParams.rightMargin = 20;
            greetImageView.setLayoutParams(layoutParams);
            greetImageView.setImageDrawable(R.drawable.ic_cart);
        }
        return greetImageView;
    }

    private TextView getGreetTextView() {
        if(greetTextView == null) {
            greetTextView = new TextViewComponent(getContext());
            greetTextView.setText(R.string.app_name);
            final RelativeLayoutParams layoutParams = (
                    RelativeLayoutParams.wrap()
            );
            layoutParams.setCenterHorizontal();
            greetTextView.setLayoutParams(layoutParams);
            greetTextView.setTextSize(40);
            greetTextView.setTextColor(getResources().getColor(R.color.gray_FF444444));
        }
        return greetTextView;
    }
}