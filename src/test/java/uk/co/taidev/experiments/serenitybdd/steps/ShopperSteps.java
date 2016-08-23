package uk.co.taidev.experiments.serenitybdd.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import uk.co.taidev.experiments.serenitybdd.pages.ProductListPage;

import static org.hamcrest.MatcherAssert.assertThat;

public class ShopperSteps extends ScenarioSteps {

    ProductListPage productListPage;

    @Step
    public void should_see_welcome() {
        assertThat(productListPage.getWelcome(), equals("Welcome to SpringShopping!"));
    }

    @Step
    public void is_the_home_page() {
        productListPage.open();
    }
}