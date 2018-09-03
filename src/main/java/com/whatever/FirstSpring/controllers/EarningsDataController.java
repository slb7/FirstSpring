package com.whatever.FirstSpring.controllers;

import com.whatever.FirstSpring.EarningsData;
import com.whatever.FirstSpring.FirstSpringApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class EarningsDataController {
    @RequestMapping("/EarningsData/{symbol}")
    EarningsData[] get(@PathVariable String symbol){
        ArrayList<EarningsData> al = FirstSpringApplication.map.get(symbol);
        EarningsData[] rv = new EarningsData[al.size()];
        al.toArray(rv);
        return rv;
    }
}
