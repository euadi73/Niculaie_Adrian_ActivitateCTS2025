public class Main {
    public static void main(String[] args){
        Factory factory = new Factory(200, 10);
        Supa supa = factory.getSupa(TipuriSupe.LEGUME, "Bors, legume", 100);
        supa.preparareSupa();
        Supa supaVita = factory.getSupa(TipuriSupe.VITA, "Vita, bors", 150);
        SupaVita.preparareSupa();
        Supa supaCiuperci = factory.getSupa(TipuriSupe.CIUPERCI, "Ciuperci", 140);
        supaCiuperci.preparareSupa();
    }
}