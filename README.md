O que é automação de testes?
Resposta: Automação de teste é uma tecnica de qualidade de software para melhor o fluxo de regressivo,
diminuindo o esfoço manual em cenarios repetitivos , quando há uma automação cobre uma quantitade expressiva da aplicação
isso faz com  que tenha uma melhor segurança na estabilidade da aplicação , dando uma segurança mais para um deploy em produção
melhorando o time to market da aplicação 

================================================================================================================================

Quais os benefícios de automação de testes?
Resposta: Melhorar os processos onde há cenarios repetivios , quando há automação bem estruturada em um projeto ganha-se um padrao 
de qualidade , levando o projeto ao seu sucesso.

================================================================================================================================

Quais as melhores práticas para escrever testes automatizados?
Resposta: em primeiro lugar sempre ter um bom planejamento, com planejamento é possivel traçar metas a longo e curto prazo,
em segundo sempre é ideal documentar uma boa pratica e utilizar a tecnica de escrita BDD pensando que qualquer pessoa que ver
mesmo que não conheça de codigo com essa escrita ela poderá entender oque esta sendo testado.
Escolher o framework e linguagem , sempre é bom que haja uma linguagem de programaçao da mesma do que esta sendo desenvolvida no projeto , 
pois se o automatizador sai do projeto terá alguem para dar suporte , pois a linguagem será a mesma do desenvolvimento , utilizar um framework
estavel e de boa documentação , para que haja uma curva de aprendizado mais rapida para outro automatizador que não conheça do framework.
  Ter uma ferramenta de integração continua como jenkins , para que possa rodar os testes e ter um ralatorio de como esta a aplicacão dos cenarios
ali comtemplados pela automoção.

================================================================================================================================

Quais os tipos de ferramentas de automação de testes? Cite uma que você tem
mais experiência e diga por que escolheu essa ferramenta?
Resposta : Selenium , cypress, robot framework, RestAssured, Appium ,capybara ,httparty, restsharp ,
Tenho mais dominio em Selenium e RestAssured, escolho ela por ter mais tempo de experiencia por ser um framework mais antigo e estavel 

================================================================================================================================

Como você garante que seus testes automatizados sejam executados com
eficiência? Cite exemplos.
Resposta: Quando há uma estrategia como contemplar os cenarios mais criticos da aplicação que tenham um fluxo mais end to end da aplicação,
Rodando em uma esteira de qualidade ci/cd com um relatorio de execução seja ele cucumber reports ou alure reports , com isso há uma garantia 
e segurança na execução dos cenarios automatizados, com fluxos back e front end , validando todas as camadas da piramede de testes. 

================================================================================================================================

Descreva como você pode garantir que seu teste automatizado está
funcionando corretamente e como você lidaria com falhas e erros nos testes.

Resposta: o primeiro ponto é que o relatorio de execução esteje dando resultado aprovado, caso seje encontrado algum erro em algum dos steps,
é analisado se não é um bug da propria aplicação(Automação de testes) caso não é , e feito teste manualmente do cenario que ocorreu o erro e pós o teste manualmente ,
é acionado o time de desenvolvimento para analisar o cenario e corrigir o erro e retesta-lo isoladamente e pós testado em conjunto novamente para garantir que a correção
não quebrou os outros cenarios

