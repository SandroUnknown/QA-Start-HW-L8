package page.components;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byTagAndText;
import static com.codeborne.selenide.Selenide.$;

public class TableResponsive {

    public void checkResult(String key, String value) {
        $(".table-responsive").$(byTagAndText("td", key)).sibling(0).shouldHave(text(value));
    }
}