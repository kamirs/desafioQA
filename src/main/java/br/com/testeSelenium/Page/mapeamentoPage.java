package br.com.testeSelenium.Page;

import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.NoSuchElementException;
import br.com.testeSelenium.Util;

@SuppressWarnings("unused")
public class mapeamentoPage extends Util {
	
	public void entrar()  {
	   
		WebDriverWait entrar = new WebDriverWait(driver,100);
		entrar.until(ExpectedConditions.visibilityOfElementLocated(ByXPath.xpath("//button[@class=\"button button--primary _2dsxvAkd\"]"))).click();
			
	}
	
	public void preencherCpf(String cpf) {
		
		WebDriverWait CPF = new WebDriverWait(driver, 100);
		CPF.until(ExpectedConditions.presenceOfElementLocated(ById.id("cpf"))).sendKeys(Keys.HOME + cpf);
		
		
	}
	
	public void confirmarCpf() {
		
		WebDriverWait confirmar = new WebDriverWait(driver, 100);
		confirmar.until(ExpectedConditions.presenceOfElementLocated(ByCssSelector.cssSelector("._173KVZ0O > .button.button--primary.w-100"))).click();
	}
	
	public void PrencherPassword(String senha) {
		
		WebDriverWait password = new WebDriverWait(driver, 100);
		password.until(ExpectedConditions.presenceOfElementLocated(ByCssSelector.cssSelector("input#password"))).sendKeys(Keys.HOME + senha);
	}
	
	public void confirmarSenha() {
		
		WebDriverWait confirmarSenha = new WebDriverWait(driver, 100);
		confirmarSenha.until(ExpectedConditions.presenceOfElementLocated(ByCssSelector.cssSelector("._3y_4Kows > ._39GnsT4o.button.button--primary"))).click();
	}
	
	
	
	

}
