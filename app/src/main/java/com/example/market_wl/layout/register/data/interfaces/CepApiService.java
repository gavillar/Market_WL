package com.example.market_wl.layout.register.data.interfaces;

import java.io.IOException;

public interface CepApiService {
     String getAddressByCep(String uri) throws IOException;
}
