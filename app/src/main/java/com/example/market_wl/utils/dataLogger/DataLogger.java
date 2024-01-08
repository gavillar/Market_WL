package com.example.market_wl.utils.dataLogger;

import com.github.djunqueirao.RequestResponse;

import java.util.HashMap;
import java.util.Map;

public class DataLogger {

    public static <T> void log(
            final RequestResponse requestResponse
    ) {
        log(
            null,
            requestResponse.getCode(),
            null,
            requestResponse.getError().getMessage(),
            null,
            requestResponse.getMessage(),
            requestResponse.getBody()
        );
    }

    public static <T> void log(String path,
                               int statusCode,
                               Map<String, Object> headers,
                               String error,
                               Map<String, Object> params,
                               Object response,
                               T responseValue) {

        Map<String, Object> logDictionary = new HashMap<>();
        logDictionary.put("path", path);
        logDictionary.put("status code", statusCode);
        logDictionary.put("headers", headers);
        logDictionary.put("message", error);
        logDictionary.put("params", params);
        logDictionary.put("response", response);
        logDictionary.put("responseValue", responseValue);

        System.out.println(logDictionary);
    }

    public static void logEvent(String title, String message) {
        Map<String, Object> log = new HashMap<>();
        log.put("title", title);
        log.put("message", message);

        System.out.println(log);
    }
}
