package ro.cts.clase.factory;

import ro.cts.clase.AbstractFactory;
import ro.cts.clase.model.FelDeMancare;
import ro.cts.clase.model.TipFelDeMancare;
import ro.cts.clase.deserturi.Deserturi;
import ro.cts.clase.deserturi.Papanasi;
import ro.cts.clase.deserturi.Tiramisu;

public class FactoryDesert implements AbstractFactory {

    private String crema;

    public FactoryDesert(String crema) {
        this.crema = crema;
    }

    public void setCrema(String crema) {
        this.crema = crema;
    }

    @Override
    public FelDeMancare creareFelDeMancare(TipFelDeMancare tipFelDeMancare, float pret, float calorii) {
        switch ((Deserturi) tipFelDeMancare) {
            case TIRAMISU -> {
                return new Tiramisu(pret, calorii, crema);
            }
            case PAPANASI -> {
                return new Papanasi(pret, calorii, crema);
            }
            default -> {
                return null;
            }
        }
    }



}
