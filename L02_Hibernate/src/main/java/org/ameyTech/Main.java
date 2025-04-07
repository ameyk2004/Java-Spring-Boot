package org.ameyTech;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Employee emp1 = new Employee(106, "Vardhan Dongre", 250000);

        Session session;

        try (SessionFactory sf = new Configuration()
                .addAnnotatedClass(Employee.class)
                .configure()
                .buildSessionFactory()) {

            session = sf.openSession();

            Transaction transaction = session.beginTransaction();

            System.out.println(emp1);
            session.persist(emp1);

            transaction.commit();
        }
    }
}