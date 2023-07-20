package org.proserve.caculatortddpractice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CaculatorTddPracticeApplication {

    public static void main(String[] args) {
        SpringApplication.run(CaculatorTddPracticeApplication.class, args);
        CalculatorTest.test();
    }

}
