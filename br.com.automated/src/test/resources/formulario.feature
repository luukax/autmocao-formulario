#Author: your.email@your.domain.com

@formulario
Feature: Title of your feature
  I want to use this template for my feature file

  
  Scenario: Title of your scenario
    Given que eu esteja no "http://sampleapp.tricentis.com/101/app.php"
     And seleciono a primeira opcao no campo MAKE: Audi
    And seleciono a primeira opcao no campo Model: Scooter
    And preencho o campo informando a cilindrada: "String"
    And preencho o campo informando o desempenho do motor: "String"
    And preencho o campo informando a data de fabricacao: "String"
    And preencho o campo informando o numero de assentos: "1"
    And seleciono a opcao de RIGHT HAND DRIVER: Yes
    And seleciono o numero de assentos: 1
    And seleciono o tipo de combustivel: Gas
    And preencho o campo informando peso: "500"
    And preencho o campo informando peso total: "650"
    And preencho o campo informando tabela de preco: "5000"
    And preencho o campo informando a placa: "bra-2022"
    And preencho o campo informando o km anual: "20000"
    And clico em next
    And valido redirecionamento para: "Enter Insurant Data"
    And preencho o campo informando primeiro nome: "String"
    And preencho o campo informando sobrenome: "String"
    And preencho o campo informando a data de nascimento: "String"
    And preencho o campo informando o genero: 
    And preencho o campo informando a Rua: "String"
    And preencho o campo informando o pais: Brasil
    And preencho o campo informando o codigo postal: "String"
    And preencho o campo informando a cidade: "String"
    And preencho o campo informando o tipo de ocupacao: Employee
    And preencho o campo informando o hobbie: Speeging
    And preencho o campo informando o site: "String"
    And carrego a imagem do veiculo
    And clico em next Enter Product Data
    And valido redirecionamento: "Enter Product Data"
    And preencho a data de inicio: 
    And seleciono a soma do seguro
    And seleciono a avaliacao de merito
    And seleciono a opcao de seguro de danos
    And seleciono o tipo de protudo: Euro Protection
    And seleciono a apcao de carro cortesia: yes
    And clico em next para ir Select Price Option
    And valido a title Select Price Option: "Select Price Option"
    And seleciono a opcao: Gold
    And clico em: Next Send Quote
    And valido redirecionamento para (title:) "Send Quote"
    And preencho o campo informando o email: "String"
    And preencho o campo informando o telefone: "String"
    And preencho o campo informando o nome de usuario: "String"
    And preencho o campo informando a senha: "String"
    And preencho o campo informando a confimacao de senha: "String"
    And adiciono um comentario: "Realizando um teste automatizado"
    When clico em: Send 
    Then valido a mensagem: "Sending e-mail success!"
   