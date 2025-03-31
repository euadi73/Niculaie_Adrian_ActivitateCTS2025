package ro.cts.clase.supe;

import ro.cts.clase.model.FelDeMancare;

public class SupaLegume extends FelDeMancare {
    private int cantitate;

    public SupaLegume(float pret, float calorii, int cantitate) {
        super(pret, calorii);
        this.cantitate = cantitate;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(super.toString() + "SupaLegume{");
        sb.append("cantitate=").append(cantitate);
        sb.append('}');
        return sb.toString();
    }
}
