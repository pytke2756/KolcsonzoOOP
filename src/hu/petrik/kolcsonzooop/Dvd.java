package hu.petrik.kolcsonzooop;

public class Dvd implements Kolcsonozheto, Comparable<Dvd>{
    private String cim;
    private int hossz;

    public Dvd(String cim, int hossz) {
        this.cim = cim;
        this.hossz = hossz;
    }

    @Override
    public String megjelenitendoNev() {
        return String.format("%s (%d perc)",this.cim, this.hossz);
    }

    @Override
    public int meddigKolcsonozheto() {
        return 7;
    }

    @Override
    public int compareTo(Dvd o) {
        int eredmeny = this.hossz - o.hossz;
        if (eredmeny == 0){
            eredmeny = this.cim.compareTo(o.cim);
        }
        return eredmeny;
    }
}
