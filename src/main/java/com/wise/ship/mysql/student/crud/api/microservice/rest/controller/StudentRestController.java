package com.wise.ship.mysql.student.crud.api.microservice.rest.controller;

import com.wise.ship.mysql.student.crud.api.microservice.rest.entities.Student;
import com.wise.ship.mysql.student.crud.api.microservice.rest.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/micro-service/serverOne")
@ResponseBody
public class StudentRestController {

    @Autowired
    private StudentService studentService;

    // handler method to handle list students and return mode and view
    @GetMapping("/students")
    public List<Student> listStudents() {
        return studentService.getAllStudents();
    }

    @PostMapping("/students/save")
    public String saveStudent(@RequestBody Student student) {
        studentService.saveStudent(student);
        return "TRUE";
    }

    @GetMapping("/students/{id}")
    public Student editStudentForm(@PathVariable Long id) {
        return studentService.getStudentById(id);
    }

    @PostMapping("/students/update/{id}")
    public String updateStudent(@PathVariable Long id,
                                @RequestBody Student student) {

        // get student from database by id
        Student existingStudent = studentService.getStudentById(id);
        existingStudent.setId(id);
        existingStudent.setFirstName(student.getFirstName());
        existingStudent.setLastName(student.getLastName());
        existingStudent.setEmail(student.getEmail());

        // save updated student object
        studentService.updateStudent(existingStudent);
        return "TRUE";
    }

    // handler method to handle delete student request

    @DeleteMapping("/students/delete/{id}")
    public String deleteStudent(@PathVariable Long id) {
        studentService.deleteStudentById(id);
        return "TRUE";
    }

}
