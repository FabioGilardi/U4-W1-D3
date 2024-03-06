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

        System.out.println("L'area dei due rettangoli è " + (rett1.area() + rett2.area()));
        System.out.println("Il perimetro dei due rettangoli è " + (rett1.peremeter() + rett2.peremeter()));
    }


    public int area() {
        return base * height;
    }

    public int peremeter() {
        return (base + height) * 2;
    }

    public void stampaRettangolo() {
        System.out.println("L'area del rettangolo è " + this.area());
        System.out.println("Il perimetro del rettangolo è " + this.peremeter());
    }
}
