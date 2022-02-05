package cloud.autotests.tests;

import cloud.autotests.helpers.DriverUtils;
import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.title;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;


public class GeneratedTests extends TestBase {
    @Test
    @Description("Soon to be implemented by you (or QA.GURU engineers)")
    @DisplayName("Open Success story")
    void generatedTest() {
        step("Open 'https://www.veeam.com/ru'", () -> {
            step("// todo: just add selenium action");
        });

        step("press Success story button", () -> {
            step("// todo: just add selenium action");
        });

        step("type \"biocad\"", () -> {
            step("// todo: just add selenium action");
        });

        step("open first link", () -> {
            step("// todo: just add selenium action");
        });

        step("download PDF", () -> {
            step("// todo: just add selenium action");
        });

        step("check that the page contains BIOCAD and Veeam", () -> {
            step("// todo: just add selenium action");
        });
    }

    @Test
    @Description("Autogenerated test")
    @DisplayName("Page title should have header text")
    void titleTest() {
        step("Open url 'https://www.veeam.com/ru'", () ->
            open("https://www.veeam.com/ru"));

        step("Page title should have text 'Veeam Software — эффективная стратегия защиты данных'", () -> {
            String expectedTitle = "Veeam Software — эффективная стратегия защиты данных";
            String actualTitle = title();

            assertThat(actualTitle).isEqualTo(expectedTitle);
        });
    }

    @Test
    @Description("Autogenerated test")
    @DisplayName("Page console log should not have errors")
    void consoleShouldNotHaveErrorsTest() {
        step("Open url 'https://www.veeam.com/ru'", () ->
            open("https://www.veeam.com/ru"));

        step("Console logs should not contain text 'SEVERE'", () -> {
            String consoleLogs = DriverUtils.getConsoleLogs();
            String errorText = "SEVERE";

            assertThat(consoleLogs).doesNotContain(errorText);
        });
    }
}