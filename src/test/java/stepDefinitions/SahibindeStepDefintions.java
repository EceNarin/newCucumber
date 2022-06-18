package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.SahibindenPage;
import utilities.ConfigReader;
import utilities.Driver;

public class SahibindeStepDefintions {
    SahibindenPage sp=new SahibindenPage();
    Actions action=new Actions(Driver.getDriver());
    @Given("user navigate to {string} homepage")
    public void user_navigate_to_homepage(String string) {
        Driver.getDriver().get(ConfigReader.getProperty(string));
    }
    @Then("accept cookies")
    public void accept_cookies() {
        sp.cookies.click();
    }
    @Then("verify to on the homepage notices result if its {int}")
    public void verify_to_on_the_homepage_notices_result_if_its(Integer int1) {
       int size= sp.homePageVitrinResult.size();
        Assert.assertTrue(size==int1);
    }
    @Then("page down")
    public void page_down() {
        action.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).perform();

    }
    @Then("verify to into populer searhing {string}")
    public void verify_to_into_populer_searhing(String string) {
     WebElement element= sp.searcAStringInPopulerSearch(sp.populerSearch,string);
     String expectedWord= element.getText();
     Assert.assertTrue(expectedWord.equalsIgnoreCase(string));
    }
    @And("vasita menusunden {string} a tikla")
    public void vasitaMenusundenATikla(String arg0) {
        action.sendKeys(Keys.PAGE_UP).sendKeys(Keys.UP).perform();
        sp.searcAStringInPopulerSearch(sp.vasitaMenu,arg0).click();
    }
    @Then("verify to {string} ilan sayisi {int} den fazla")
    public void verify_to_ilan_sayisi_den_fazla(String string, Integer int1) {
    WebElement element=sp.searcAStringInPopulerSearch(sp.suvCategoryList,string);
    int result= Integer.parseInt(element.getText().replaceAll("[^0-9]",""));
        System.out.println(result);
    Assert.assertTrue(result>int1);

    }
    @Then("{string} e tikla")
    public void e_tikla(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("fiyat araligi olarak {string} gir")
    public void fiyat_araligi_olarak_gir(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("yakit benzin sec")
    public void yakit_benzin_sec() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("km max {int} bin sec")
    public void km_max_bin_sec(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("renk beyaz sec")
    public void renk_beyaz_sec() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("fotografli ilanlar sec")
    public void fotografli_ilanlar_sec() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("arama butonuna tikla")
    public void arama_butonuna_tikla() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("gelen ilanlari fiyata gore sirala")
    public void gelen_ilanlari_fiyata_gore_sirala() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("en ucuz ilanin yil, km, fiyat biglierini yazdir")
    public void en_ucuz_ilanin_yil_km_fiyat_biglierini_yazdir() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


}

