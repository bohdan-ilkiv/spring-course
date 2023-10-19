package com.example.springcourse.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.MAY;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository repository){
        return args -> {
            Student bohdan = new Student(
                    "Bohdan",
                    "ilkivbo16@gmail.com",
                    LocalDate.of(2003, MAY, 16)
            );

            Student alex = new Student(
                    "Alex",
                    "alex@gmail.com",
                    LocalDate.of(2004, MAY, 16)
            );

            repository.saveAll(
                    List.of(bohdan, alex)
            );
        };
    }
}
