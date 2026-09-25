/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SQL;

/**
 *
 * @author vun19
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class sql {
    private static final String URL = "jdbc:postgresql://localhost:5432/QL_ThuVien";
    private static final String USER = "postgres";
    private static final String PASSWORD = "1234";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
