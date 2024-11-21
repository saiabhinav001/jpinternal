import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class MySQLCRUD {
    public static void main(String[] args) {
        // Database connection details
        String url = "jdbc:mysql://localhost:3306/employee";
        String user = "root";
        String password = "1234";

        // Queries for CRUD operations
        String createTableQuery = "CREATE TABLE IF NOT EXISTS employee (" +
                "ID INT AUTO_INCREMENT PRIMARY KEY, " +
                "name VARCHAR(50), " +
                "Dept VARCHAR(50), " +
                "age INT)";
        String insertQuery = "INSERT INTO employee (name, Dept, age) VALUES (?, ?, ?)";
        String updateQuery = "UPDATE employee SET name = ?, Dept = ?, age = ? WHERE ID = ?";
        String deleteQuery = "DELETE FROM employee WHERE ID = ?";
        String selectQuery = "SELECT * FROM employee";

        try {
            // 1. Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2. Establish the Connection
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the database!");

            // 3. Create a Statement object to create a table
            Statement stmt = conn.createStatement();
            stmt.execute(createTableQuery);
            System.out.println("Table 'employee' created or already exists.");

            // 4. Insert Records
            PreparedStatement insertStmt = conn.prepareStatement(insertQuery);
            insertStmt.setString(1, "John Doe");
            insertStmt.setString(2, "Engineering");
            insertStmt.setInt(3, 30);
            insertStmt.executeUpdate();

            insertStmt.setString(1, "Jane Smith");
            insertStmt.setString(2, "Marketing");
            insertStmt.setInt(3, 25);
            insertStmt.executeUpdate();
            System.out.println("Records inserted successfully!");

            // 5. Update a Record
            PreparedStatement updateStmt = conn.prepareStatement(updateQuery);
            updateStmt.setString(1, "John Updated");
            updateStmt.setString(2, "Tech");
            updateStmt.setInt(3, 35);
            updateStmt.setInt(4, 1); // Update where ID = 1
            updateStmt.executeUpdate();
            System.out.println("Record updated successfully!");

            // 6. Delete a Record
            PreparedStatement deleteStmt = conn.prepareStatement(deleteQuery);
            deleteStmt.setInt(1, 2); // Delete where ID = 2
            deleteStmt.executeUpdate();
            System.out.println("Record deleted successfully!");

            // 7. Retrieve and Display Records
            ResultSet rs = stmt.executeQuery(selectQuery);
            System.out.println("ID\tName\t\t\tDept\t\t\tAge");
            while (rs.next()) {
                int id = rs.getInt("ID");
                String name = rs.getString("name");
                String dept = rs.getString("Dept");
                int age = rs.getInt("age");
                System.out.println(id + "\t" + name + "\t\t" + dept + "\t\t" + age);
            }

            // 8. Close all resources
            rs.close();
            insertStmt.close();
            updateStmt.close();
            deleteStmt.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
