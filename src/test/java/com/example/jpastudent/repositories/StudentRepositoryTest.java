package com.example.jpastudent.repositories;

import com.example.jpastudent.model.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class StudentRepositoryTest {

    @Autowired
    StudentRepository studentRepository;

    @Test
    void testOnTime() {
        List<Student> lst = studentRepository.findAllByName("Tim");
        assertEquals(1, lst.size());
    }

    @Test
    void testOneViggo() {
        Student s1 = new Student();
        s1.setName("Viggo");
        s1.setBornDate(LocalDate.of(2010, 11, 12));
        studentRepository.save(s1);
        List<Student> lst = studentRepository.findAllByName("Viggo");
        assertEquals(1, lst.size());
    }

}