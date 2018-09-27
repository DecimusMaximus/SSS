package com.sss.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class TestController {

    private Map<Long, String> gWeekDays = new HashMap<Long, String>() {{
       put(1L, "Montag");
       put(2L, "Dienstag");
       put(3L, "Mittwoch");
       put(4L, "Donnerstag");
       put(5L, "Freitag");
       put(6L, "Samstag");
       put(7L, "Sonntag");
    }};

    @RequestMapping(value = "/test/getWeekDays", method = RequestMethod.GET)
    public Map<Long, String> getWeekDays(){
        return gWeekDays;
    }
}
