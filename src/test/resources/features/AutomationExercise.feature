#language: pt

  @run
  Funcionalidade: Página Automation Exercise

    Contexto: Acessar aplicação
      Dado que acesso o site Automation Exercise

    Cenário: Registrar usuário com email já cadastrado
      Dado que clico no botão ' Signup / Login' na página Automation Exercise
      Quando preencho o campo 'name' com 'test'
      E preencho o campo 'email' com 'test@test.com'
      E que clico no botão 'Signup' na página Automation Exercise
      Então a mensagem 'Email Address already exist!' é exibida