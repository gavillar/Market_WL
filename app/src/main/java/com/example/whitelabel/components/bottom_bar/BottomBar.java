package com.example.whitelabel.components.bottom_bar;

import android.content.Context;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.whitelabel.R;
import com.example.whitelabel.components.layout_params.LinearLayoutParams;
import com.example.whitelabel.layout.main.cart.CartActivity;
import com.example.whitelabel.layout.main.coupon.CouponActivity;
import com.example.whitelabel.layout.main.discount.DiscountActivity;
import com.example.whitelabel.layout.main.home.HomeActivity;
import com.example.whitelabel.layout.main.profile.ProfileActivity;
import com.example.whitelabel.utils.LayoutParamsUtils;

public class BottomBar extends LinearLayout {

    private BottomBarImageView homeButton;
    private BottomBarImageView cartButton;
    private BottomBarImageView discountButton;
    private BottomBarImageView couponButton;
    private BottomBarImageView profileButton;

    public BottomBar(Context context) {
        super(context);
        setLayoutParams(
            LinearLayoutParams.line(
                LayoutParamsUtils.getActionBarHeight(getContext())
            )
        );
        addView(getHomeButton());
        addView(getCartButton());
        addView(getDiscountButton());
        addView(getCouponButton());
        addView(getProfileButton());
        setPadding(0,20,0,20);
    }

    private ImageView getHomeButton() {
        if(homeButton == null) {
            homeButton = newButton();
            homeButton.setImageDrawable(R.drawable.ic_home);
            homeButton.setTargetView(HomeActivity.class);
        }
        return homeButton;
    }

    private BottomBarImageView getCartButton() {
        if(cartButton == null) {
            cartButton = newButton();
            cartButton.setImageDrawable(R.drawable.ic_cart);
            cartButton.setTargetView(CartActivity.class);
        }
        return cartButton;
    }

    private BottomBarImageView getDiscountButton() {
        if(discountButton == null) {
            discountButton = newButton();
            discountButton.setImageDrawable(R.drawable.ic_discount);
            discountButton.setTargetView(DiscountActivity.class);
        }
        return discountButton;
    }

    private BottomBarImageView getCouponButton() {
        if(couponButton == null) {
            couponButton = newButton();
            couponButton.setImageDrawable(R.drawable.ic_coupon);
            couponButton.setTargetView(CouponActivity.class);
        }
        return couponButton;
    }

    private BottomBarImageView getProfileButton() {
        if(profileButton == null) {
            profileButton = newButton();
            profileButton.setImageDrawable(R.drawable.ic_account_box);
            profileButton.setTargetView(ProfileActivity.class);
        }
        return profileButton;
    }

    private BottomBarImageView newButton() {
        final BottomBarImageView button = new BottomBarImageView(getContext());
        final LinearLayoutParams layoutParams = (
                LinearLayoutParams.fill()
        );
        layoutParams.weight = 1;
        button.setScaleType(ImageView.ScaleType.FIT_CENTER);
        button.setLayoutParams(layoutParams);
        return button;
    }

    public void setOnClickListener(
            final OnClickListener onClickListener
    ) {
        getHomeButton().setOnClickListener(onClickListener);
        getCartButton().setOnClickListener(onClickListener);
        getCouponButton().setOnClickListener(onClickListener);
        getDiscountButton().setOnClickListener(onClickListener);
        getProfileButton().setOnClickListener(onClickListener);
    }
}