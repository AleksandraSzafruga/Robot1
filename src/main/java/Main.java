import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Robot robot = new Robot("R2D2");

        robot.włączRobota();
        robot.poruszRobota(RuchRobota.RUCH_REKA_LEWA);
        robot.wyłączRobota();
        robot.poruszRobota(RuchRobota.SKOK);
        robot.włączRobota();
        robot.naładujRobota();
        robot.poruszRobota(RuchRobota.SKOK);
        robot.poruszRobota(RuchRobota.SKOK);
        robot.poruszRobota(RuchRobota.SKOK);
        robot.poruszRobota(RuchRobota.SKOK);
        robot.poruszRobota(RuchRobota.SKOK);
        robot.poruszRobota(RuchRobota.SKOK);
        robot.poruszRobota(RuchRobota.SKOK);
        robot.poruszRobota(RuchRobota.SKOK);

        Scanner scanner = new Scanner(System.in);
        String komenda;

        do {
            System.out.println("Podaj komendę:");
            System.out.println(" - ruch [KROK_LEWA, KROK_PRAWA, RUCH_REKA_LEWA, RUCH_REKA_PRAWA, SKOK]");
            System.out.println(" - naładuj");
            System.out.println(" - włącz");
            System.out.println(" - wyłącz");
            komenda = scanner.nextLine();

            if (komenda.equalsIgnoreCase("włącz")) {
                robot.włączRobota();
            } else if (komenda.equalsIgnoreCase("wyłącz")) {
                robot.wyłączRobota();
            } else if (komenda.equalsIgnoreCase("naładuj")){
                robot.naładujRobota();
            } else if (komenda.startsWith("ruch")) {
                String[] slowa = komenda.split(" "); //dzielę komnedę na słowa
                String rodzajRuchu = slowa[1]; //wyciągam słowo, w którym znajduje się rodzaj ruchi

                //String -> enum odpowiedniego typu
                RuchRobota ruch = RuchRobota.valueOf(rodzajRuchu.toUpperCase()); //konwersja
                robot.poruszRobota(ruch); //wykonanie ruchu
            } else if (!komenda.equalsIgnoreCase("quit")){
                System.out.println("Nie rozpoznaję komendy");
            }
        } while (!komenda.equalsIgnoreCase("quit"));
    }
}
