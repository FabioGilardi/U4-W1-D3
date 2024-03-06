package esercizio2;

import java.util.Arrays;

public class SIM {

    //    ATTRIBUTES
    private String number;
    private int credit;
    private Calls[] last5Calls;

    //    CONSTRUCTOR
    public SIM(String number) {
        this.number = number;
        this.credit = 0;
        this.last5Calls = new Calls[0];
    }

    //    METHODS

    public static void printData(SIM sim) {
        System.out.println(sim);
    }

    @Override
    public String toString() {
        return "SIM{" +
                "number=" + number +
                ", credit=" + credit +
                ", last5Calls=" + Arrays.toString(last5Calls) +
                '}';
    }
}
