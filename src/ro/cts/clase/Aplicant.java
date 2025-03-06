package ro.cts.clase;

public abstract class Aplicant {
	protected String nume;
	protected String prenume;
	protected int varsta;
	protected int punctaj;
	protected int nrProiecte;
	protected String[] denumireProiecte;

	public Aplicant() {
		this("", "", 0, 0, 0, new String[]{});
	}

	public Aplicant(String nume, String prenume, int varsta, int punctaj, int nrProiecte, String[] denumireProiecte) {
		this.nume = nume;
		this.prenume = prenume;
		this.varsta = varsta;
		this.punctaj = punctaj;
		this.nrProiecte = nrProiecte;
		this.denumireProiecte = denumireProiecte;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public String getPrenume() {
		return prenume;
	}

	public void setPrenume(String prenume) {
		this.prenume = prenume;
	}

	public int getVarsta() {
		return varsta;
	}

	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}

	public int getPunctaj() {
		return punctaj;
	}

	public void setPunctaj(int punctaj) {
		this.punctaj = punctaj;
	}

	public int getNrProiecte() {
		return nrProiecte;
	}

	public void setNrProiecte(int nrProiecte, String[] denumireProiecte) {
		this.nrProiecte = nrProiecte;
		this.denumireProiecte = denumireProiecte;
	}

	public void afiseazaStatut() {
		String mesaj = (punctaj > 80) ? "a fost acceptat." : "nu a fost acceptat.";
		System.out.println("Aplicantul " + nume + " " + prenume + " " + mesaj);
	}

	public abstract void afiseazaInformatiiFinantare();
}
