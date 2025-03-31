package ro.cts.clase;

public class RezervareBuilder implements AbstractBuilder {

    private Rezervare rezervare;

    public RezervareBuilder(String numeClient) {//unde creem obiectul acolo si primim atributele obligatorii
        rezervare = new Rezervare(
                numeClient, false, false, false, "fara muzica");
    }

    public RezervareBuilder setHasAsezareGeam(boolean hasAsezareGeam) {
        rezervare.setHasAsezareGeam(hasAsezareGeam);
        return this;
    }

    public RezervareBuilder setHasScauneErg(boolean hasScauneErg) {
        rezervare.setHasScauneErg(hasScauneErg);
        return this;

    }

    public RezervareBuilder setHasMasaDecorata(boolean hasMasaDecorata) {
        rezervare.setHasMasaDecorata(hasMasaDecorata);
        return this;

    }

    public RezervareBuilder setGenMuzica(String genMuzica) {
        rezervare.setGenMuzica(genMuzica);
        return this;

    }

    @Override
    public Rezervare build() {
        return rezervare;
    }
}
