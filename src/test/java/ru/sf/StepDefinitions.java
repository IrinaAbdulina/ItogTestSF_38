package ru.sf;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static java.lang.Thread.sleep;
import static org.junit.Assert.assertEquals;
public class StepDefinitions {

    //Для опитимазации кода, URL вынеcли в константы, для объявления один раз для всего проекта
    final String TESTED_SITE = "https://skillfactory.ru/";

    static final WebDriver webDriver;
    private static final HomePage homePage;
    private static final AllCoursesPage allCoursesPage;
    static {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\"+System.getenv("USERNAME")+"\\IdeaProjects\\FinalTestSF\\src\\test\\resources\\chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        homePage = new HomePage(webDriver);
        allCoursesPage = new AllCoursesPage((webDriver));
    }
    @Given("url of skillfactory")
    public void url_of_skillfactory() {
        homePage.Go(TESTED_SITE);
    }

    @Then("select all courses")
    public void select_all_courses() {
        homePage.SelectAllCourse();
    }

    @Then("select menu On-lain-kursi")
    public void select_menu_on_lain_kursi() {
        webDriver.findElement(By.xpath("//*[@id=\"rec456746055\"]/div/div/div[45]/a")).click();
    }
    @Then("select menu Dizain")
    public void select_menu_dizain() {
        webDriver.findElement(By.xpath("//*[@id=\"nav493615268\"]/div/div[3]/ul/li[13]/div/a/span")).click();
    }
    @Then("select menu Besplatno")
    public void select_menu_besplatno() {
        webDriver.findElement(By.xpath("//*[@id=\"rec456746055\"]/div/div/div[41]/a")).click();
    }
    @Then("select menu Korporativnoe obychenie")
    public void select_menu_korporativnoe_obychenie() {
        webDriver.findElement(By.xpath("//*[@id=\"rec456746055\"]/div/div/div[42]/a")).click();
    }
    @Then("select menu Sotrydnichestvo")
    public void select_menu_sotrydnichestvo() {
        webDriver.findElement(By.xpath("//*[@id=\"rec456746055\"]/div/div/div[44]/a")).click();
    }
    @Then("select menu Blog")
    public void select_menu_blog() {
        webDriver.findElement(By.xpath("//*[@id=\"rec456746055\"]/div/div/div[43]/a")).click();
    }
    @Then("click button Vibrat kurs")
    public void click_button_vibrat_kurs() {
        webDriver.findElement(By.xpath("//*[@id=\"rec509257438\"]/div/div/div[7]/a")).click();
    }
    @Then("choice Data Science")
    public void choice_data_science() throws InterruptedException {
        sleep(4000);
        webDriver.findElement(By.xpath("//*[@id=\"rec507070798\"]/div/div/div/div/div[1]/a")).click();
    }
    @Then("choice Analitika dannih")
    public void choice_analitika_dannih() throws InterruptedException {
        sleep(4000);
        webDriver.findElement(By.xpath("//*[@id=\"rec507070798\"]/div/div/div/div/div[2]/a")).click();
    }
    @Then("back to home page")
    public void back_to_home_page() throws InterruptedException {
        sleep(4000);
        webDriver.findElement(By.xpath("//*[@id=\"rec469350955\"]/div/div/div[3]/a/img")).click();
    }
    @Then("choice Programmirovanie")
    public void choice_programmirovanie() throws InterruptedException {
        sleep(4000);
        webDriver.findElement(By.xpath("//*[@id=\"rec507070798\"]/div/div/div/div/div[3]/a")).click();
    }
    @Then("choice Marketing")
    public void choice_marketing() throws InterruptedException {
        sleep(4000);
        webDriver.findElement(By.xpath("//*[@id=\"rec507070798\"]/div/div/div/div/div[4]/a")).click();
    }
    @Then("choice Testirovanie")
    public void choice_testirovanie() throws InterruptedException {
        sleep(4000);
        webDriver.findElement(By.xpath("//*[@id=\"rec507070798\"]/div/div/div/div/div[5]/a")).click();
    }
    @Then("choice Veb-razrabotka")
    public void choice_veb_razrabotka() throws InterruptedException {
        sleep(4000);
        webDriver.findElement(By.xpath("//*[@id=\"rec507070798\"]/div/div/div/div/div[6]/a")).click();
    }
    @Then("choice Backend-razrabotka")
    public void choice_backend_razrabotka() throws InterruptedException {
        sleep(4000);
        webDriver.findElement(By.xpath("//*[@id=\"rec507070798\"]/div/div/div/div/div[7]/a")).click();
    }
    @Then("choice Dizain")
    public void choice_dizain() throws InterruptedException {
        sleep(4000);
        webDriver.findElement(By.xpath("//*[@id=\"rec507070798\"]/div/div/div/div/div[8]/a")).click();
    }
    @Then("choice Bezopasnost")
    public void choice_bezopasnost() throws InterruptedException {
        sleep(8000);
        webDriver.findElement(By.xpath("//*[@id=\"rec507070798\"]/div/div/div/div/div[9]/a")).click();
    }
    @Then("choice Infrastructure")
    public void choice_infrastructure() throws InterruptedException {
        sleep(4000);
        webDriver.findElement(By.xpath("//*[@id=\"rec507070798\"]/div/div/div/div/div[10]/a")).click();
    }
    @Then("choice Razrabotka igr")
    public void choice_razrabotka_igr() throws InterruptedException {
        sleep(4000);
        webDriver.findElement(By.xpath("//*[@id=\"rec507070798\"]/div/div/div/div/div[11]/a")).click();
    }
    @Then("choice Menegment")
    public void choice_menegment() throws InterruptedException {
        sleep(4000);
        webDriver.findElement(By.xpath("//*[@id=\"rec507070798\"]/div/div/div/div/div[12]/a")).click();
    }
    @Then("choice Visshoe obrazovanie NEW")
    public void choice_visshoe_obrazovanie_NEW() throws InterruptedException {
        sleep(4000);
        webDriver.findElement(By.xpath("//*[@id=\"rec507070798\"]/div/div/div/div/div[13]/a")).click();
    }
    @Then("choice Razrabotka prilogenii")
    public void choice_razrabotka_prilogenii() throws InterruptedException {
        sleep(4000);
        webDriver.findElement(By.xpath("//*[@id=\"rec507070798\"]/div/div/div/div/div[14]/a")).click();
    }
    @Then("choice Sozdanie sites")
    public void choice_sozdanie_sites() throws InterruptedException {
        sleep(8000);
        webDriver.findElement(By.xpath("//*[@id=\"rec507070798\"]/div/div/div/div/div[15]/a")).click();
    }
    @Then("select blog Habr")
    public void select_blog_habr() {
        homePage.OpenResourse("Habr");
    }
    @Then("select blog VKontakte")
    public void select_blog_v_kontakte() {
        homePage.OpenResourse("VKontakte");
    }
    @Then("select blog Twitter")
    public void select_blog_twitter() {
        homePage.OpenResourse("Twitter");
    }
    @Then("select blog YouTube")
    public void select_blog_you_tube() {
        homePage.OpenResourse("YouTube");
    }
    @Then("select blog Telegram")
    public void select_blog_telegram() {
        homePage.OpenResourse("Telegram");
    }

    @Then("select blog Jandeks.Dzen")
    public void select_blog_jandeks_dzen() {
        homePage.OpenResourse("Яндекс.Дзен");
    }

    @Then("open a bank Tinkoff")
    public void open_a_bank_tinkoff() {
        webDriver.findElement(By.xpath("//*[@id=\"rec298827602\"]/div/div/div[42]/div/a")).click();
    }
    @Then("open a bank Sberbank")
    public void open_a_bank_sberbank() {
        webDriver.findElement(By.xpath("//*[@id=\"rec298827602\"]/div/div/div[45]/div/a")).click();
    }
    @Then("open a bank Pochta Bank")
    public void open_a_bank_pochta_bank() {
        webDriver.findElement(By.xpath("//*[@id=\"rec298827602\"]/div/div/div[44]/div/a")).click();
    }
    @Then("open a bank Alfa-bank")
    public void open_a_bank_alfa_bank() {
        webDriver.findElement(By.xpath("//*[@id=\"rec298827602\"]/div/div/div[43]/div/a")).click();
    }
    @Then("choose direction Razrabotka igr")
    public void choose_direction_razrabotka_igr() {
        webDriver.findElement(By.xpath("//*[@id=\"rec468113060\"]/div/div/div[37]/a")).click();
    }
    @Then("click on the button poluchit konsultaciu")
    public void click_on_the_button_poluchit_konsultaciu() {
        webDriver.findElement(By.xpath("//*[@id=\"rec456746070\"]/div/div/div[6]/a")).click();
    }
    @Then("click on the button otpravit zajavku")
    public void click_on_the_button_otpravit_zajavku() throws InterruptedException {
        sleep(4000);
        webDriver.findElement(By.xpath("//*[@id=\"form456746072\"]/div[2]/div[6]/button")).click();
    }
    @Then("enter data {string}, {string}, {string}")
    public void enter_data(String sUserName, String sEmail, String sPhoneNumber) {
        WebElement UserName = webDriver.findElement(By.xpath("//*[@id=\"form456746072\"]/div[2]/div[1]/div/input"));
        WebElement Email = webDriver.findElement(By.xpath("//*[@id=\"form456746072\"]/div[2]/div[2]/div/input"));
        WebElement PhoneNumber = webDriver.findElement(By.xpath("//*[@id=\"form456746072\"]/div[2]/div[3]/div/div[1]/input[1]"));
        UserName.sendKeys(sUserName);
        Email.sendKeys(sEmail);
        PhoneNumber.sendKeys(sPhoneNumber);
        webDriver.findElement(By.xpath("//*[@id=\"form456746072\"]/div[2]/div[6]/button")).click();
    }
    @Then("click on the button otpravit zajavku, ne zapolnjat objazatelie polja")
    public void click_on_the_button_otpravit_zajavku_ne_zapolnjat_objazatelie_polja() {
        webDriver.findElement(By.xpath("//*[@id=\"form456746072\"]/div[2]/div[6]/button")).click();
    }
    @Then("assert that user got message {string}")
    public void assert_that_user_got_message(String errorMessage) {
        final String actualMessage = webDriver.findElement(By.xpath("//*[@id=\"form456746072\"]/div[2]/div[5]/div/div/p[2]")).getText();
        assertEquals(errorMessage, actualMessage);
    }
}