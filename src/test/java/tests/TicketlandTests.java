package tests;

import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byPlaceholder;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Configuration.baseUrl;


public class TicketlandTests extends TicketlandBase {
    @Test
    void succesTicketlandSearchTest() {
        open (baseUrl);

        SelenideElement cookieBanner =
                $("[aria-label='Уведомление об использовании файлов cookie']");
        cookieBanner.$("button")
                .shouldBe(visible)
                .click();
//        if (cookieBanner.isDisplayed()) {
//            cookieBanner.$("button").click();
//        }

//        $("button[class*='_search_icon_']").click();
//        $("input[name = 'search']")
        $(byPlaceholder("Найти событие, артиста или место"))
                .shouldBe(visible)
                .shouldHave(attribute("placeholder", "Найти событие, артиста или место"))
                .setValue("концерт");
    }
}
