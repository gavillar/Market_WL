package com.example.market_wl.utils.state;

public abstract class StateView<T> {
    private T data;
    private String message;

    private StateView(T data, String message) {
        this.data = data;
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public String getMessage() {
        return message;
    }

    public static class Loading<T> extends StateView<T> {
        public Loading() {
            super(null, null);
        }
    }

    public static class Error<T> extends StateView<T> {
        public Error(String message) {
            super(null, message);
        }
    }

    public static class Success<T> extends StateView<T> {
        public Success(T data, String message) {
            super(data, message);
        }
    }
}
