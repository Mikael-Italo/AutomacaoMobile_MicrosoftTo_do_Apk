package stepDefinitions;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.LoginPage;
import static utils.Utils.*;

public class LoginSteps {
	LoginPage lp = new LoginPage(driver);
	
	@Quando("o usuário informar o email como {string}")
	public void o_usuário_informar_o_email_como(String string) throws Exception{
	    Thread.sleep(1500);
		lp.inserirEmail(string);
	}

	@Quando("clicar no botão entrar")
	public void clicar_no_botão_entrar() throws Exception{
		Thread.sleep(1500);
		lp.clicarBtnEntrar();
	}

	@Quando("inserir a senha como {string}")
	public void inserir_a_senha_como(String string) throws Exception {
		Thread.sleep(7000);
		lp.inserirSenha(string);
	}

	@Entao("deve-se exibir a tela principal do sistema com o usuário informado logado")
	public void deve_se_exibir_a_tela_principal_do_sistema_com_o_usuário_informado_logado() throws Exception {
		Thread.sleep(1500);
		lp.validaLogin();
	}

}
