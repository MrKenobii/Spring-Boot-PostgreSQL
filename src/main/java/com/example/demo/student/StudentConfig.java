package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student melis = new Student(
                    "Melis",
                    "melis.gorucu@std.yeditepe.edu.tr",
                    LocalDate.of(1999, Month.DECEMBER, 1)
            );
            Student anil = new Student(
                    "Anıl",
                    "anil.duyguc@std.yeditepe.edu.tr",
                    LocalDate.of(1999, Month.JUNE, 15)
            );
            repository.saveAll(
                    List.of(melis, anil)
            );
        };
    }
}
