package com.example.market_wl.layout.register.data.provider;

import android.support.v4.os.IResultReceiver;
import android.util.Log;

import com.example.market_wl.layout.register.data.interfaces.CepApiService;
import com.example.market_wl.utils.Network.RequestAsync;
import com.github.djunqueirao.RequestManager;

public class RegisterProvider implements CepApiService {

    final RequestAsync requestAsync = new RequestAsync();
    private String cep = "06220060";
    private String BASE_URL = "viacep.com.br/ws/";
    private String url = cep + "/json";
    @Override
    public String getAddressByCep(String uri)  {

        requestAsync.execute(
                () -> new RequestManager(url).get("")
        );
        requestAsync.then(
                result -> {
                    result.getBody();
                }
        );
        return uri;
    }
}
