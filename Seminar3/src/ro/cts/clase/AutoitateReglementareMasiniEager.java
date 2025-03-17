package ro.cts.clase;

public class AutoitateReglementareMasiniEager {
    private String nume;
    private String webSite;
    private int nrReglementari;
    private static AutoitateReglementareMasiniEager instance = new AutoitateReglementareMasiniEager("Autoritate Auto", "ww.autoritate.ro", 200);
    //init la momentul declararii - eager init

    public AutoitateReglementareMasiniEager() {
    }

    public AutoitateReglementareMasiniEager(String nume, String webSite, int nrReglementari) {
        this.nume = nume;
        this.webSite = webSite;
        this.nrReglementari = nrReglementari;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getWebSite() {
        return webSite;
    }

    public void setWebSite(String webSite) {
        this.webSite = webSite;
    }

    public void reglementeazaModel(String name) {
        nrReglementari++;
    }

    public static AutoitateReglementareMasiniEager getInstance() {
        return instance;
    }

    public static void setInstance(AutoitateReglementareMasiniEager instance) {
        AutoitateReglementareMasiniEager.instance = instance;
    }

    @Override
    public String toString() {
        return "AutoitateReglementareMasiniEager{" +
                "nume='" + nume + '\'' +
                ", webSite='" + webSite + '\'' +
                ", nrReglementari=" + nrReglementari +
                '}';
    }
}