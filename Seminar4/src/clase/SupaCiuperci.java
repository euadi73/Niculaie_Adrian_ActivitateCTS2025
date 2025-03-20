package clase;

public class SupaCiuperci extends Supa {
    private double cantitateCiuperci;

    public SupaCiuperci(int gramaj, double pretPerSutaGr, String ingrediente, double cantitateCiuperci){
        super(gramaj,pretPerSutaGr,ingrediente);
        this.cantitateCiuperci=cantitateCiuperci;
    }

    @Override
    public double calculPret() {
        return super.calculPret()+(cantitateCiuperci/100)*getPretPerSutaGr();
    }

    @Override
    public void preparareSupa(){
        System.out.println("clase.Supa de ciuperci cu cantitate de ciuperci " +cantitateCiuperci+ " este gata");

    }

}
