package pageObjects;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import static utils.Utils.driver;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ListaPage extends BasePage{
	
	public ListaPage(AppiumDriver<?> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this); 
	}

	//Criar lista
	public void clicarNovaLista() {
		btnNovaLista.click();
	}
	
	public void inserirTituloLista(String string) {
		campoTituloLista.click();
		campoTituloLista.clear();
		campoTituloLista.sendKeys(string);
	}
	
	public void selecionaCor() {
		btnSelecionaCor.click();
	}
	
	public void clicarCriarLista() {
		btnCriarLista.click();
	}
	
	//Editar lista
	public void clicarListaContasInicial() {
		listaCriadaInicial.click();
	}
	
	public void clicarMenuOpcoes() {
		menuOpcoes.click();
	}
	
	public void clicarRenomearLista() {
		renomearLista.click();
	}
	
	public void mudarCorLista() {
		selecionaNovaCor.click();
	}
	
	public void clicarSalvarAlteracoes() {
		btnSalvarAlteracoes.click();
	}
	
	//Adicionando itens
	public void clicarBtnAddItens() {
		btnAddItens.click();
	}
	
	public void inserirNomeItem(String string) {
		campoNomeItem.sendKeys(string);
	}
	
	public void salvarNomeItem() {
		btnSalvarNomeItem.click();
	}
	
//Excluindo item
	private static String itemAntesExclusao = null;
	
	public void selecionandoItemParaExcluir() {
		itemAntesExclusao = validaFeijaoAntesExcluir.getAttribute("content-desc"); //Item 1 de 2, Tarefa Feijao
		
		validaArroz.click();	
	}
	
	public void clicarbtnLixeira() {
		btnLixeira.click();
	}
	
	public void confirmarExclusaoItem() {
		btnExcluirItem.click();
	}
	
	//Excluindo lista
	public void clicarExcluirLista() {
		btnExcluirLista.click();
	}
	
	public void confirmarExcluirLista() {
		btnConfirmaExcluirLista.click();
	}
	
	//Asserts
	private static String isDisplayedListaCompras;
	
	public void validaTelaInicial() {
		assertTrue(btnNovaLista.isDisplayed());
	}
	
	public void validaTituloListaTelefonica() {
		assertEquals("Lista telefonica", tituloLista.getAttribute("content-desc"));
	}
	
	public void validaTituloListaCompras() {
		assertEquals("Compras", tituloLista.getAttribute("content-desc"));
		isDisplayedListaCompras = listaCriadaInicial.getAttribute("displayed");
	}
	
	public void validaAddItens() {
		driver.hideKeyboard();
		assertTrue(validaArroz.isDisplayed());
		assertTrue(validaFeijao.isDisplayed());
	}
	
	public void validaExclusaoItem() {
		System.out.println(validaFeijaoDepoisExcluir.getAttribute("content-desc"));
		assertNotEquals("Item(Feijao) mudou de posição na lista", itemAntesExclusao, validaFeijaoDepoisExcluir.getAttribute("content-desc"));
	}
	
	public void validaListaExcluida() {
		assertNotEquals("false",isDisplayedListaCompras);
		
	}
}
