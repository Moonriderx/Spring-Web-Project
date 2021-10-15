package com.spring.boot.StudentSystem.Entity;

import javax.persistence.*;

@Entity
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // The persistence provider must assign primary keys for the entity using a database identity column
    private Long id;

    @Column(name = "first_name", nullable = false) // if we comment out this JPA will provide the name of the field as column name ("firstName")
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "email", nullable = false)
    private String email;

    public Long getId() {
        return id;
    }

    public Student() {

    }

    public Student(String firstName, String lastNmae, String email) {
        super();
        this.firstName = firstName;
        this.lastName = lastNmae;
        this.email = email;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastNmae() {
        return lastName;
    }

    public void setLastNmae(String lastNmae) {
        this.lastName = lastNmae;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
