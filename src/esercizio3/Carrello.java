package esercizio3;

import java.util.Arrays;

public class Carrello {

    //    ATTRIBUTES
    private Cliente clientRef;
    private Articolo[] articlesList;
    private int total;

    //    CONSTRUCTOR
    public Carrello(Cliente clientRef, Articolo[] articlesList) {
        this.clientRef = clientRef;
        this.articlesList = articlesList;
        this.total = showTotal(articlesList);
    }

    //    METHODS
    public int showTotal(Articolo[] articleList) {
        for (int i = 0; i < articleList.length; i++) {
            total += articleList[i].getPrice();
        }
        return total;
    }

    @Override
    public String toString() {
        return "Carrello{" +
                "clientRef=" + clientRef +
                ", articlesList=" + Arrays.toString(articlesList) +
                ", total=" + total +
                '}';
    }
}
