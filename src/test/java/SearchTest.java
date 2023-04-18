import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SearchTest {

    @Test
    void succesfulSearchTest() {
        Configuration.holdBrowserOpen = true;
        open("https://google.com");
        $("[name=q]").setValue("github").pressEnter();
        $("[id=search]").shouldHave(Condition.text("github.com"));
    }


}
