package Suporte;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;

public class Screenshot {
    public static void tirar(WebDriver driver, String arquivo){
        File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(screenshot, new File(arquivo));
        }catch (Exception e){
            System.out.println("Houveram problemas ao copiar arquivo para a pasta" + e.getMessage() + "Validar_pesquisa_de_valor_valido_na_lupa.png");
        }
    }
}
