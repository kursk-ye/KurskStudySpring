package com.in28minutes.spring.basics.springin5steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class KurskSpringApplication {
    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(KurskSpringApplication.class, args);
        BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
        int sortedNumbers = binarySearch.binarySearch(new int[]{1,2,3,4});
        System.out.println(sortedNumbers);
    }
}
