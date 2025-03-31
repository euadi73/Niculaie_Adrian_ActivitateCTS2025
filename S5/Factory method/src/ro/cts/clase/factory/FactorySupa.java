package ro.cts.clase.factory;

import ro.cts.clase.AbstractFactory;
import ro.cts.clase.model.FelDeMancare;
import ro.cts.clase.model.TipFelDeMancare;
import ro.cts.clase.supe.SupaCiuperci;
import ro.cts.clase.supe.SupaLegume;
import ro.cts.clase.supe.Supe;

public class FactorySupa implements AbstractFactory {
    private int cantitate;

    public FactorySupa(int cantitate) {
        this.cantitate = cantitate;
    }

    public void setCantitate(int cantitate) {
        this.cantitate = cantitate;
    }

    @Override
    public FelDeMancare creareFelDeMancare(TipFelDeMancare tipFelDeMancare, float pret, float calorii) {
        switch ((Supe) tipFelDeMancare) {
            case LEGUME -> {
                return new SupaLegume(pret, calorii, cantitate);
            }
            case CIUPERCI -> {
                return new SupaCiuperci(pret, calorii, cantitate);
            }
            default -> {
                return null;
            }
        }
    }
}
