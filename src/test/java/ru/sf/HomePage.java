package ru.sf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private final WebDriver webDriver;

    public HomePage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void Go(String url){
        webDriver.get(url);
    }

    public void SelectAllCourse(){
        webDriver.findElement(By.xpath("//img[@src=\"https://static.tildacdn.com/tild3935-6161-4263-b638-623138373033/photo.svg\"]")).click();
    }

    public void ToMain(){
        webDriver.get("https://skillfactory.ru/");
    }

    public void OpenResourse(String typeResourse) {
        switch (typeResourse) {
            case ("Habr"):
                webDriver.findElement(By.xpath("//*[@id=\"rec298827602\"]/div/div/div[27]/div/a")).click();
                break;
            case ("VKontakte"):
                webDriver.findElement(By.xpath("//*[@id=\"rec298827602\"]/div/div/div[14]/div/a")).click();
                break;
            case ("Twitter"):
                webDriver.findElement(By.xpath("//*[@id=\"rec298827602\"]/div/div/div[11]/div/a")).click();
                break;
            case ("YouTube"):
                webDriver.findElement(By.xpath("//*[@id=\"rec298827602\"]/div/div/div[12]/div/a")).click();
                break;
            case ("Telegram"):
                webDriver.findElement(By.xpath("//*[@id=\"rec298827602\"]/div/div/div[13]/div/a")).click();
                break;
            case ("Яндекс.Дзен"):
                webDriver.findElement(By.xpath("//*[@id=\"rec298827602\"]/div/div/div[15]/div/a")).click();
                break;
        }
    }
}
