#language:pt
#encoding:UTF-8
Funcionalidade: Realizar Teste no Serasa

  Contexto: Categoria de serviço
    Dado que eu esteja na plataforma  "http://www.serasa.com.br"
    Quando realizo um clique em entrar
    E Preencho o cpf "xxxxxxxxxxx" e clico em confirmar
    E Preencho a senha "xxxxxx" e clico em confirmar

  @ConsultarExtratoCarteiraDigital
  Cenario: ConsultarExtratoCarteiraDigital
    Quando realizo um clique na aba Ver mais na pagina principal
    E realizo um clique na aba ver extrato
    Entao recebo a tela de extrato disponivel

  @ConsultarInformacaoDoCPF
  Cenario: ConsultarInformcoesCPF
  	Quando realizo um clique meu CPF
  	Entao recebo a tela de Monitoramento
  	
	@ConsultarDividasNegativadas
	Cenario: ConsultarDividasNegativadas
		Quando realizo um clique meu CPF
		E realizo um clique em dividas negativadas
		Entao recebo o relatorio de dividas Negativadas
		
	@ConsultarProtestos
	Cenario: ConsultarProtestos
		Quando realizo um clique meu CPF
		E realizo um clique em protestos
		Entao recebo o relatorio referente a protestos no cpf	
  	
  @ConsultarChequesSemFundo
	Cenario: ConsultarChequesSemFundo
		Quando realizo um clique meu CPF
		E realizo um clique cheques sem fundo
		Entao recebo o relatorio referente a cheques sem fundos
		
	@Solucoes
	Cenario: acesso a tela de solucoes	
		Quando realizo o acesso na aba solucoes
		Entao recebo a tela de recomendacoes
		
	@SoluçõesInformacaoScore
	Cenario: acesso a tela de soluções 
		Quando realizo o acesso na aba solucoes
		E realizo um clique em consultar serasa Score
		Entao recebo informações de Score na aba Saude financeira
			
  	
  	
