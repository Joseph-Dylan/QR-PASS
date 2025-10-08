package qr_pass;

import java.sql.*;


public class DataBaseConection {
    private static Connection con;

    public static final String driver = "com.mysql.cj.jdbc.Driver";
    public static final String user = "root";
    public static final String pass = "Qeqrqt131415"; //pongan su contraseña
    public static final String url = "jdbc:mysql://localhost:3306/Registro_Cecyt9";

    public Connection conectar() {
        con = null;
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url, user, pass);
        } catch (ClassNotFoundException | SQLException e) {
        }
        
        return con;
    }
}


