# Desafio QA

## Objetivo do Desafio
A proposta deste Desafio é analisar as suas habilidades em conceber cenários de testes, programação e boas práticas necessárias para automatização dos testes.
Vamos considerar e avaliar todas etapas, então faça com calma e não tenha medo de errar ! Caso tenha dúvidas referentes ao Desafio, sinta-se a vontade para entrar em contato com nosso time de QA's.
Você terá liberdade para escolher a linguagem de programação e ferramentas utilizadas na automatização dos testes.
Atenção para as **Dicas** de cada etapa, não são obrigatórias mas podem somar mais pontos no desafio.
A terceira parte do Desafio não é obrigatória mas também soma mais pontos no desafio.



## O Desafio

### 1. Escolher a plataforma & escrita de cenários

Nós da Serasa estamos nos mais diversos canais digitais.
Nesta primeira parte do desafio, você deverá:
* escolher a plataforma de sua preferência, seja ela **Web(https://www.serasa.com.br/), Android/iOS**.
* escrever ao menos 5 cenários de teste em **BDD**.
* explicar e detalhar o porquê escolheu esses cenários. 


Criei os cenarios na plataforma web, por nao ter um apk para teste, mas o desenvolvimento em WEB, ou mobile e muito parecido a difereciação da somente no modo de designer em mobile utilizamos o apium com android estudio.  


### 2. Automação de testes de interface de usuário

Nesta etapa, você precisa criar uma suite de testes automatizada para pelo menos 3 dos cenários que foram escritos na primeira parte deste desafio, em suas respectivas plataformas.
* explicar e detalhar as decisões que você tomou (exemplo: o porquê escolheu determinada linguagem de programação, framework etc). 
* Em seu README, detalhar como realizar as configurações necessárias para rodar o projeto em nossa máquina local.

Para a automação de teste de interface utilizei o selenium webDrive com java, por ser um poder uma tecnologia software livre e ter bastante informação na comunidade, e também bastante utilizada por grandes empresas por não necessitar de adquirir licenças, e esta ferramenta e pode ser adaptada conforme a necessidade de cada empresa. 
Por ser uma seleção para automação mobile, e não ter um “apk” disponível para realizar o teste no ambiente de produção escolhi a solução web. Utilizando o sistema de produção com meus dados pessoais para mapear as telas.
Para a criação dos cenários de teste, criei os cenários com as soluções grátis da empresa disponnivel, conforme o meu perfil de utilização. 
Para rodar o teste implementei a variável da feature, e no código está como variável caso necessite utilizar um datapoll somente implementar e incluir na variável. Utilizei do chrome driver 89. Para o desenvolvimento do teste. 
Favor baixar o crome driver em https://chromedriver.chromium.org/downloads, conforme o seu chrome instalado em computador. 
E Criar uma pasta WEBDRIVE.BIN em seu computador se for Windows em c: ou no /opt caso seja Linux. 

OBS: Consegui implementar somente dois cenários automatizados e criei a runner suíte com esses dois cenarios, pois fui barrado na segurança logica da empresa. E não consegui para utilizar aplicação de forma automatizada. 


Dica: **Fazer testes automatizados em plataformas diferentes (Web, Android ou iOS) renderá mais pontos para sua nota**


### 3. Testes de API **(Extra)**

Esta última etapa do Desafio não é obrigatória, mas rende pontos extras.
Você deve criar uma suite de testes (automatizada ou não) com a API de filmes: https://www.themoviedb.org/
* Tente focar em cenários críticos, focando em testes de contrato.
* explicar e detalhar as decisões que você tomou (exemplo: o porquê escolheu determinada linguagem de programação, framework etc). 
* Em seu README, detalhar como realizar as configurações necessárias para rodar o projeto em nossa máquina local.

Dica: **Fazer testes automatizados renderá mais pontos para sua nota**


### 4. Processo de Submissão e Prazo de entrega

Para o processo de submissão, você deverá seguir os passos abaixo:
1. Você deverá fazer um fork deste repositório (não clonar!)
2. Desenvolva todo seu projeto neste fork
3. Todos commits e alterações deverá ser feita em seu fork
4. Quando tiver tudo pronto, envie um Pull Request para este repositório.

**Você tem 5 dias para concluir e enviar o Desafio.**


### 5. Considerações Finais

Para realiazação dos testes, você pode escolher a linguagem de programação, framework, etc. que você se sentir mais confortável.
Não se esqueça de prover informações detalhadas de como instalar e rodar as suítes de teste.
Vamos considerar e avaliar todas etapas, não tenha medo de errar !
Caso tenha alguma dúvida com o desafio, pode procurar nossos QA's através do email:

ecs_tribo_qa@br.experian.com
