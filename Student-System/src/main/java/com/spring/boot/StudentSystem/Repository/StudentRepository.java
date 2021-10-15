package com.spring.boot.StudentSystem.Repository;

import com.spring.boot.StudentSystem.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;


public interface StudentRepository extends JpaRepository<Student, Long> { // two params, the type of the entity and the type of the primary key
// its already annotated with @Repository in the JPA class so we don't need to add it here

    


}
