import java.sql.*;
public class EmployeeSelect {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/test";
        String user = "root";
        String password = "Sujal@6219";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to MySQL database successfully!");
            Statement stmt = con.createStatement();
            String query = "SELECT * FROM EMPLOYEE";
            ResultSet rs = stmt.executeQuery(query);
            System.out.println("\nEMPLOYEE TABLE DATA:");
            System.out.printf("%-5s %-15s %-15s %-10s%n", "ID", "NAME", "DESIGNATION", "SALARY");
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String designation = rs.getString("designation");
                double salary = rs.getDouble("salary");
                System.out.printf("%-5d %-15s %-15s %-10.2f%n", id, name, designation, salary);
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
