package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment 
{
	public static void main(String[] args){
	System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
 WebDriver driver=new FirefoxDriver();
 driver.get("https://www.youtube.com/watch?v=MAz82zT-gCs");
 driver.findElement(By.cssSelector("input[id='search']")).sendKeys("rakkama song");
 driver.findElement(By.cssSelector("button[id='search-icon-legacy']")).click();
 driver.findElement(By.cssSelector("yt-formatted-string[aria-label='Ra Ra Rakkamma Hindi Lyric Video | Vikrant Rona | Kichcha Sudeep |Jacqueline Fernandez|Anup Bhandari by T-Series 2 months ago 3 minutes, 44 seconds 24,656,463 views']']")).click();
	}
}
