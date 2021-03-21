package br.com.testeSelenium.steps;

import br.com.testeSelenium.Util;
import br.com.testeSelenium.Page.paginaInicioPage;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class PaginaInicioSteps extends Util {
	
    paginaInicioPage pig = new paginaInicioPage();
    

	@Quando("^realizo um clique na aba Ver mais na pagina principal$")
	public void realizoUmCliqueNaAbaVerMaisNaPaginaPrincipal() throws Throwable {
		pig.clickAbaVerMais();
	}

	@E("^realizo um clique na aba ver extrato$")
	public void realizoUmCliqueNaAbaVerExtrato() throws Throwable {
		pig.verExtrato();
	}

	@Entao("^recebo a tela de extrato disponivel$")
	public void receboATelaDeExtratoDisponivel() throws Throwable {
		String extrato = pig.extratoDisponivel();
		System.out.println(extrato);
		finalizar();
		
		
	}


	

}
