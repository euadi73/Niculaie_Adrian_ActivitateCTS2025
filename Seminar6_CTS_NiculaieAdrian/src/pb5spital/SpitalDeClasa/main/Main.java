package pb5spital.SpitalDeClasa.main;

import pb5spital.SpitalDeClasa.clase.Farmacie;
import pb5spital.SpitalDeClasa.clase.iMedicamentFarmacie;
import pb5spital.classes.MedicamentFarmacie;
import pb5spital.classes.MedicamentSpital;

public class Main {

    public static void main(String[] args){
        Farmacie farmacie = new Farmacie("Catena");
        iMedicamentFarmacie medicamentFarmacie = new MedicamentFarmacie(100, "Paduden" , true);

        farmacie.vindeMedicament(medicamentFarmacie);

        MedicamentSpital medicamentSpital = new MedicamentSpital(19, "Nurofen");
        farmacie.vindeMedicament(medicamentSpital);
    }


}
