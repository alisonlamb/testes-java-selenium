package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import pages.AutomationExercisePage;
import runner.RunCucumberTest;

public class AutomationExerciseSteps extends RunCucumberTest {

    AutomationExercisePage automationExercisePage = new AutomationExercisePage(driver);

    @Dado("que acesso o site Automation Exercise")
    public void queAcessoOSiteAutomationExercise() {
        automationExercisePage.acessarSite();
    }

    @Dado("que clico no botão {string} na página Automation Exercise")
    public void queClicoNoBotãoNaPáginaAutomationExercise(String button) {
        automationExercisePage.clickButton(button);
    }

    @Quando("preencho o campo {string} com {string}")
    public void preenchoOCampoCom(String fieldName, String value) {
        automationExercisePage.fillField(fieldName, value);
    }

    @Então("a mensagem {string} é exibida")
    public void aMensagemÉExibida(String msg) {
        automationExercisePage.validarMsgErro(msg);
    }
}
