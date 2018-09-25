package io.github.jakejmattson.foobarfinder;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.JOptionPane;
import java.util.Random;

public class FoobarFinder
{
	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		String[] keywords = {"ArrayList java", "Python command line arguments", "headless chrome"};
		search(new ChromeDriver(), keywords);
	}

	private static void search(WebDriver driver, String[] keywords)
	{
		boolean notFound;

		do
		{
			driver.get("https://www.google.com/search?q=" + keywords[new Random().nextInt(keywords.length)]);
			notFound = driver.findElements(By.className("button-block")).isEmpty();

		} while (notFound);

		driver.manage().window().maximize();
		JOptionPane.showMessageDialog(null, "Please sign in to your google account to claim.",
				"Foobar found!", JOptionPane.INFORMATION_MESSAGE);
	}
}