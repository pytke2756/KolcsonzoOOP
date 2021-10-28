package hu.petrik.kolcsonzooop;

public class Konyv implements Kolcsonozheto{
    private String cim, szerzo, isbn;

    public Konyv(String szerzo, String cim, String isbn) {
        this.cim = cim;
        this.szerzo = szerzo;
        this.isbn = isbn;
    }

    @Override
    public String megjelenitendoNev() {
        return String.format("%s - %s",this.szerzo, this.cim);
    }

    @Override
    public int meddigKolcsonozheto() {
        return 14;
    }
}
