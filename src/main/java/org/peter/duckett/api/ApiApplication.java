package org.peter.duckett.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ApiApplication {


    @Bean
    EmployeeRepository employeeRepository() {
        return new EmployeeRepository();
    }
    public static void main(String[] args) {
        SpringApplication.run(ApiApplication.class, args);
    }

}
