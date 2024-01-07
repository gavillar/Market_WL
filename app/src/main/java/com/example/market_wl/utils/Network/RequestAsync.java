package com.example.market_wl.utils.Network;

import android.os.AsyncTask;
import android.os.Build;

import com.github.djunqueirao.RequestResponse;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class RequestAsync extends AsyncTask {
    private RequestResponse result;

    private Consumer<RequestResponse> consumer;
    private Supplier<RequestResponse> supplier;

    @Override
    protected Object doInBackground(Object[] objects) {
        try {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                result = supplier.get();
            }
        } catch(NullPointerException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    protected void onPostExecute(Object o) {
        try {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                consumer.accept(result);
            }
        } catch(NullPointerException e) {
            e.printStackTrace();
        }
        super.onPostExecute(o);
    }

    public void execute(
            final Supplier<RequestResponse> supplier
    ) {
        this.supplier = supplier;
    }

    public void then(
            final Consumer<RequestResponse> consumer
    ) {
        this.consumer = consumer;
        super.execute();
 }
}