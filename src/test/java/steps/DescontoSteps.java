package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import pages.HomePageQazando;
import runner.RunCucumberTest;

public class DescontoSteps extends RunCucumberTest {

    HomePageQazando homePageQazando = new HomePageQazando(driver);

    @Dado("que estou no site da qazando")
    public void que_estou_no_site_da_qazando() {
        homePageQazando.acessarSite();
    }

    @Quando("preencho meu email")
    public void preencho_meu_email() {
        homePageQazando.preencherEmail("teste@teste.com");
    }

    @Quando("clico em ganhar cupom")
    public void clico_em_ganhar_cupom() throws InterruptedException {
        homePageQazando.clicarGanharCupom();
    }

    @Então("eu vejo o código de desconto")
    public void eu_vejo_o_código_de_desconto() {
        homePageQazando.validarTextoCupomDesconto("QAZANDO15OFF");
    }

}
