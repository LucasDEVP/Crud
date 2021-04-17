package br.com.agenda.dao;

import java.sql.Connection;

import java.sql.PreparedStatement;

import br.com.agenda.Factory.ConnectionFactory;
import br.com.agenda.model.Contato;

public class ContatoDAO {
	/*
	 * CRUD c: CREATE r: READ u: UPDATE d: DELETE
	 */
	// REGRA DE NEGÓCIO AQUI

	public void save(Contato contato) {
		
		String sql = "INSERT INTO contatos(nome, email, telefone, dataNascimento, endereco) VALUES (?,?,?,?,? )";
		
		Connection conn = null;
		PreparedStatement pstm = null;
		
		try {
			//Criar uma conexão com o banco de dados
			conn = ConnectionFactory.createConnectionToMySQL();
			
			//Criamos uma PerparedStatement para executar uma query
			pstm = conn.prepareStatement(sql);
			//Adicionar os valores que são esperados pela query
			pstm.setString(1, contato.getNome());
			pstm.setString(2, contato.getEmail());
			pstm.setInt(3, contato.getTelefone());
			pstm.setInt(4, contato.getDataNascimento());
			pstm.setString(5, contato.getEndereco());
			
			
			//Executar a query
			pstm.execute();
			
			System.out.println("Contato Salvo com sucesso!");
		}catch(Exception e) {
		e.printStackTrace();
	}finally {
		//fechar as conxões
		try {
			if(pstm!=null) {
				pstm.close();
			}
		if(conn!=null) {
			conn.close();
		}
		
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	}

}
