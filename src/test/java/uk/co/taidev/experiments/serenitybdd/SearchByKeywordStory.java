package uk.co.taidev.experiments.serenitybdd;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.*;
import net.thucydides.core.pages.Pages;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import uk.co.taidev.experiments.serenitybdd.steps.ShopperSteps;

@RunWith(SerenityRunner.class)
public class SearchByKeywordStory {

    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @ManagedPages(defaultUrl = "http://localhost:8070/")
    public Pages pages;

    @Steps
    public ShopperSteps shopperUser;

    @Issue("#WIKI-1")
    @Test
    public void searching_by_keyword_apple_should_display_the_corresponding_article() {
        shopperUser.is_the_home_page();
        shopperUser.should_see_welcome();
    }
} 