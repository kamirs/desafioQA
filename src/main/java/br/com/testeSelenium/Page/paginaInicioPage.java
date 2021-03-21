package br.com.testeSelenium.Page;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.testeSelenium.Util;

public class paginaInicioPage extends Util {

	public void clickAbaVerMais() throws AWTException, InterruptedException {

		Thread.sleep(3000);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);

		WebDriverWait vermais = new WebDriverWait(driver, 50);
		vermais.until(ExpectedConditions.presenceOfElementLocated(ByXPath
				.xpath("//span[@class=\"text ea-typography ea-typography--body-m et-text-dark-high\"][.='Ver mais']")))
				.click();

	}

	public void verExtrato() {

		WebDriverWait verextrato = new WebDriverWait(driver, 50);
		verextrato.until(ExpectedConditions.presenceOfElementLocated(ByXPath.xpath(
				"//span[@class=\"text ea-typography ea-typography--body-m et-text-dark-high\"][.='Ver extrato']")))
				.click();

	}

	public String extratoDisponivel() {
		WebDriverWait extratoDisponivel = new WebDriverWait(driver, 50);
		return extratoDisponivel.until(ExpectedConditions.presenceOfElementLocated(ByXPath.xpath("//span[@class=\"ea-typography ea-typography--heading-s et-text-dark-high\"]"))).getText();
	}

}
