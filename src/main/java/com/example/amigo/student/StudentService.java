package com.example.amigo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {

    public List<Student> getStudents()
    {
        return List.of(
                new Student(
                        1L,
                        "Vishal",
                        "vishal@gmail.com",
                        LocalDate.of(2000, Month.JANUARY, 12),
                        22
                ),
                new Student(
                        2L,
                        "Kesav",
                        "kesav@gmail.com",
                        LocalDate.of(2003, Month.AUGUST, 13),
                        19
                )
        );
    }
}
