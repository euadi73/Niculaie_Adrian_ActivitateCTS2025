package ro.cts.clase;

import java.util.Arrays;

public class Angajat extends Aplicant {
	private String ocupatie;
	private int salariu;
	private static final int SUMA_FINANTATA = 100; // Valoare exemplu, se poate modifica

	public Angajat(String nume, String prenume, int varsta, int punctaj, int nrProiecte, String[] denumireProiecte, int salariu, String ocupatie) {
		super(nume, prenume, varsta, punctaj, nrProiecte, denumireProiecte);
		this.salariu = salariu;
		this.ocupatie = ocupatie;
	}

	public Angajat() {
		this("", "", 0, 0, 0, new String[]{}, 0, "");
	}

	public String getOcupatie() {
		return ocupatie;
	}

	public void setOcupatie(String ocupatie) {
		this.ocupatie = ocupatie;
	}

	public int getSalariu() {
		return salariu;
	}

	public void setSalariu(int salariu) {
		this.salariu = salariu;
	}

	public static int getSumaFinantata() {
		return SUMA_FINANTATA;
	}

	@Override
	public String toString() {
		return new StringBuilder()
				.append("Angajat: ")
				.append(super.toString())
				.append(", Ocupatie=").append(ocupatie)
				.append(", Salariu=").append(salariu)
				.toString();
	}

	public void afiseazaInformatiiFinantare() {
		System.out.println("Angajatul " + getNume() + " " + getPrenume() + " primeste " + SUMA_FINANTATA + " Euro/zi in proiect.");
	}
}
