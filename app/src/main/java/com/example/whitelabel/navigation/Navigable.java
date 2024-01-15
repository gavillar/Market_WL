package com.example.whitelabel.navigation;

public interface Navigable {

    default CharSequence getName() {
        return this.toString();
    }
}