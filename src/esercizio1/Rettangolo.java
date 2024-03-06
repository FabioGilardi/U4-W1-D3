package esercizio1;

public class Rettangolo {

    // ATTRIBUTES
    private int base;
    private int height;

    // CONSTRUCTOR
    public Rettangolo(int base, int height) {
        this.base = base;
        this.height = height;
    }

    // METHODS
    public static void stampaDueRettangoli(Rettangolo rett1, Rettangolo rett2) {
        rett1.stampaRettangolo();
        rett2.stampaRettangolo();

        System.out.println("L'area dei due rettangoli è " + (rett1.area(rett1.base, rett1.height) + rett2.area(rett2.base, rett2.height)));
        System.out.println("Il perimetro dei due rettangoli è " + (rett1.peremeter(rett1.base, rett1.height) + rett2.peremeter(rett2.base, rett2.height)));
    }


    public int area(int base, int height) {
        return base * height;
    }

    public int peremeter(int base, int height) {
        return (base + height) * 2;
    }

    public void stampaRettangolo() {
        System.out.println("L'area del rettangolo è " + this.area(base, height));
        System.out.println("Il perimetro del rettangolo è " + this.peremeter(base, height));
    }
}
