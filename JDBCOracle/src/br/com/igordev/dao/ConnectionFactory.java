package br.com.igordev.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    public static Connection getConnection() {
        String url = "jdbc:oracle:thin:@oralinux.local:1539/XEPDB1";
        String user = "ora41";
        String password = "ora41";
        Connection con = null;
        try {
            con = DriverManager.getConnection(url, user, password);
            System.out.println("Conexão com o BD Oracle obtida.");
        } catch (SQLException e) {
            System.out.println("Erro ao objter conexão!\n" + e.getMessage());
        }
        return con;
    }

}
