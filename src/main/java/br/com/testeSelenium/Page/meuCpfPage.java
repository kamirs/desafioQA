package br.com.testeSelenium.Page;

import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.testeSelenium.Util;

public class meuCpfPage extends Util {

	public void abaMeuCPF() {

		WebDriverWait meucpf = new WebDriverWait(driver, 100);
		meucpf.until(ExpectedConditions
				.visibilityOfElementLocated(ByCssSelector.cssSelector("li:nth-of-type(3) > a[role='menuitem']")))
				.click();
	}

	public String telaMonitoramento() {

		WebDriverWait Monitoramento = new WebDriverWait(driver, 100);
		return Monitoramento
				.until(ExpectedConditions.presenceOfElementLocated(
						ByCssSelector.cssSelector(".ea-typography.ea-typography--heading-m.et-text-dark-high")))
				.getText();
	}

}
