package pb5spital.SpitalDeClasa.clase;

import pb5spital.classes.MedicamentFarmacie;

public class Farmacie {

    private String nume;

    public Farmacie(String nume) {
        this.nume = nume;
    }

    public static void vindeMedicament(iMedicamentFarmacie medicamentFarmacie){
        System.out.println("Farmacia" + this.nume " va ofera medicamentul:  ");
        medicamentFarmacie.cumparaMedicament();
    }

}
