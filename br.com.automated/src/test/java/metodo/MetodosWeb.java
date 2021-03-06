package metodo;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MetodosWeb {
WebDriver driver;


public void abrirBrowser(String website) {
	try {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(website);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		gerarEvidencia("Home"+website);
	} catch (Exception e) {
		System.out.println(">>>>>ERRO AO ABRIR NAVEGADOR<<<<<");
	}	
}

public void click (By elemento) {
	try {
		driver.findElement(elemento).click();
	} catch (Exception e) {
		System.out.println(">>>>>ERRO AO CLICAR NO ELEMENTO<<<<<");
	}
	
}

public void escrever(By elmento, String text) {
	try {
		driver.findElement(elmento).sendKeys(text);
	} catch (Exception e) {
		System.out.println(">>>>>ERRO AO ESCREVER<<<<<");
	}
}

public void validarTitle(String titleEsperado) {
	try {
		String textTitle = driver.getTitle();
		assertEquals(textTitle, titleEsperado);
	} catch (Exception e) {
		System.out.println(">>>>>ERRO AO VALIDAR TITLE<<<<<");
		gerarEvidencia("ERRO AO VALIDAR TITLE");

	}
}

public void gerarEvidencia(String nome) {
	TakesScreenshot sch = ((TakesScreenshot)driver);
	File srcFile = sch.getScreenshotAs(OutputType.FILE);
	File destFile = new File("./evidencias/"+nome+"./png");
	try {
		FileUtils.copyFile(srcFile, destFile);
	} catch (IOException e) {
		e.getMessage();
	}
}
public void esperar(int tempo, By elemento) {
	
		WebDriverWait wait = new WebDriverWait(driver, tempo);
        wait.until(ExpectedConditions.visibilityOfElementLocated(elemento));
	gerarEvidencia("Resultado do teste!");
	
}
public void fecharNavegador() {
	try {
		driver.close();
	} catch (Exception e) {
		System.out.println(">>>>>ERRO AO FECHAR NAVEGADOR<<<<<");
		gerarEvidencia("ERRO AO FECHAR NAVEGADOR");
	}
}
}
