import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxTests {

    @BeforeAll
    static void beforeAll(){
        Configuration.browserSize = "1920X1080";
        Configuration.baseUrl = "https://demoqa.com";
    }

    @Test
    void fillFormTest(){
        open("/text-box");

        $("[id=userName]").setValue("Dmitrii Polizhai");    //или можно указать как $("#username")
        $("#userEmail").setValue("Dmitrii@Polizhai.com");
        $("#currentAddress").setValue("Puwkina street");
        $("#permanentAddress").setValue("Kolotuwkina appartments");

        $("#submit").scrollTo().click();

        $("#output").shouldHave(text("Dmitrii Polizhai"), text("Dmitrii@Polizhai.com"),
        text("Puwkina street"), text("Kolotuwkina appartments"));
    }
}
