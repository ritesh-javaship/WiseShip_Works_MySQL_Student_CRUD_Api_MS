package com.wise.ship.mysql.student.crud.api.microservice.rest.repositories;

import com.wise.ship.mysql.student.crud.api.microservice.rest.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{

}
