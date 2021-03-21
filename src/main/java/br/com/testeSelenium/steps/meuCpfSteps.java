package br.com.testeSelenium.steps;

import br.com.testeSelenium.Util;
import br.com.testeSelenium.Page.meuCpfPage;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class meuCpfSteps extends Util {
	
	meuCpfPage mcp = new meuCpfPage();


	@Quando("^realizo um clique meu CPF$")
	public void realizoUmCliqueMeuCPF() throws Throwable {
		
		mcp.abaMeuCPF();	
	}


	@Entao("^recebo a tela de Monitoramento$")
	public void receboATelaDeMonitoramento() throws Throwable {
		
		String telamonitoramento = mcp.telaMonitoramento();
		System.out.println(telamonitoramento);
		finalizar();
	}
	
	

}
