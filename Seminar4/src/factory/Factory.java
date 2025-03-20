package factory;

public class Factory {
    private int gramaj;
    private double pretPerSutaDeGr;
    public Supa getSupa(TipuriSupe supe, String ingrediente, double gramajCrutoane)
        switch(supe){
        case LEGUME:
            SupaLegume supaLegume = new SupaLegume(gramaj, pretPerSutaDeGr, ingrediente, gramajCrutoane);
            return supaLegume;
    }
}
