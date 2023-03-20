# language: pt

@CadastroComSucesso

Funcionalidade: Cadastro de usuário


  Cenário: Cadastro com sucesso
    Dado que estou na página de cadastro
    Quando preencho o formulário com um nome válido, um e-mail válido, uma senha válida e a confirmação da senha
    E clico no botão Submit
    Então vejo uma mensagem de sucesso indicando que meu cadastro foi realizado