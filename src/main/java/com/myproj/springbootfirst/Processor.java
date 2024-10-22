package com.myproj.springbootfirst;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Processor {

    @Autowired   // since we cannot use application context in class other than main class we use autowire to get laptop obj.
    Laptop lap;
    public void process()
    {
    System.out.println("processing...");
    lap.compile();
    }
}
