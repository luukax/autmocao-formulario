package elementos;
import org.openqa.selenium.By;

import util.RandomUtil;

public class ElementosWeb {
	    private By automobile = By.id("nav_automobile");
	// elementos do formulario Enter Vehicle Data
	    private By caixaMarca = By.id("make");
		public By getAutomobile() {
			return automobile;
		}
		public By getCaixaMarca() {
			return caixaMarca;
		}
		private By marca = By.xpath("//*[@id=\"make\"]/option["+RandomUtil.numberRandomicoInt(2, 16)+"]");
		private By modelo = By.xpath("//*[@id=\"model\"]/option["+RandomUtil.numberRandomicoInt(2, 5)+"]");
		private By cilindrada = By.id("cylindercapacity");
		private By performace = By.id("engineperformance");
		private By dataFabricacao = By.id("dateofmanufacture");
		private By numeroAssentos = By.xpath("//*[@id=\"numberofseats\"]/option["+RandomUtil.numberRandomicoInt(2, 10)+"]");
		private By maoMotorista = By.xpath("//*[@id=\"insurance-form\"]/div/section[1]/div[7]/p/label["+RandomUtil.numberRandomicoInt(1, 2)+"]/span");
		private By numberSeats = By.xpath("//*[@id=\"numberofseatsmotorcycle\"]/option["+RandomUtil.numberRandomicoInt(2, 4)+"]");
		private By tipoCombustivel = By.xpath("//*[@id=\"fuel\"]/option["+RandomUtil.numberRandomicoInt(2, 6)+"]");
		private By peso = By.id("payload");
		private By pesoTotal = By.id("totalweight");
		private By tabelaPreco = By.id("listprice");
		private By placa = By.id("licenseplatenumber");
		private By kmAnual = By.id("annualmileage");
		private By next = By.id("nextenterinsurantdata");
		// elementos do formulario Enter insurant Data
		private By primeiroNome = By.id("firstname");
		private By sobreNome = By.id("lastname");
		private By nascimento = By.id("birthdate");
		private By genero = By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[4]/p/label["+RandomUtil.numberRandomicoInt(1, 2)+"]");
		private By rua = By.id("streetaddress");
		private By pais = By.xpath("//*[@id=\"country\"]/option["+RandomUtil.numberRandomicoInt(2, 250)+"]");
		private By cep = By.id("zipcode");
		private By cidade = By.id("city");
		private By ocupacao = By.xpath("//*[@id=\"occupation\"]/option["+RandomUtil.numberRandomicoInt(2, 6)+"]");
		private By hobbieVelociada = By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label["+RandomUtil.numberRandomicoInt(1, 5)+"]");
		private By site = By.id("website");
		private By imagem = By.id("picture");
		private By nextProdutc = By.id("nextenterproductdata");
		// elementos do formulario Product Data
		private By calendario = By.id("startdate");
		private By nextCalendario = By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a["+RandomUtil.numberRandomicoInt(2, 9)+"]");
		private By diaCalendario = By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[1]/td[4]/a");
		private By dataInicio = By.id("startdate");
		private By SomaDoSeguro = By.xpath("//*[@id=\"insurancesum\"]/option["+RandomUtil.numberRandomicoInt(2, 9)+"]");
		private By classificacao = By.xpath("//*[@id=\"meritrating\"]/option["+RandomUtil.numberRandomicoInt(1, 17)+"]");
		private By seguroDanos = By.xpath("//*[@id=\"damageinsurance\"]/option["+RandomUtil.numberRandomicoInt(2, 4)+"]");
		private By opcaoProtudo = By.xpath("//*[@id=\"insurance-form\"]/div/section[3]/div[5]/p/label["+RandomUtil.numberRandomicoInt(1, 2)+"]");
		private By carroCortesia = By.xpath("//*[@id=\"courtesycar\"]/option["+RandomUtil.numberRandomicoInt(2, 3)+"]");
		private By nextPrice = By.id("nextselectpriceoption");
		// elementos do formulario Price Option
		private By selectOpion = By.xpath("//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label["+RandomUtil.numberRandomicoInt(1, 4)+"]");
		private By nextSendQuote = By.id("nextsendquote");
		// elementos do formulario Send Quote
		private By email = By.id("email");
		private By telefone = By.id("phone");
		private By nomeUsuario = By.id("username");
		private By senha = By.id("password");
		private By confSenha = By.id("confirmpassword");
		private By comentario = By.id("Comments");
		private By enviarEmail = By.id("sendemail");
		private By msgSucesso = By.xpath("//*[text()='Sending e-mail success!']");
		public By getMarca() {
			return marca;
		}
		public By getModelo() {
			return modelo;
		}
		public By getCilindrada() {
			return cilindrada;
		}
		public By getPerformace() {
			return performace;
		}
		public By getDataFabricacao() {
			return dataFabricacao;
		}
		public By getNumeroAssentos() {
			return numeroAssentos;
		}
		public By getMaoMotorista() {
			return maoMotorista;
		}
		public By getNumberSeats() {
			return numberSeats;
		}
		public By getTipoCombustivel() {
			return tipoCombustivel;
		}
		public By getPeso() {
			return peso;
		}
		public By getPesoTotal() {
			return pesoTotal;
		}
		public By getTabelaPreco() {
			return tabelaPreco;
		}
		public By getPlaca() {
			return placa;
		}
		public By getKmAnual() {
			return kmAnual;
		}
		public By getNext() {
			return next;
		}
		public By getPrimeiroNome() {
			return primeiroNome;
		}
		public By getSobreNome() {
			return sobreNome;
		}
		public By getNascimento() {
			return nascimento;
		}
		public By getGenero() {
			return genero;
		}
		public By getRua() {
			return rua;
		}
		public By getPais() {
			return pais;
		}
		public By getCep() {
			return cep;
		}
		public By getCidade() {
			return cidade;
		}
		public By getOcupacao() {
			return ocupacao;
		}
		public By getHobbieVelociada() {
			return hobbieVelociada;
		}
		public By getSite() {
			return site;
		}
		public By getImagem() {
			return imagem;
		}
		public By getNextProdutc() {
			return nextProdutc;
		}
		public By getCalendario() {
			return calendario;
		}
		public By getNextCalendario() {
			return nextCalendario;
		}
		public By getDiaCalendario() {
			return diaCalendario;
		}
		public By getDataInicio() {
			return dataInicio;
		}
		public By getSomaDoSeguro() {
			return SomaDoSeguro;
		}
		public By getClassificacao() {
			return classificacao;
		}
		public By getSeguroDanos() {
			return seguroDanos;
		}
		public By getOpcaoProtudo() {
			return opcaoProtudo;
		}
		public By getCarroCortesia() {
			return carroCortesia;
		}
		public By getNextPrice() {
			return nextPrice;
		}
		public By getSelectOpion() {
			return selectOpion;
		}
		public By getNextSendQuote() {
			return nextSendQuote;
		}
		public By getEmail() {
			return email;
		}
		public By getTelefone() {
			return telefone;
		}
		public By getNomeUsuario() {
			return nomeUsuario;
		}
		public By getSenha() {
			return senha;
		}
		public By getConfSenha() {
			return confSenha;
		}
		public By getComentario() {
			return comentario;
		}
		public By getEnviarEmail() {
			return enviarEmail;
		}
		public By getMsgSucesso() {
			return msgSucesso;
		}

}
