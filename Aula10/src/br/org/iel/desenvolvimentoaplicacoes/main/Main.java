package br.org.iel.desenvolvimentoaplicacoes.main;

import java.sql.Connection;
import java.sql.SQLException;

import br.org.iel.desenvolvimentoaplicacoes.analise.Analise;
import br.org.iel.desenvolvimentoaplicacoes.checagem.Checagem;
import br.org.iel.desenvolvimentoaplicacoes.jdbc.FabricaConexoes;
import br.org.iel.desenvolvimentoaplicacoes.otimizacao.Otimizacao;

public class Main {
	
	//atributo responsável pela conexao
	private static Connection connection;

	//método principal
	public static void main(String[] args) {
		//pega uma conexao com o banco pela classe fabricaconexoes
        connection = new FabricaConexoes().getConnection();
        System.out.println("Conexão aberta!");
        
        //faz a otimizacao
        new Otimizacao().efetuaOtimizacao();
        
        //faz a checagem
        new Checagem().efetuaChecagem();
        
        //faz a análise e se necessário a reparacao em seguida
        new Analise().efetuaAnalise();
        
        try {
        	//fecha a conexao
			connection.close();
			System.out.println("Conexao fechada com sucesso!");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
