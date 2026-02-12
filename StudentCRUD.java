import java.sql.*;
import java.util.Scanner;

public class StudentCRUD {

    static final String url = "jdbc:mysql://localhost:3306/student_marks_db";
    static final String user = "root";
    static final String password = "aiml";

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            Connection con = DriverManager.getConnection(url, user, password);
            System.out.println("Connected Successfully!");

            while (true) {
                System.out.println("\n1. Insert");
                System.out.println("2. View");
                System.out.println("3. Update");
                System.out.println("4. Delete");
                System.out.println("5. Exit");
                System.out.print("Choose: ");
                int choice = sc.nextInt();

                switch (choice) {

                    // 🔹 CREATE
                    case 1:
                        System.out.print("Enter Name: ");
                        sc.nextLine();
                        String name = sc.nextLine();

                        System.out.print("Enter Marks: ");
                        int marks = sc.nextInt();

                        String insertQuery = "INSERT INTO students(name, marks) VALUES(?, ?)";
                        PreparedStatement ps1 = con.prepareStatement(insertQuery);
                        ps1.setString(1, name);
                        ps1.setInt(2, marks);
                        ps1.executeUpdate();
                        System.out.println("Record Inserted!");
                        break;

                    // 🔹 READ
                    case 2:
                        String selectQuery = "SELECT * FROM students";
                        Statement st = con.createStatement();
                        ResultSet rs = st.executeQuery(selectQuery);

                        System.out.println("\nID\tName\tMarks");
                        while (rs.next()) {
                            System.out.println(rs.getInt("id") + "\t" +
                                    rs.getString("name") + "\t" +
                                    rs.getInt("marks"));
                        }
                        break;

                    // 🔹 UPDATE
                    case 3:
                        System.out.print("Enter ID to Update: ");
                        int updateId = sc.nextInt();

                        System.out.print("Enter New Marks: ");
                        int newMarks = sc.nextInt();

                        String updateQuery = "UPDATE students SET marks=? WHERE id=?";
                        PreparedStatement ps2 = con.prepareStatement(updateQuery);
                        ps2.setInt(1, newMarks);
                        ps2.setInt(2, updateId);
                        ps2.executeUpdate();
                        System.out.println("Record Updated!");
                        break;

                    // 🔹 DELETE
                    case 4:
                        System.out.print("Enter ID to Delete: ");
                        int deleteId = sc.nextInt();

                        String deleteQuery = "DELETE FROM students WHERE id=?";
                        PreparedStatement ps3 = con.prepareStatement(deleteQuery);
                        ps3.setInt(1, deleteId);
                        ps3.executeUpdate();
                        System.out.println("Record Deleted!");
                        break;

                    case 5:
                        System.out.println("Exiting...");
                        con.close();
                        return;

                    default:
                        System.out.println("Invalid Choice!");
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}






