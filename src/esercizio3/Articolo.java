package esercizio3;

public class Articolo {

    //    ATTRIBUTES
    private String articleCode;
    private String articleDescription;
    private int price;
    private int storageN;

    //    CONSTRUCTORS
    public Articolo(String articleCode, String articleDescription, int price, int storageN) {
        this.articleCode = articleCode;
        this.articleDescription = articleDescription;
        this.price = price;
        this.storageN = storageN;
    }


    //    METHODS
    @Override
    public String toString() {
        return "Articolo{" +
                "articleCode='" + articleCode + '\'' +
                ", articleDescription='" + articleDescription + '\'' +
                ", price=" + price +
                ", storageN=" + storageN +
                '}';
    }

    public int getPrice() {
        return price;
    }
}
