import registry.Autoritate;
import registry.Reglementare;

public class MainRegistry {

    public static void main(String[] args) {
        Autoritate autoritate = Autoritate.getInstance("Autoritate", "www.autoritate.ro");
        Reglementare reglementare1 = autoritate.reglementeazaModel("Dacia Logan");
        Reglementare reglementare2 = autoritate.reglementeazaModel("Tesla Cybertruck");

        System.out.println(reglementare1);
        System.out.println(reglementare2);

        Reglementare reglementare3 = autoritate.reglementeazaModel("Dacia Logan");
        System.out.println(reglementare3);//nrReglementare = 1 pt ca avem deja dacia logan. dc avem 3 insemna ca nu am facut cv corect
    }
}

//la test nu o sa fie scris eager thread safe etc,