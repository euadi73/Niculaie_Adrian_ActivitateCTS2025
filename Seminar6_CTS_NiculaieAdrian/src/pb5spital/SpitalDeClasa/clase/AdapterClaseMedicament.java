package pb5spital.SpitalDeClasa.clase;

public class AdapterClaseMedicament extends MedicamentSpital implements iMedicamentFarmacie{

    public AdapterClaseMedicament(float pret, String num){
        super(pret, nume);

    }
    @Override
    public void cumparaMedicament(){
        super.achizitioneazaMedicament();
    }
}
