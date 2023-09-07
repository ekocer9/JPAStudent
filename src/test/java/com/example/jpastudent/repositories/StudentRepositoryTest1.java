package com.example.jpastudent.repositories;

import com.example.jpastudent.model.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class StudentRepositoryTest1 {

    @Autowired
    StudentRepository studentRepository;

    @Test
    void testOneStudent() {
        List<Student> lst = studentRepository.findAll();
        assertEquals(1, lst.size());
    }

}