package com.myproj.springbootfirst.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myproj.springbootfirst.model.Laptop;
import com.myproj.springbootfirst.repo.LaptopRepository;
@Service
public class LaptopService {

    @Autowired
    private LaptopRepository repo;

    public void addLaptop(Laptop lap){
        System.out.println("laptop added");
        repo.save(lap);
    }

    public Boolean isGoodForProg(Laptop lap){
        return true;
    }


}
