package org.ameyTech;

import java.sql.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws ClassNotFoundException {

        // import package
        // load driver
        // create connection
        // create statement
        // execute statement
        // close connection

        Class.forName("org.postgresql.Driver");

        String url = "jdbc:postgresql://localhost:5432/campus_connect_db";

        try {
            Connection conn = DriverManager.getConnection(url, "postgres", "Amey1234");
            System.out.println("Connection Successful");

            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM apis_announcements ORDER BY id DESC");

            while (rs.next()){
                System.out.println(rs.getInt("id") + "\t" + rs.getString(2));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }



    }
}