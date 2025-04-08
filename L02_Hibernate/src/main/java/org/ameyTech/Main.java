package org.ameyTech;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // 📍 Address setup
        Address address1 = new Address();
        address1.setStreet("MG Road");
        address1.setCity("Pune");

        Address address2 = new Address();
        address2.setStreet("Ring Road");
        address2.setCity("Bangalore");

        // 🧑🏽‍🎓 Student setup
        Student student1 = new Student();
        student1.setName("Amit Sharma");
        student1.setAddress(address1);

        Student student2 = new Student();
        student2.setName("Priya Mehta");
        student2.setAddress(address2);

        // 🎓 Course setup
        Course course1 = new Course();
        course1.setName("Data Structures");

        Course course2 = new Course();
        course2.setName("Operating Systems");

        // 👥 Many-to-Many linking
        student1.setCourses(Arrays.asList(course1, course2));
        student2.setCourses(Arrays.asList(course1)); // Only one course

        try (SessionFactory sf = new Configuration()
                .configure()
                .addAnnotatedClass(Student.class)
                .addAnnotatedClass(Address.class)
                .addAnnotatedClass(Course.class)
                .addAnnotatedClass(Department.class)
                .addAnnotatedClass(Teacher.class)
                .buildSessionFactory()) {

            Session session = sf.openSession();
            Transaction tx = session.beginTransaction();

            // Save in right order (or cascade)
            session.persist(course1);
            session.persist(course2);
            session.persist(address1);
            session.persist(address2);
            session.persist(student1);
            session.persist(student2);

            tx.commit();
            session.close();

            System.out.println("✅ Inserted Indian records successfully!");
        }
    }
}
