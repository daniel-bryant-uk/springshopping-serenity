package uk.co.taidev.experiments.serenitybdd.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://localhost:8070/")
public class ProductListPage extends PageObject {

    @FindBy(xpath = "//h1")
    private WebElementFacade header;


    public String getWelcome() {
        return header.getText();
    }
}