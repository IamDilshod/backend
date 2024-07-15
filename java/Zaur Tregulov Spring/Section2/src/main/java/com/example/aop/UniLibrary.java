package com.example.aop;

import org.springframework.stereotype.Component;

@Component("libraryBean")
public class UniLibrary extends AbstractLibrary{

//    @Override
    public void getBook(){
        System.out.println("Biz kitob beramiz UniLibrary dan");
    }

    public void returnBook(){
        System.out.println("Biz kitobni qaytaryapmiz UniLibrary ga ");
    }

    public void getMagazine(){
        System.out.println("Biz jurnalni olamiz UniLibrary dan");
    }

    public void returnMagazine(){
        System.out.println("Biz jurnalni qaytaramiz UniLibrary ga");
    }

    public void addBook(){
        System.out.println("Biz UniLibrary ga kitob qo'shamiz");
    }

    public void addMagazine(){
        System.out.println("Biz UniLibrary ga jurnal qo'shamiz");
    }
}
