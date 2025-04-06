package pb5spital.SpitalDeClasa.clase;

public class MedicamentFarmacie implements iMedicamentFarmacie{
    private float pret;
    private String nume;
    private boolean esteInStoc;


    public MedicamentFarmacie(float pret, String nume, boolean esteInStoc) {
        this.pret = pret;
        this.nume = nume;
        this.esteInStoc = esteInStoc;
    }

    public void cumparaMedicament(){
        if(this.esteInStoc){
            System.out.println("Medicamentul" + this.nume + " a fost achitionat cu pretul de " + this.pret + " RON");
        }else {
            System.out.println("Medicamentul" + this.nume + " nu este in stoc");
        }
    }
}
