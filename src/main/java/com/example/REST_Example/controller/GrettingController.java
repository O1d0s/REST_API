package com.example.REST_Example.controller;

import com.example.REST_Example.record.Gretting;
import org.springframework.web.bind.annotation.*;
import com.example.REST_Example.service.GrettingService;

@RestController
public class GrettingController {

    public GrettingController(GrettingService grettingService) {
        this.grettingService = grettingService;
    }

    GrettingService grettingService;

    @PostMapping(value = "/post",consumes = "application/json")
    public String createBody(@RequestBody Gretting gretting){
        grettingService.createBody(gretting);
        return "Добавлена сумма " + gretting.amount()  + " под id " + gretting.id();
    }

    @GetMapping(path = "/get")
    public String getAmount(@RequestParam(value = "id", defaultValue = "0") int id){
        return "Сумма под " + id + " будет " + grettingService.getGretting(id);
    }
}