package stepDefinition;

import Suporte.Generator;
import Suporte.Screenshot;
import enums.AgiEnum;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.IconPage;
import util.Drivers;

public class AgiBankSteps {
    private WebDriver driver;
    private IconPage iconPage;


    @Dado("que estou na tela inicial do {string}")
    public void que_estou_na_tela_inicial_do(String blogDoAgi) {
        driver = Drivers.getDriver();
        driver.get(AgiEnum.valueOf(blogDoAgi).getVariacoes());
        iconPage = new IconPage(driver);
    }
    @Quando("eu escrever na lupa a palavra {string}")
    public void eu_escrever_na_lupa_a_palavra(String emprestimos) {
        WebElement botaoLupa = iconPage.getSearchIcon();
        botaoLupa.click();
        WebElement campoPesquisa = iconPage.getSearchField();
        campoPesquisa.sendKeys(AgiEnum.valueOf(emprestimos).getVariacoes());
        campoPesquisa.sendKeys(Keys.RETURN);

    }
    @Entao("o blogue retona informações sobre empréstimos")
    public void o_blogue_retona_informações_sobre_empréstimos() {
        WebElement campoTitulo = iconPage.titleField();
        String resultado = campoTitulo.getText();
        Assert.assertEquals("Resultados encontrados para: empréstimo", resultado);
        String screenshotArquivo = "src\\test\\java\\reports\\reports" + Generator.dataHoraParaArquivo() + "ValidarPesquisaDeValorValidoNaLupa.jpg";
        Screenshot.tirar(driver, screenshotArquivo);
    }

    @Quando("eu escrever na lupa {string} inválido")
    public void eu_escrever_na_lupa_inválido(String valor) {
        WebElement botaoLupa = iconPage.getSearchIcon();
        botaoLupa.click();
        WebElement campoPesquisa = iconPage.getSearchField();
        campoPesquisa.sendKeys(AgiEnum.valueOf(valor).getVariacoes());
        campoPesquisa.sendKeys(Keys.RETURN);
    }
    @Entao("o blogue retona {string}")
    public void o_blogue_retona(String erro) {
        WebElement erroPesquisa = iconPage.erroMessage();
        String msgErro = erroPesquisa.getText();
        Assert.assertEquals(AgiEnum.valueOf(erro).getVariacoes(),msgErro);
        String screenshotArquivo = "src\\test\\java\\reports\\reports" + Generator.dataHoraParaArquivo() + "ValidarPesquisaDeValorValidoNaLupa.jpg";
        Screenshot.tirar(driver, screenshotArquivo);
    }

    @Quando("pesquiso na lupa em branco")
    public void pesquiso_na_lupa_em_branco() {
        WebElement botaoLupa = iconPage.getSearchIcon();
        botaoLupa.click();
        WebElement campoPesquisa = iconPage.getSearchField();
        //campoPesquisa.sendKeys(AgiEnum.valueOf(valor).getVariacoes());
        campoPesquisa.sendKeys(Keys.RETURN);
    }

    @Entao("blogue retona {string}")
    public void blogue_retona(String msgVazia) {
        WebElement erroPesquisa = iconPage.MsgBranco();
        String msgErro = erroPesquisa.getText();
        Assert.assertEquals(AgiEnum.valueOf(msgVazia).getVariacoes(),msgErro);
        Screenshot.tirar(driver, "src\\test\\java\\reports\\reports" + Generator.dataHoraParaArquivo() + "ValidarPesquisaDeValorVazioNaLupa.jpg");
    }
}
