import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SimpleJUnitTest {
    @BeforeAll
    static void beforeAll(){
        Configuration.browserSize = "1920x1080";

    }
    @Test

    void fillFormTest() {

        Configuration.holdBrowserOpen = true;
        open("https://demoqa.com/text-box");
        $("#userName").setValue("Any name");
        $("#userEmail").setValue("airplay1x6@gmail.com");
        $("#currentAddress").setValue("Any address");
        $("#permanentAddress").setValue("Any per address");
        $("#submit").click();
     //   $("[id=search]").shouldHave(text("https://selenide.org"));
    }
}
