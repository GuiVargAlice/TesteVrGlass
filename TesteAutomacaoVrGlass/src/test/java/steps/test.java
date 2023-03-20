package steps;

import io.cucumber.java.es.Dado;
import io.cucumber.java.it.Quando;
import io.cucumber.java.pt.Então;
import page.cadastroPage;

import static runner.executar.driver;

public class test {

    cadastroPage cadastro = new cadastroPage(driver);

    @Dado("que estou na página de cadastro")
    public void que_estou_na_página_de_cadastro() {
        cadastro.acessarAplicacao();
    }

    @Quando("preencho o formulário com um nome válido, um e-mail válido, uma senha válida e a confirmação da senha")
    public void preencho_o_formulário_com_um_nome_válido_um_e_mail_válido_uma_senha_válida_e_a_confirmação_da_senha() throws InterruptedException {
        cadastro.cpPrimeiroNome();
        cadastro.cpSegundoNome();
        cadastro.cpEndereco();
        cadastro.cpEmailValido();
        cadastro.cpTelefone();
        cadastro.cpGenero();
        cadastro.cpHobbies();
        cadastro.cpHabilidades();
        cadastro.cpAno();
        cadastro.cpMes();
        cadastro.cpDia();
        cadastro.cpSenha();
        cadastro.cpConfirmaSenha();
    }

    @Quando("clico no botão Submit")
    public void clicoNoBotãoSubmit() {
        //cadastro.botaoSubmit();
    }

    @Então("vejo uma mensagem de sucesso indicando que meu cadastro foi realizado")
    public void vejo_uma_mensagem_de_sucesso_indicando_que_meu_cadastro_foi_realizado() {
    }
}