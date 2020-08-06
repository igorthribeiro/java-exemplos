package br.com.igordev.teste;

import br.com.igordev.dao.ConnectionFactory;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TesteSelect {

    public static void main(String[] args) {
        String sql = "SELECT EMPLOYEE_ID, FIRST_NAME FROM EMPLOYEES";
        try (Connection con = ConnectionFactory.getConnection();
                Statement stmt = con.createStatement()) {
            ResultSet rs = stmt.executeQuery(sql);
            System.out.println("\n\nRelação de funcionarios:");
            while (rs.next()) {
                System.out.print("#ID: " + rs.getInt("EMPLOYEE_ID") + " - ");
                System.out.println("Nome: " + rs.getString("FIRST_NAME"));
            }
        } catch (SQLException e) {
            System.out.println("Erro ao executar comando: " + e.getMessage());
        }
    }

}
