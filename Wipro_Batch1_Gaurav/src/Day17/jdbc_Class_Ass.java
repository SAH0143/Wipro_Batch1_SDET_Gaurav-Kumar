package Day17;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class jdbc_Class_Ass {

    public static void main(String[] args) {

        try {

            
            Class.forName("com.mysql.cj.jdbc.Driver");

            
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/company","root","root@123");

            String query = "INSERT INTO employee VALUES (?, ?, ?, ?)";

           
            PreparedStatement pst = con.prepareStatement(query);

            
            pst.setInt(1, 101);
            pst.setString(2, "Gaurav");
            pst.setString(3, "IT");
            pst.setDouble(4, 50000);
            pst.executeUpdate();

         
            pst.setInt(1, 102);
            pst.setString(2, "Rahul");
            pst.setString(3, "HR");
            pst.setDouble(4, 45000);
            pst.executeUpdate();

         
            pst.setInt(1, 103);
            pst.setString(2, "Aman");
            pst.setString(3, "Finance");
            pst.setDouble(4, 60000);
            pst.executeUpdate();


            pst.setInt(1, 104);
            pst.setString(2, "Sneha");
            pst.setString(3, "Marketing");
            pst.setDouble(4, 55000);
            pst.executeUpdate();

           
            pst.setInt(1, 105);
            pst.setString(2, "Priya");
            pst.setString(3, "Sales");
            pst.setDouble(4, 48000);
            pst.executeUpdate();

            System.out.println("5 Employee Records Inserted Successfully!");

           
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}