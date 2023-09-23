package com.wise.ship.mysql.student.crud.api.microservice.rest.services.impls;

import com.wise.ship.mysql.student.crud.api.microservice.rest.entities.Student;
import com.wise.ship.mysql.student.crud.api.microservice.rest.repositories.StudentRepository;
import com.wise.ship.mysql.student.crud.api.microservice.rest.services.StudentService;
import jakarta.servlet.ServletContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.ServletContextAware;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService, ServletContextAware {

    @Autowired
    private StudentRepository studentRepository;

    private ServletContext context;

    public void setServletContext(ServletContext servletContext) {
        this.context = servletContext;
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student getStudentById(Long id) {
        return studentRepository.findById(id).get();
    }

    @Override
    public Student updateStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public void deleteStudentById(Long id) {
        studentRepository.deleteById(id);
    }
}
