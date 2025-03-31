package ro.cts.clase;

public class RezervareBuilder implements AbstractBuilder {

    private String numeClient;
    private boolean hasAsezareGeam;
    private boolean hasScauneErg;
    private boolean hasMasaDecorata;
    private String genMuzica;

    //se face dc userul nu le seteaza prin setteri sa nu fie gol
    public RezervareBuilder() {
        hasAsezareGeam = false;
        hasScauneErg = false;
        hasMasaDecorata = false;
        genMuzica = "fara muzica";

    }

    //folosim return this - pt a face apelul in cascada
    public RezervareBuilder setNumeClient(String numeClient) {
        this.numeClient = numeClient;
        return this;
    }

    public RezervareBuilder setHasAsezareGeam(boolean hasAsezareGeam) {
        this.hasAsezareGeam = hasAsezareGeam;
        return this;

    }

    public RezervareBuilder setHasScauneErg(boolean hasScauneErg) {
        this.hasScauneErg = hasScauneErg;
        return this;

    }

    public RezervareBuilder setHasMasaDecorata(boolean hasMasaDecorata) {
        this.hasMasaDecorata = hasMasaDecorata;
        return this;

    }

    public RezervareBuilder setGenMuzica(String genMuzica) {
        this.genMuzica = genMuzica;
        return this;

    }

    //aici se creeaza obiectul, aici se da atributul nume pt ca e obligatoriu
    @Override
    public Rezervare build(String numeClient) {
        return new Rezervare(numeClient, hasAsezareGeam, hasScauneErg, hasMasaDecorata, genMuzica);
    }

}
