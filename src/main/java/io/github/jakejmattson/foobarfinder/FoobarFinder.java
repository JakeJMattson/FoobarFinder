package io.github.jakejmattson.foobarfinder;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Random;

public class FoobarFinder
{
	public static void main(String[] args)
	{
		String[] keywords = {"ArrayList java", "Python command line arguments", "headless chrome"};

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		search(driver, keywords);
	}

	private static void search(WebDriver driver, String[] keywords)
	{
		boolean notFound;

		do
		{
			System.out.println("Searching...");

			driver.get("https://www.google.com/search?q=" + keywords[new Random().nextInt(keywords.length)]);
			notFound = driver.findElements(By.className("button-block")).isEmpty();

		} while (notFound);

		driver.manage().window().maximize();
		System.out.println("Foobar found. Please sign in to your google account to claim.");
	}
}