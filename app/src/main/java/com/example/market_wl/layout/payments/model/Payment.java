package com.example.market_wl.layout.payments.model;

import android.widget.ImageView;

public class Payment {

    public String type;

    public ImageView image;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ImageView getImage() {
        return image;
    }

    public void setImage(ImageView image) {
        this.image = image;
    }

    public Payment(String type) {
        this.type = type;
  //      this.image = image;
    }
}
