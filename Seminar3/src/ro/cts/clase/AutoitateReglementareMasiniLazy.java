package ro.cts.clase;

//amanam momentul initializarii pana o folosim
public class AutoitateReglementareMasiniLazy {
    private String nume;
    private String webSite;
    private int nrReglementari;
    private static AutoitateReglementareMasiniLazy instance = null;

    public AutoitateReglementareMasiniLazy() {
    }

    public AutoitateReglementareMasiniLazy(String nume, String webSite, int nrReglementari) {
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

    //dc avem multitheading, verif dc e null dar se pierde executia de pe ace thread, dupa se intoarce inapoi si iar intra in fir si constructorul se va face de 2 ori
    public static AutoitateReglementareMasiniLazy getInstance(String nume, String webSite) {
        if (instance == null) {
            instance = new AutoitateReglementareMasiniLazy(nume, webSite, 0);
            //multi aici declara instanta asa:
            // AutoitateReglementareMasiniLazy instance = new AutoitateReglementareMasiniLazy(nume, webSite, 0);
            //nu e corect pt ca o sa se faca de mai multe ori si incalcam singleton
        }
        return instance;
    }

    public static void setInstance(AutoitateReglementareMasiniLazy instance) {
        AutoitateReglementareMasiniLazy.instance = instance;
    }

    @Override
    public String toString() {
        return "AutoitateReglementareMasiniLazy{" +
                "nume='" + nume + '\'' +
                ", webSite='" + webSite + '\'' +
                ", nrReglementari=" + nrReglementari +
                '}';
    }
}