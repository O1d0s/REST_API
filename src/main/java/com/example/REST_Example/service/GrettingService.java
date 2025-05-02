package com.example.REST_Example.service;

import com.example.REST_Example.record.Gretting;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class GrettingService {
    HashMap<Integer, Gretting> body = new HashMap<>();


    public void createBody(Gretting gretting){
        body.put(gretting.id(),gretting);
    }

    public int getGretting(Integer id){
        return body.get(id).amount();
    }
}
