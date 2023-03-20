package page;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;

import java.io.File;
import java.io.IOException;

public class cadastroPage {


    WebDriver driver;


    public cadastroPage(WebDriver driver) {
        this.driver = driver;
    }

    /*
     * Elementos de Tela
     * */

    private WebElement cpFirstName() {
        return driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input"));
    }

    private WebElement cpLastName() {
        return driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input"));
    }

    private WebElement cpAdress() {
        return driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea"));
    }

    private WebElement cpEmail() {
        return driver.findElement(By.xpath("//*[@id=\"eid\"]/input"));
    }

    private WebElement cpPhone() {
        return driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[4]/div/input"));
    }

    private WebElement checkGender() {
        return driver.findElement(By.name("radiooptions"));
    }

    private WebElement checkHobbies() {
        return driver.findElement(By.id("checkbox2"));
    }

    private WebElement cpLanguages() {
        return driver.findElement(By.cssSelector("#basicBootstrapForm > div:nth-child(7) > div > multi-select > div:nth-child(2) > ul > li:nth-child(3)"));
    }

    private WebElement cpSkills() {
        return driver.findElement(By.xpath("//*[@id=\"Skills\"]/option[5]"));
    }

    private WebElement cpCountry() {
        return driver.findElement(By.cssSelector("#select2-country-results > li:nth-child(5)"));
    }

    private WebElement cpYear() {
        return driver.findElement(By.cssSelector("#yearbox > option:nth-child(37)"));
    }

    private WebElement cpMonth() {
        return driver.findElement(By.cssSelector("#basicBootstrapForm > div:nth-child(11) > div:nth-child(3) > select > option:nth-child(4)"));
    }

    private WebElement cpDay() {
        return driver.findElement(By.cssSelector("#daybox > option:nth-child(16)"));
    }

    private WebElement cpPassword() {
        return driver.findElement(By.id("firstpassword"));
    }

    private WebElement cpConfirmPassword() {
        return driver.findElement(By.id("secondpassword"));
    }

    private WebElement btnSubmit() {
        return driver.findElement(By.id("submitbtn"));
    }

    /*
     * Metodos
     * */
    public void acessarAplicacao() {
        driver.get("https://demo.automationtesting.in/Register.html");
    }

    public void cpPrimeiroNome () {
        cpFirstName().sendKeys("Guilherme");
        }

    public void cpSegundoNome () {
        cpLastName().sendKeys("Vargas");
    }

    public void cpEndereco () {
        cpAdress().sendKeys("Av Paulista 3987");
    }

    public void cpEmailValido () {
        cpEmail().sendKeys("Teste@teste.com");
    }

    public void cpTelefone () {
        cpPhone().sendKeys("11934887788");
    }

    public void cpGenero () {
        checkGender().click();
    }

    public void cpHobbies () {
        checkHobbies().click();
    }

    public void cpLinguagem () {
        cpLanguages().click();
    }

    public void cpHabilidades () {
        cpSkills().click();
    }

    public void cpPais () {
        cpCountry().click();
    }

    public void cpAno () {
        cpYear().click();
    }

    public void cpMes () {
        cpMonth().click();
    }

    public void cpDia () {
        cpDay().click();
    }

    public void cpSenha () {
        cpPassword().click();
    }

    public void cpConfirmaSenha () {
        cpConfirmPassword().click();
    }

    public void botaoSubmit () {
        btnSubmit().click();
    }

    public void screnShoot(String nome) throws IOException {

        TakesScreenshot scrShot = ((TakesScreenshot) driver);
        File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
        File DestFile = new File("./src/evidencia/" + nome + ".png");
        FileUtils.copyFile(SrcFile, DestFile);
    }
}