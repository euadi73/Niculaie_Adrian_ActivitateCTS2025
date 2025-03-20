package clase;

public class ARezervare {
    private String numeClient;
    private int nrPersoane;
    private String data;
    private String ora;

    public ARezervare(String numeClient, int nrPersoane, String data, String ora) {
        this.numeClient = numeClient;
        this.nrPersoane = nrPersoane;
        this.data = data;
        this.ora = ora;
    }

    public abstract void descriere();

    public ARezervare copiaza(){

    }
}
