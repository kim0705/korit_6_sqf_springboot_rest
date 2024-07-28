package com.study.rest.controller;

import com.study.rest.di.AA;
import com.study.rest.di.BB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AController {

    @Autowired
    private AA a;

    @ResponseBody
    @GetMapping("/test1")
    public Object a() {
        a.aCall();
        return null;
    }
}
