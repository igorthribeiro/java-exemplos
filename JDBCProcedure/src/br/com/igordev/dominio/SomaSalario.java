package br.com.igordev.dominio;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;

public class SomaSalario {

    /*
        --CODIGO PROCEDURE:
        CREATE PROCEDURE SP_TOTAL_SALARIO(OUT SOMA DECIMAL)
        BEGIN
            SELECT SUM(SALARIO) INTO SOMA FROM FUNCIONARIO;
        END;
    
     */
    private static final String url = "jdbc:mysql://localhost:3306/HR?useTimezone=true&serverTimezone=UTC",
            usuario = "root",
            senha = "oracle_4U";

    private SomaSalario() {
    }

    public static double chamaProcedure() {
        double total = 0;
        try (
                Connection con = DriverManager.getConnection(url, usuario, senha);
                CallableStatement c = con.prepareCall("{CALL SP_TOTAL_SALARIO(?)}");
            ) {
            c.registerOutParameter(1, Types.DOUBLE);
            c.execute();
            total = c.getDouble(1);

        } catch (SQLException e) {
            throw new RuntimeException("Erro ao chamar procedure: " + e.getMessage());
        }
        return total;
    }
}
