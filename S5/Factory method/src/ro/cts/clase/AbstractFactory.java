package ro.cts.clase;

import ro.cts.clase.model.FelDeMancare;
import ro.cts.clase.model.TipFelDeMancare;

public interface AbstractFactory {
    public FelDeMancare creareFelDeMancare(TipFelDeMancare tipFelDeMancare, float pret, float calorii);
}
