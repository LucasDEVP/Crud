package br.com.agenda.aplicacao;

import br.com.agenda.model.Contato;
import br.com.agenda.dao.ContatoDAO;

public class Main {

	public static void main(String[] args) {
		
		ContatoDAO contatoDao =  new ContatoDAO();
		
		Contato contato = new Contato();
		contato.setNome("Lucas");
		contato.setEmail("lucas@accenture.com");
		contato.setTelefone(984576287);
		contato.setDataNascimento(12/04/1996);
		contato.setEndereco("Rua Accenture 363");
		
		contatoDao.save(contato);
		
		
	}

}
