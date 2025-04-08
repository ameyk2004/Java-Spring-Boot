package org.ameyTech;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Teacher {

    @Id
    private int id;
    private String name;

    @OneToMany(mappedBy = "teacher")
    private List<Course> courses;


}
