package clase;

public class SupaVita extends Supa {
    private double pretExtra;
    public SupaVita(int gramaj, double pretPerSutaGr, String ingrediente,  double pretExtra) {
        super(gramaj, pretPerSutaGr, ingrediente);
        this.pretExtra = pretExtra;
    }

    @Override
    public void preparareSupa() {
        System.out.println("clase.Supa de vita comandata cu smantana cu pretul de  "+pretExtra+" este gata");
    }
}
