import esercizio1.Rettangolo;
import esercizio2.SIM;
import esercizio3.Articolo;
import esercizio3.Carrello;
import esercizio3.Cliente;

import java.util.Arrays;

import static esercizio1.Rettangolo.stampaDueRettangoli;

public class Main {
    public static void main(String[] args) {

//        ESERCIZIO 1
        System.out.println("ESERCIZIO 1");
        Rettangolo rettangolo1 = new Rettangolo(6, 4);
        rettangolo1.stampaRettangolo();

        Rettangolo rettangolo2 = new Rettangolo(3, 2);
        rettangolo2.stampaRettangolo();

        stampaDueRettangoli(rettangolo1, rettangolo2);

//        ESERCIZIO 2
        System.out.println("ESERCIZIO 2");
        SIM sim1 = new SIM("1234567890");
        System.out.println("sim1 è " + sim1);

//        ESERCIZIO 3
        System.out.println("ESERCIZIO 3");
        Cliente cliente1 = new Cliente("AAAA", "Fabio Gilardi", "bobby@gmail.com", "06/03/2024");
        Articolo articolo1 = new Articolo("BBBB", "Bello", 10, 20);
        Articolo articolo2 = new Articolo("CCCC", "Bello", 15, 10);
        Articolo articolo3 = new Articolo("DDDD", "Bello", 7, 4);
        Articolo[] articleArray = {articolo1, articolo2, articolo3};
        Carrello cart = new Carrello(cliente1, articleArray);
        System.out.println(cliente1);
        System.out.println(Arrays.toString(articleArray));
        System.out.println(cart);

    }
}
