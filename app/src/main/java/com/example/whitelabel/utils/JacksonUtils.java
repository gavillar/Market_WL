package com.example.whitelabel.utils;

import com.fasterxml.jackson.databind.ObjectMapper;

public abstract class JacksonUtils {
    public static <T> T decode(
            String jsonString, Class<T> typeReference
    ) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            return objectMapper.readValue(jsonString, typeReference);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
