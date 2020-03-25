package DOmaciNizovi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Otvaranje_Refresh_Pretrazivaca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Dodatni neobavezni zadatak Selenium Pomocu jave i seleniuma otvoriti
		 * pretrazivac i otici na Youtube. Pet puta kliknuti na dugme refresh, i tek
		 * onda zatvoriti pretrazivac.
		 */

		System.setProperty("webdriver.chrome.driver", "/home/neda/Downloads/chromedriver_linux64/chromedriver");

		WebDriver dw = new ChromeDriver();
		dw.get("https://www.nationalgeographic.rs/");

		for (int i = 0; i < 5; i++) {
			dw.navigate().refresh();

		}

		dw.close();

	}

}
