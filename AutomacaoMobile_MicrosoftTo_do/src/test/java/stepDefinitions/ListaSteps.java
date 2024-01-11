package stepDefinitions;

import static utils.Utils.driver;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import pageObjects.ListaPage;

public class ListaSteps {

	ListaPage lp = new ListaPage(driver);

//Criando uma lista

	@Dado("que o usuário esteja na tela principal")
	public void que_o_usuário_esteja_na_tela_principal() throws Exception {
		Thread.sleep(2000);
		lp.validaTelaInicial();
	}

	@Dado("clicar no botão nova lista")
	public void clicar_no_botão_nova_lista() throws Exception {
		Thread.sleep(1000);
		lp.clicarNovaLista();
	}

	@Dado("inserir o titulo da lista como {string}")
	public void inserir_o_titulo_da_lista_como(String string) throws Exception {
		Thread.sleep(1000);
		lp.inserirTituloLista(string);
	}

	@Dado("selecione uma cor para a lista")
	public void selecione_uma_cor_para_a_lista() throws Exception {
		Thread.sleep(1000);
		lp.selecionaCor();
	}

	@Dado("clique no botão criar lista")
	public void clique_no_botão_criar_lista() throws Exception {
		Thread.sleep(1000);
		lp.clicarCriarLista();
	}

	@Entao("deve-se exibir a lista criada com sucesso")
	public void deve_se_exibir_a_lista_criada_com_sucesso() throws Exception {
		Thread.sleep(1000);
		lp.validaTituloListaTelefonica();
	}

//Editando uma lista

	@Dado("clicar em uma lista criada")
	public void clicar_em_uma_lista_criada() throws Exception {
		Thread.sleep(1000);
		lp.clicarListaContasInicial();
	}

	@Dado("clicar no menu opções no canto superior direito")
	public void clicar_no_menu_opções_no_canto_superior_direito() throws Exception {
		Thread.sleep(1000);
		lp.clicarMenuOpcoes();
	}

	@Dado("clicar em renomear lista")
	public void clicar_em_renomear_lista() throws Exception {
		Thread.sleep(1000);
		lp.clicarRenomearLista();
	}

	@Dado("alterar o nome da lista para {string}")
	public void alterar_o_nome_da_lista_para(String string) throws Exception {
		Thread.sleep(1000);
		lp.inserirTituloLista(string);
	}

	@Dado("alterar a cor da lista")
	public void alterar_a_cor_da_lista() throws Exception {
		Thread.sleep(1000);
		lp.mudarCorLista();
	}

	@Dado("clicar em salvar")
	public void clicar_em_salvar() throws Exception {
		Thread.sleep(1000);
		lp.clicarSalvarAlteracoes();
	}

	@Entao("deve-se exibir a lista com as alterações realizadas")
	public void deve_se_exibir_a_lista_com_as_alterações_realizadas() throws Exception {
		Thread.sleep(1000);
		lp.validaTituloListaCompras();
	}

//Adicionando itens na lista

	@Dado("clicar no botão de adicionar itens no canto inferior direito")
	public void clicar_no_botão_de_adicionar_itens_no_canto_inferior_direito() throws Exception {
		Thread.sleep(1000);
		lp.clicarBtnAddItens();
	}

	@Dado("inserir o titulo do item como {string}")
	public void inserir_o_titulo_do_item_como(String string) throws Exception {
		Thread.sleep(1000);
		lp.inserirNomeItem(string);
	}

	@Dado("clicar no botão inserir")
	public void clicar_no_botão_inserir() throws Exception {
		Thread.sleep(1000);
		lp.salvarNomeItem();
	}

	@Dado("inserir outro item com o titulo {string}")
	public void inserir_outro_item_com_o_titulo(String string) throws Exception {
		Thread.sleep(1000);
		lp.inserirNomeItem(string);
	}

	@Dado("clicar no botão inserir novamente")
	public void clicar_no_botão_inserir_novamente() throws Exception {
		Thread.sleep(1000);
		lp.salvarNomeItem();
	}

	@Entao("deve-se exibir a lista com os itens adicionados")
	public void deve_se_exibir_a_lista_com_os_itens_adicionados() throws Exception {
		Thread.sleep(1000);
		lp.validaAddItens();
	}

//Excluindo item da lista

	@Dado("clicar em um item da lista")
	public void clicar_em_um_item_da_lista() throws Exception {
		Thread.sleep(1000);
		lp.selecionandoItemParaExcluir();
	}

	@Dado("clicar no botão da lixeira para excluir o item")
	public void clicar_no_botão_da_lixeira_para_excluir_o_item() throws Exception {
		Thread.sleep(2000);
		lp.clicarbtnLixeira();
	}

	@Dado("confirmar a exclusão do item")
	public void confirmar_a_exclusão_do_item() throws Exception {
		Thread.sleep(1000);
		lp.confirmarExclusaoItem();
	}

	@Entao("deve-se exibir a lista sem o item excluido")
	public void deve_se_exibir_a_lista_sem_o_item_excluido() throws Exception {
		Thread.sleep(1000);
		lp.validaExclusaoItem();
	}

//Excluindo lista

	@Dado("clicar em excluir lista")
	public void clicar_em_excluir_lista() throws Exception {
		Thread.sleep(1000);
		lp.clicarExcluirLista();
	}

	@Dado("confirmar a exclusão da lista")
	public void confirmar_a_exclusão_da_lista() throws Exception {
		Thread.sleep(1000);
		lp.confirmarExcluirLista();
	}

	@Entao("deve-se exibir a tela principal sem a lista")
	public void deve_se_exibir_a_tela_principal_sem_a_lista_excluida() throws Exception {
		Thread.sleep(1000);
		lp.validaListaExcluida();
	}
}
