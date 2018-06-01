package codekamp;

import java.sql.*;

/**
 * Created by cerebro on 01/06/18.
 */
public class Demo {
    public static void main(String[] args) {
        try {
            Class.forName("org.sqlite.JDBC");
        } catch (ClassNotFoundException e) {
            System.out.println("Please download JDBC");
            return;
        }

        try {
            Connection conn = DriverManager.getConnection("jdbc:sqlite:src/codekamp/mydb.sqlite");
            Statement stmt = conn.createStatement();

            ResultSet rs = stmt.executeQuery("SELECT `name`, `email` FROM `students`");

            while(rs.next()) {
                System.out.println(rs.getString("name"));
                System.out.println(rs.getString("email"));
                System.out.println(rs.getInt("age"));
                System.out.println("------------");
            }


            stmt.execute("INSERT INTO `students` (`name`, `email`, `age`) VALUES('Jignesh', 'jig@codekamp.in', 23)");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
