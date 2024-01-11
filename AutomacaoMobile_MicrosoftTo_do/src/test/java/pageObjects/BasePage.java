package pageObjects;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class BasePage {

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Nova lista']")
	protected MobileElement btnNovaLista;
	
	@AndroidFindBy(xpath = "//android.widget.EditText[@index='1']")
	protected MobileElement campoTituloLista;
	
	@AndroidFindBy(xpath = "//android.widget.FrameLayout[@index='2']")
	protected MobileElement btnSelecionaCor;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@text='CRIAR LISTA']")
	protected MobileElement btnCriarLista;
	
	@AndroidFindBy(xpath = "(//android.widget.FrameLayout[@index='0'])[last()]")
	protected MobileElement tituloLista;
	
	@AndroidFindBy(xpath = "(//android.view.View[@index='0'])[last()]")
	protected MobileElement listaCriadaInicial;
	
	@AndroidFindBy(accessibility = "Mais opções")
	protected MobileElement menuOpcoes;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Renomear lista']")
	protected MobileElement renomearLista;
	
	@AndroidFindBy(xpath = "//android.widget.FrameLayout[@index='5']")
	protected MobileElement selecionaNovaCor;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@text='SALVAR']")
	protected MobileElement btnSalvarAlteracoes;
	
	@AndroidFindBy(xpath = "//android.widget.ImageButton[@index='4']")
	protected MobileElement btnAddItens;
	
	@AndroidFindBy(xpath = "//android.widget.EditText[@text='Adicionar uma tarefa']")
	protected MobileElement campoNomeItem;
	
	@AndroidFindBy(xpath = "//android.widget.ImageView[@index='2']")
	protected MobileElement btnSalvarNomeItem;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Arroz']")
	protected MobileElement validaArroz;
	
	@AndroidFindBy(xpath = "(//android.view.ViewGroup[@index='0'])[5]")
	protected MobileElement validaFeijaoAntesExcluir;
	
	@AndroidFindBy(xpath = "(//android.view.ViewGroup[@index='0'])[5]")
	protected MobileElement validaFeijaoDepoisExcluir;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Feijao']")
	protected MobileElement validaFeijao;
	
	@AndroidFindBy(xpath = "//android.widget.ImageView[@index='2']")
	protected MobileElement btnLixeira;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@text='EXCLUIR']")
	protected MobileElement btnExcluirItem;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Excluir lista']")
	protected MobileElement btnExcluirLista;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@text='EXCLUIR']")
	protected MobileElement btnConfirmaExcluirLista;
	
	//Login
	
	@AndroidFindBy(xpath = "//android.widget.EditText[@index='0']")
	protected MobileElement campoEmail;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@text='Entrar']")
	protected MobileElement btnEntrar;
	
	@AndroidFindBy(xpath = "//android.widget.EditText[@index='0']")
	protected MobileElement campoSenha;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='mikaeltestes@hotmail.com']")
	protected MobileElement validaLoginSucesso;
	
}
