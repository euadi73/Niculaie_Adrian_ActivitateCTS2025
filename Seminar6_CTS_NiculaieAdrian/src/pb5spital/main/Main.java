package pb5spital.main;


import pb5spital.classes.AdaptorMedicament;
import pb5spital.classes.MedicamentFarmacie;
import pb5spital.classes.MedicamentSpital;

public class Main {
    public static void vindeMedicament(MedicamentFarmacie medicamentFarmacie){
        System.out.println("Farmacia noastra va ofera medicamentul:  ");
        medicamentFarmacie.cumparaMedicament();
    }
    public static void main(String[] args) {
        MedicamentFarmacie medicamentFarmacie = new MedicamentFarmacie(40, "Parasinus", true);
        MedicamentFarmacie medicamentFarmacie1 = new MedicamentFarmacie(35, "Nurofen", true);

        vindeMedicament(medicamentFarmacie);
        vindeMedicament(medicamentFarmacie1);

        MedicamentSpital medicamentSpital = new MedicamentSpital(100 , "antibiotic 1");
        MedicamentSpital medicamentSpital1 = new MedicamentSpital(95 , "antibiotic 2");

        vindeMedicament(new AdaptorMedicament(medicamentSpital));
        vindeMedicament(new AdaptorMedicament(medicamentSpital2));
    }
}