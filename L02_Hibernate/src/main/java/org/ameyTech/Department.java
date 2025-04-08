package org.ameyTech;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Department {
    @Id
    private int id;
    private String name;

    @OneToMany(mappedBy = "department")
    private List<Student> students;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
