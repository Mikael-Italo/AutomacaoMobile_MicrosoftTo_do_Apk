package pageObjects;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LoginPage extends BasePage{
	
	//Metodos
	
	public LoginPage(AppiumDriver<?> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this); 
	}
	
	public void inserirEmail(String string) {
		campoEmail.sendKeys(string);
	}
	
	public void inserirSenha(String string) {
		campoSenha.sendKeys(string);
	}
	
	public void clicarBtnEntrar() {
		btnEntrar.click();
	}

	//Validações
	
	public void validaLogin() {
		assertEquals("mikaeltestes@hotmail.com", validaLoginSucesso.getText());
	}

}
