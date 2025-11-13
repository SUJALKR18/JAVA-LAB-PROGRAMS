import java.sql.*;
public class EmployeeDML {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/test";
        String user = "root";
        String password = "Sujal@6219";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to MySQL database successfully!");
            Statement stmt = con.createStatement();
            String insert = "INSERT INTO EMPLOYEE (name, designation, salary) VALUES " +
                            "('Sujal ', 'Software Engineer', 8500000), " +
                            "('Rahul', 'Data Analyst', 6200000), " +
                            "('Arjun', 'Project Manager', 9000000)";
            stmt.executeUpdate(insert);
            System.out.println("Records inserted successfully!");

            String update = "UPDATE EMPLOYEE SET salary = 6200000 WHERE name = 'Rahul'";
            stmt.executeUpdate(update);
            System.out.println("Record updated successfully!");

            String delete = "DELETE FROM EMPLOYEE WHERE name = 'Arjun'";
            stmt.executeUpdate(delete);
            System.out.println("Record deleted successfully!");

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
