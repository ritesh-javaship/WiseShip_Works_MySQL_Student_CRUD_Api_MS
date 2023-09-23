package com.wise.ship.mysql.student.crud.api.microservice.rest.services;

import com.wise.ship.mysql.student.crud.api.microservice.rest.entities.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();

    Student saveStudent(Student student);

    Student getStudentById(Long id);

    Student updateStudent(Student student);

    void deleteStudentById(Long id);
}
