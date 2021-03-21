package br.com.testeSelenium.steps;

import br.com.testeSelenium.Util;
import br.com.testeSelenium.Page.mapeamentoPage;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Quando;

public class mapeamentoSteps extends Util {
	
	mapeamentoPage mp = new mapeamentoPage();

	@Dado("^que eu esteja na plataforma  \"([^\"]*)\"$")
	public void queEuEstejaNaPlataforma(String url) throws Throwable {
		Util util = new Util();
		util.setup(url);
	}

	@Quando("^realizo um clique em entrar$")
	public void realizoUmCliqueEmEntrar() throws Throwable {
			mp.entrar();
	}


	@E("^Preencho o cpf \"([^\"]*)\" e clico em confirmar$")
	public void preenchoOCpfEClicoEmConfirmar(String cpf) throws Throwable {
		mp.preencherCpf(cpf);
		mp.confirmarCpf();
		
	}


	@E("^Preencho a senha \"([^\"]*)\" e clico em confirmar$")
	public void preenchoASenhaEClicoEmConfirmar(String senha) throws Throwable {
		mp.PrencherPassword(senha);
		mp.confirmarSenha();
	}


	

}
