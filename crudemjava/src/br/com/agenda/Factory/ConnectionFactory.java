package br.com.agenda.Factory;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {

	// Nome do usuário do MYSQL
	private static final String USERNAME = "root";

	// Senha do Banco
	private static final String PASSWORD = "12345";

	// Caminho do Banco de dados, porta, nome do banco de dados
	private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/agenda";

	/*
	 * Conexão com o banco de dados
	 */
	public static Connection createConnectionToMySQL() throws Exception {
		// Faz com que a classe seja carregada pela JVM
		Class.forName("com.mysql.cj.jdbc.Driver");

		// Cria a conexão com Banco de dados
		Connection connection = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);

		return connection;
	}

	public static void main(String[] args) throws Exception {
		// Recuperar uma conexão com Banco de dados
		Connection con = createConnectionToMySQL();

		// Testar se a conexão é nula ou não
		if (con != null) {
			System.out.println("Conexão obtida com sucesso!");
			con.close();
		}
	}

}
