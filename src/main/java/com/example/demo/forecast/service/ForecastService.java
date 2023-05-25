package com.example.demo.forecast.service;

import com.example.demo.forecast.dto.FcstItems;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;

@Service
public class ForecastService {

    public FcstItems parsingJsonObject(String json) {
        FcstItems items = null;
        try {
            ObjectMapper mapper = new ObjectMapper();
            items = mapper.readValue(json, FcstItems.class);
        } catch(Exception e) {
            e.printStackTrace();
        }
        return items;
    }
}
