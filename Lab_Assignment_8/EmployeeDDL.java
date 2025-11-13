import java.sql.*;
public class EmployeeDDL {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/test";
        String user = "root";
        String password = "Sujal@6219";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to MySQL database successfully!");
            Statement stmt = con.createStatement();
            String createTable = "CREATE TABLE IF NOT EXISTS EMPLOYEE (" +
                                 "id INT PRIMARY KEY AUTO_INCREMENT, " +
                                 "name VARCHAR(50), " +
                                 "designation VARCHAR(50), " +
                                 "salary DOUBLE)";
            stmt.executeUpdate(createTable);
            System.out.println("EMPLOYEE table created successfully!");
            String alterTableAdd = "ALTER TABLE EMPLOYEE ADD COLUMN department VARCHAR(50)";
            stmt.executeUpdate(alterTableAdd);
            System.out.println("Column 'department' added successfully!");
            String renameColumn = "ALTER TABLE EMPLOYEE RENAME COLUMN department TO dept";
            stmt.executeUpdate(renameColumn);
            System.out.println("Column renamed successfully!");
            String dropColumn = "ALTER TABLE EMPLOYEE DROP COLUMN dept";
            stmt.executeUpdate(dropColumn);
            System.out.println("Column dropped successfully!");
            con.close();
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
