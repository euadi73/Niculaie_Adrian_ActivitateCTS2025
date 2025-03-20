package clase;

public class SupaLegume extends Supa {
    private double gramajCrutoane;

    public SupaLegume(int gramaj, double pretPerSutaGr, String ingrediente){
        super(gramaj,pretPerSutaGr,ingrediente);
        this.gramajCrutoane=gramajCrutoane;
    }

    @Override
    public double calculPret() {
        return super.calculPret()+(gramajCrutoane/100)*getPretPerSutaGr()*2;
    }


    @Override
    public void preparareSupa(){
        System.out.println("clase.Supa de legume cu "+gramajCrutoane+" grame de crutoane este gata");
    }
}
