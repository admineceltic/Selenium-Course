package com.gibl.TC;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo {
	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.gibl.in/");
		//man
		driver.findElement(By.xpath("//p[text()='Health']")).click();
		driver.findElement(By.xpath("(//div[@class='mat-radio-container'])[1]")).click();
		driver.findElement(By.id("mat-input-0")).sendKeys("Sam");
		driver.findElement(By.id("mat-input-1")).sendKeys("sam@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("1234567890");
		driver.findElement(By.id("mat-input-3")).sendKeys("123456");
		driver.findElement(By.xpath("(//button[@class='ng-tns-c1-0 mat-raised-button mat-button-base mat-primary'])[1]")).click();
		driver.findElement(By.xpath("//p[text()='Myself']")).click();
		driver.findElement(By.id("mat-select-0")).click();
		driver.findElement(By.xpath("(//div[@class='mat-form-field-infix'])[4]"));
		Thread.sleep(8000);
		driver.findElement(By.xpath("//span[text()='20 Years']")).click();
		driver.findElement(By.xpath("//button[@class='mat-raised-button mat-button-base mat-primary']")).click();
		driver.navigate().back();
		Thread.sleep(6000);
		
		//Spouse
		driver.findElement(By.xpath("//p[text()='Health']")).click();
		driver.findElement(By.xpath("(//div[@class='mat-radio-container'])[1]")).click();
		driver.findElement(By.id("mat-input-0")).click();
		driver.findElement(By.id("mat-input-0")).sendKeys("Sam");
		driver.findElement(By.id("mat-input-1")).sendKeys("sam@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("1234567890");
		driver.findElement(By.id("mat-input-3")).sendKeys("123456");
		driver.findElement(By.xpath("(//button[@class='ng-tns-c1-0 mat-raised-button mat-button-base mat-primary'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='text-left  header-top'])[1]")).click();
		driver.findElement(By.xpath("(//div[@class='mat-form-field-infix'])[4]")).click();
		Thread.sleep(7000);
		driver.findElement(By.xpath("//span[text()='20 Yrs']")).click();
		driver.findElement(By.xpath("(//div[@class='mat-form-field-infix'])[5]")).click();
		Thread.sleep(7000);
		driver.findElement(By.xpath("(//span[@class='mat-option-text'])[4]")).click();
		driver.findElement(By.xpath("//button[@class='mat-raised-button mat-button-base mat-primary']")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		driver.navigate().back();
		//Spouse2
		
		driver.findElement(By.xpath("//p[text()='Health']")).click();
		driver.findElement(By.xpath("(//div[@class='mat-radio-container'])[1]")).click();
		driver.findElement(By.id("mat-input-0")).sendKeys("Sam");
		driver.findElement(By.id("mat-input-1")).sendKeys("sam@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("1234567890");
		driver.findElement(By.id("mat-input-3")).sendKeys("123456");
		driver.findElement(By.xpath("(//button[@class='ng-tns-c1-0 mat-raised-button mat-button-base mat-primary'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='text-left  header-top'])[2]")).click();
		driver.findElement(By.xpath("(//div[@class='mat-form-field-infix'])[4]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='20 Yrs']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//div[@class='mat-form-field-infix'])[5]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='21 Yrs']")).click();
		Thread.sleep(3000);
	driver.findElement(By.xpath("(//div[@class='mat-form-field-infix'])[6]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[text()='3 Yrs']")).click();
	Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='mat-raised-button mat-button-base mat-primary']")).click();
		driver.navigate().back();
		// 
		
		driver.findElement(By.xpath("//p[text()='Health']")).click();
		driver.findElement(By.xpath("(//div[@class='mat-radio-container'])[1]")).click();
		driver.findElement(By.id("mat-input-0")).sendKeys("Sam");
		driver.findElement(By.id("mat-input-1")).sendKeys("sam@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("1234567890");
		driver.findElement(By.id("mat-input-3")).sendKeys("123456");
		driver.findElement(By.xpath("(//button[@class='ng-tns-c1-0 mat-raised-button mat-button-base mat-primary'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[text()='More Family Members ']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='mat-checkbox-inner-container'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='mat-form-field-infix'])[4]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='19 Yrs']")).click();
		Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@class='mat-raised-button mat-button-base mat-primary']")).click();
	driver.close();
		
	}

}
