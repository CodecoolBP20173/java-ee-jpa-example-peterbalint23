package com.codecool.jpaexample.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;
@Entity(name = "Class")
public class Klass {
    private String name;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @OneToMany(mappedBy = "klass")
    private Set<Student> students = new HashSet<>();

    @Enumerated(EnumType.STRING)
    private CCLocation location;

    public Klass() {}

    public Klass(String name, CCLocation location) {

        this.name = name;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student) {
        students.add(student);
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
