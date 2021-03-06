package steps;


import elementos.ElementosWeb;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import metodo.MetodosWeb;
import util.FakerJava;
import util.RandomUtil;

public class StepsFeatureFomulario {
	MetodosWeb metodo = new MetodosWeb();
	ElementosWeb elem = new ElementosWeb();
	FakerJava faker = new FakerJava();

@Given("que eu esteja no {string}")
public void que_eu_esteja_no(String string) {
   metodo.abrirBrowser(string);    
}


@Given("seleciono a primeira opcao no campo MAKE: Audi")
public void seleciono_a_primeira_opcao_no_campo_make_audi() {
	metodo.click(elem.getMarca());
}

@Given("seleciono a primeira opcao no campo Model: Scooter")
public void seleciono_a_primeira_opcao_no_campo_model_scooter() {
	metodo.click(elem.getModelo());
}

@Given("preencho o campo informando a cilindrada: {string}")
public void preencho_o_campo_informando_a_cilindrada(String string) {
    metodo.escrever(elem.getCilindrada(), ""+RandomUtil.number3()+"");
}

@Given("preencho o campo informando o desempenho do motor: {string}")
public void preencho_o_campo_informando_o_desempenho_do_motor(String string) {
    metodo.escrever(elem.getPerformace(), ""+RandomUtil.number4()+"");
}

@Given("preencho o campo informando a data de fabricacao: {string}")
public void preencho_o_campo_informando_a_data_de_fabricacao(String string) {
    metodo.escrever(elem.getDataFabricacao(), RandomUtil.fabricacao());
}

@Given("preencho o campo informando o numero de assentos: {string}")
public void preencho_o_campo_informando_o_numero_de_assentos(String string) {
    metodo.click(elem.getNumeroAssentos());
}

@Given("seleciono a opcao de RIGHT HAND DRIVER: Yes")
public void seleciono_a_opcao_de_right_hand_driver_yes() {
    metodo.click(elem.getMaoMotorista());
}

@Given("seleciono o numero de assentos: {int}")
public void seleciono_o_numero_de_assentos(Integer int1) {
    metodo.click(elem.getNumberSeats());
}

@Given("seleciono o tipo de combustivel: Gas")
public void seleciono_o_tipo_de_combustivel_gas() {
    metodo.click(elem.getTipoCombustivel());
}

@Given("preencho o campo informando peso: {string}")
public void preencho_o_campo_informando_peso(String string) {
    metodo.escrever(elem.getPeso(), ""+RandomUtil.numberRandomicoInt(800, 1000)+"");
}

@Given("preencho o campo informando peso total: {string}")
public void preencho_o_campo_informando_peso_total(String string) {
	metodo.escrever(elem.getPesoTotal(), ""+RandomUtil.number3()+"");
}

@Given("preencho o campo informando tabela de preco: {string}")
public void preencho_o_campo_informando_tabela_de_preco(String string) {
    metodo.escrever(elem.getTabelaPreco(), ""+RandomUtil.price()+"");
}

@Given("preencho o campo informando a placa: {string}")
public void preencho_o_campo_informando_a_placa(String string) {
   metodo.escrever(elem.getPlaca(), RandomUtil.placa());
}

@Given("preencho o campo informando o km anual: {string}")
public void preencho_o_campo_informando_o_km_anual(String string) {
    metodo.escrever(elem.getKmAnual(), ""+RandomUtil.numberRandomicoInt(10000, 20000)+"");
}

@Given("clico em next")
public void clico_em_next() {
    metodo.click(elem.getNext());
}

@Given("valido redirecionamento para: {string}")
public void valido_redirecionamento_para(String string) {
    
}

@Given("preencho o campo informando primeiro nome: {string}")
public void preencho_o_campo_informando_primeiro_nome(String string) {
	metodo.escrever(elem.getPrimeiroNome(), faker.firstName);
	
}

@Given("preencho o campo informando sobrenome: {string}")
public void preencho_o_campo_informando_sobrenome(String string) {
	metodo.escrever(elem.getSobreNome(), faker.lastName);
    
}

@Given("preencho o campo informando a data de nascimento: {string}")
public void preencho_o_campo_informando_a_data_de_nascimento(String string) {
	metodo.escrever(elem.getNascimento(), RandomUtil.birthDate());
    
}

@Given("preencho o campo informando o genero:")
public void preencho_o_campo_informando_o_genero() {
	metodo.click(elem.getGenero());
    
}

@Given("preencho o campo informando a Rua: {string}")
public void preencho_o_campo_informando_a_rua(String string) {
	metodo.escrever(elem.getRua(), faker.address);
}

@Given("preencho o campo informando o pais: Brasil")
public void preencho_o_campo_informando_o_pais_brasil() {
    metodo.click(elem.getPais());
}

@Given("preencho o campo informando o codigo postal: {string}")
public void preencho_o_campo_informando_o_codigo_postal(String string) {
    metodo.escrever(elem.getCep(), ""+RandomUtil.numberRandomicoInt(1111, 9999)+"");
}

@Given("preencho o campo informando a cidade: {string}")
public void preencho_o_campo_informando_a_cidade(String string) {
    metodo.escrever(elem.getCidade(), faker.city);
}

@Given("preencho o campo informando o tipo de ocupacao: Employee")
public void preencho_o_campo_informando_o_tipo_de_ocupacao_employee() {
    metodo.click(elem.getOcupacao());
}

@Given("preencho o campo informando o hobbie: Speeging")
public void preencho_o_campo_informando_o_hobbie_speeging() {
    metodo.click(elem.getHobbieVelociada());
}

@Given("preencho o campo informando o site: {string}")
public void preencho_o_campo_informando_o_site(String string) {
    metodo.escrever(elem.getSite(), "http://localhost.com");
}

@Given("carrego a imagem do veiculo")
public void carrego_a_imagem_do_veiculo() {
    metodo.escrever(elem.getImagem(), "./image/imageCar.jpg");
}

@Given("clico em next Enter Product Data")
public void clico_em_next_enter_product_data() {
    metodo.click(elem.getNextProdutc());
}

@Given("valido redirecionamento: {string}")
public void valido_redirecionamento(String string) {
    metodo.validarTitle("Enter Product Data");
}

@Given("preencho a data de inicio:")
public void preencho_a_data_de_inicio() {
    metodo.escrever(elem.getCalendario(), RandomUtil.startDate());
}

@Given("seleciono a soma do seguro")
public void seleciono_a_soma_do_seguro() {
    metodo.click(elem.getSomaDoSeguro());
}

@Given("seleciono a avaliacao de merito")
public void seleciono_a_avaliacao_de_merito() {
    metodo.click(elem.getClassificacao());
}

@Given("seleciono a opcao de seguro de danos")
public void seleciono_a_opcao_de_seguro_de_danos() {
    metodo.click(elem.getSeguroDanos());
}

@Given("seleciono o tipo de protudo: Euro Protection")
public void seleciono_o_tipo_de_protudo_euro_protection() {
    metodo.click(elem.getOpcaoProtudo());
}

@Given("seleciono a apcao de carro cortesia: yes")
public void seleciono_a_apcao_de_carro_cortesia_yes() {
    metodo.click(elem.getCarroCortesia());
}

@Given("clico em next para ir Select Price Option")
public void clico_em_next_para_ir_select_price_option() {
    metodo.click(elem.getNextPrice());
}

@Given("valido a title Select Price Option: {string}")
public void valido_a_title_select_price_option(String string) {
    metodo.validarTitle("Select Price Option");
}

@Given("seleciono a opcao: Gold")
public void seleciono_a_opcao_gold() {
    metodo.click(elem.getSelectOpion());
}

@Given("clico em: Next Send Quote")
public void clico_em_next_send_quote() {
    metodo.click(elem.getNextSendQuote());
}

@Given("valido redirecionamento para \\(title:) {string}")
public void valido_redirecionamento_para_title(String string) {
    metodo.validarTitle("Send Quote");
}

@Given("preencho o campo informando o email: {string}")
public void preencho_o_campo_informando_o_email(String string) {
    metodo.escrever(elem.getEmail(), faker.firstName.toLowerCase()+"@.test.com");
}

@Given("preencho o campo informando o telefone: {string}")
public void preencho_o_campo_informando_o_telefone(String string) {
    metodo.escrever(elem.getTelefone(), ""+RandomUtil.numberRandomicoInt(40004000, 49995999)+"");
}

@Given("preencho o campo informando o nome de usuario: {string}")
public void preencho_o_campo_informando_o_nome_de_usuario(String string) {
    metodo.escrever(elem.getNomeUsuario(), faker.firstName+""+RandomUtil.numberRandomicoInt(1980, 2000)+"");
}

@Given("preencho o campo informando a senha: {string}")
public void preencho_o_campo_informando_a_senha(String string) {
    metodo.escrever(elem.getSenha(), faker.firstName+"@p#123");
    
}

@Given("preencho o campo informando a confimacao de senha: {string}")
public void preencho_o_campo_informando_a_confimacao_de_senha(String string) {
	metodo.escrever(elem.getConfSenha(), faker.firstName+"@p#123");
}

@Given("adiciono um comentario: {string}")
public void adiciono_um_comentario(String string) {
    metodo.escrever(elem.getComentario(), "automated test successfully performed!");
}

@When("clico em: Send")
public void clico_em_send() {
    metodo.click(elem.getEnviarEmail());
}

@Then("valido a mensagem: {string}")
public void valido_a_mensagem(String string) {
    metodo.esperar(10, elem.getMsgSucesso());
    metodo.gerarEvidencia("Resultado do teste");
    metodo.fecharNavegador();
}


}
