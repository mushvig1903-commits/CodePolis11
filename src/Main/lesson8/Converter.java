package Main.lesson8;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class Converter {
    public static void main(String[] args) {
        System.out.println("Valuta Mubadilesi");
        CurrencyConverter.getCommissionRate();// 1%

        Currency usd = new USD();
        Currency eur = new EUR();

        double usdAmount = 100;
        double eurAmount = 50;

        System.out.println("Vergi tutulduqdan sonra qaytarılacaq qiymət");
        System.out.println(usdAmount + " USD → " + usd.convertToAzn(usdAmount) + " AZN");
        System.out.println(eurAmount + " EUR → " + eur.convertToAzn(eurAmount) + " AZN");

        String currentDirectory = System.getProperty("user.dir");
        File htmlFile = new File(currentDirectory + "/index.html");

        if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
            try {
                // Faylı URI olaraq açmaq
                URI uri = htmlFile.toURI();
                Desktop.getDesktop().browse(uri);
                System.out.println("Frontend brauzerdə açıldı: " + uri);
            } catch (IOException e) {
                System.err.println("Brauzeri açmaq mümkün olmadı. Xəta: " + e.getMessage());
            }
        } else {
            System.out.println("Sistem brauzer əməliyyatını dəstəkləmir.");
            System.out.println("Zəhmət olmasa, faylı əl ilə açın: " + htmlFile.getAbsolutePath());
        }
    }
}
