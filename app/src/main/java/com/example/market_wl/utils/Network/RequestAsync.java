package com.example.market_wl.utils.Network;

import android.os.AsyncTask;
import android.os.Build;

import androidx.annotation.RequiresApi;

import com.example.market_wl.utils.dataLogger.DataLogger;
import com.github.djunqueirao.RequestResponse;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class RequestAsync extends AsyncTask {
    private RequestResponse result;

    private Consumer<RequestResponse> consumer;
    private Supplier<RequestResponse> supplier;

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    protected Object doInBackground(Object[] objects) {
        try {
            result = supplier.get();
        } catch(NullPointerException e) {
            e.printStackTrace();
        }
        return null;
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    protected void onPostExecute(Object o) {
        try {
            consumer.accept(result);
        } catch(NullPointerException e) {
            e.printStackTrace();
        }
        super.onPostExecute(o);
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    public void execute(
            final Supplier<RequestResponse> supplier
    ) {
        DataLogger.log(supplier.get());
        this.supplier = supplier;
    }

    public void then(
            final Consumer<RequestResponse> consumer
    ) {
        this.consumer = consumer;
        super.execute();
 }
}