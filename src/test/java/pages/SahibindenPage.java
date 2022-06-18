package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class SahibindenPage {
    public SahibindenPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(tagName = "Tüm vitrin ilanlarını göster")
    public WebElement vitrinIlanlari;
    @FindBy(xpath = "//ul[@class=\"vitrin-list clearfix\"]//li")
    public List<WebElement> homePageVitrinResult;
    @FindBy(xpath = "//div[@class=\"uiBox most\"]//ul//li")
    public List<WebElement> populerSearch;
    @FindBy(xpath = "//button[@id=\"onetrust-accept-btn-handler\"]")
    public WebElement cookies;
    @FindBy(xpath = "//*[@id=\"container\"]/div[3]/div/aside/div[1]/nav/ul[4]/li[2]/ul/li")
    public List<WebElement> vasitaMenu;
    @FindBy(xpath = "(//div[@class=\"jspPane\"])[1]//li")
    public List<WebElement> suvCategoryList;
    //
    //*[@id="container"]/div[3]/div/aside/div[1]/nav/ul[4]/li[2]/ul/li
    @FindBy
    public WebElement g;
    @FindBy
    public WebElement h;
    @FindBy
    public WebElement j;
    @FindBy
    public WebElement l;
    @FindBy
    public WebElement k;
    @FindBy
    public WebElement q;
    @FindBy
    public WebElement u;
    @FindBy
    public WebElement m;
    public WebElement searcAStringInPopulerSearch(List<WebElement> a,String s){
        WebElement element=null;
        for (WebElement w:a) {
            if(w.getText().equalsIgnoreCase(s)){
                element=w;
            }
        }
        return element;
    }
}
