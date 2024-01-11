#language: pt
#enconding: UTF-8
@Lista

Funcionalidade: Criando, editando, excluindo lista e itens

@CriandoLista
Cenario: criando uma lista 
Dado que o usuário esteja na tela principal
E clicar no botão nova lista
E inserir o titulo da lista como "Lista telefonica"
E selecione uma cor para a lista
E clique no botão criar lista
Entao deve-se exibir a lista criada com sucesso

@EditandoLista
Cenario: editando uma lista criada
Dado que o usuário esteja na tela principal
E clicar em uma lista criada
E clicar no menu opções no canto superior direito
E clicar em renomear lista
E alterar o nome da lista para "Compras"
E alterar a cor da lista 
E clicar em salvar
Entao deve-se exibir a lista com as alterações realizadas

@AdicionandoItensNaLista
Cenario: adicionando itens na lista 
Dado que o usuário esteja na tela principal
E clicar em uma lista criada
E clicar no botão de adicionar itens no canto inferior direito
E inserir o titulo do item como "Arroz"
E clicar no botão inserir
E inserir outro item com o titulo "Feijao"
E clicar no botão inserir novamente
Entao deve-se exibir a lista com os itens adicionados

@ExcluindoItemNaLista
Cenario: excluindo item na lista
Dado que o usuário esteja na tela principal
E clicar em uma lista criada
E clicar em um item da lista
E clicar no botão da lixeira para excluir o item
E confirmar a exclusão do item
Entao deve-se exibir a lista sem o item excluido

@ExcluindoLista
Cenario: excluindo uma lista
Dado que o usuário esteja na tela principal
E clicar em uma lista criada
E clicar no menu opções no canto superior direito
E clicar em excluir lista
E confirmar a exclusão da lista
Entao deve-se exibir a tela principal sem a lista
