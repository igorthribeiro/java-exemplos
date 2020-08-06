package br.com.igordev.teste;

import br.com.igordev.dao.ConnectionFactory;
import java.sql.Connection;
import java.sql.SQLException;

public class TesteConexao {

    public static void main(String[] args) throws SQLException {
        Connection con = ConnectionFactory.getConnection();
        con.close();
    }
    
}
