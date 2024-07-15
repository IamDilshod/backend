package com.example.aop;

import org.springframework.stereotype.Component;

@Component
public class SchoolLibrary extends AbstractLibrary{

//    @Override
    public void getBook() {
        System.out.println("Biz kitob beramiz SchoolLibrary dan");
    }
}
