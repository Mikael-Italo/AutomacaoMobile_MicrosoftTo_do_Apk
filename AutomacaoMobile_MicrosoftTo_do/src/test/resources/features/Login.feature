#language: pt
#enconding: UTF-8
@Login
Funcionalidade: Login

  @LoginComSucesso
  Cenario: Realizar login com sucesso
  Quando o usuário informar o email como "mikaeltestes@hotmail.com"
  E clicar no botão entrar
  E inserir a senha como "123@Teste"
  E clicar no botão entrar
  Entao deve-se exibir a tela principal do sistema com o usuário informado logado
