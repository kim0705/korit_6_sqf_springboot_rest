package com.study.rest.di;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AA {

    @Autowired
    private BB b;

    public void aCall() {
        System.out.println(b);
        b.bCall();
    }
}