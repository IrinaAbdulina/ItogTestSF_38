package ru.sf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AllCoursesPage {
    private final WebDriver webDriver;

    public AllCoursesPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void SelectCours(String lnk, String typeLocator) {
        switch (typeLocator) {
            case ("xpath"):
                webDriver.findElement(By.xpath(lnk)).click();
                break;
            case ("id"):
                webDriver.findElement(By.id(lnk)).click();
                break;
            case ("className"):
                webDriver.findElement(By.className(lnk)).click();
                break;
        }
    }
}

