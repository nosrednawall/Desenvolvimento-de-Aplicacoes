package br.org.iel.desenvolvimentoaplicacoes.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FabricaConexoes {

    public Connection getConnection() {
        try {
            return DriverManager.getConnection(
                    "jdbc:mysql://localhost/aula10", "anderson", "123");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
