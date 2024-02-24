package EmployeeManagement;

import java.sql.*;

public class Conn {
    
    Connection c;
    Statement s;

    public Conn () {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); //register the driver class
            c = DriverManager.getConnection("jdbc:mysql:" //connectionstring
            		+ "///employeemanagementsystem", "root", "1234");
            s = c.createStatement(); //creating statement with con class
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}