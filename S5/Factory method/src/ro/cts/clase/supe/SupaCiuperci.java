package ro.cts.clase.supe;

import ro.cts.clase.model.FelDeMancare;

public class SupaCiuperci extends FelDeMancare {
    private int cantitate;

    public SupaCiuperci(float pret, float calorii, int cantitate) {
        super(pret, calorii);
        this.cantitate = cantitate;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(super.toString() + "SupaCiuperci{");
        sb.append("cantitate=").append(cantitate);
        sb.append('}');
        return sb.toString();
    }
}
