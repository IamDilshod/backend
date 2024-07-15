package com.example.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=
                new AnnotationConfigApplicationContext(MyConfig.class);

        UniLibrary libraryBean = context.getBean("libraryBean", UniLibrary.class);
        libraryBean.getBook();
        libraryBean.returnBook();
        libraryBean.addBook();

//        libraryBean.returnBook();
//
//        SchoolLibrary schoolLibrary =
//                context.getBean("schoolLibrary", SchoolLibrary.class);
//        schoolLibrary.getBook();

        context.close();
    }
}
