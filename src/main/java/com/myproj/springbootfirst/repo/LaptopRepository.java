package com.myproj.springbootfirst.repo;

import org.springframework.stereotype.Repository;

import com.myproj.springbootfirst.model.Laptop;

@Repository //same as component/service but just to distunguish 
public class LaptopRepository {

public void save(Laptop lap){
    System.out.println("laptop saved");
}

}
