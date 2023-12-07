package tests;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static io.appium.java_client.AppiumBy.*;

public class AndroidTest extends TestBase {
    @Test
    void firstTest() {
        $(accessibilityId("Search Wikipedia")).click();
        $(id("org.wikipedia.alpha:id/search_src_text")).sendKeys("Appium");
        $$(id("org.wikipedia.alpha:id/page_list_item_title")).shouldHave(sizeGreaterThan(0));
    }

    @Test
    @Tag("android")
    void secondTest() {
        $(accessibilityId("Search Wikipedia")).click();
        $(id("org.wikipedia.alpha:id/search_src_text")).sendKeys("Appium");
        $$(id("org.wikipedia.alpha:id/page_list_item_title")).shouldHave(sizeGreaterThan(0));
        $(id("org.wikipedia.alpha:id/page_list_item_title")).click();
        $(name("GO BACK")).shouldBe(exist);
        //$(id("org.wikipedia.alpha:id/page_contents_container")).shouldBe(exist);
    }
}
