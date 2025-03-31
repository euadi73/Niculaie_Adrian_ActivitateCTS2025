package ro.cts.main;

import ro.cts.clase.deserturi.Deserturi;
import ro.cts.clase.factory.FactoryDesert;
import ro.cts.clase.factory.FactorySupa;
import ro.cts.clase.model.FelDeMancare;
import ro.cts.clase.supe.Supe;

public class Main {
    public static void main(String[] args) {
        FactorySupa factorySupe = new FactorySupa(255);

        FelDeMancare supaDeLegume = factorySupe.creareFelDeMancare(Supe.LEGUME, 28.99f, 230);
        factorySupe.setCantitate(265);
        FelDeMancare supaDeCiuperi = factorySupe.creareFelDeMancare(Supe.CIUPERCI, 32.99f, 288.9f);

        System.out.println(supaDeLegume);
        System.out.println(supaDeCiuperi);

        FactoryDesert factoryDesert = new FactoryDesert("visine");
        FelDeMancare papanasi = factoryDesert.creareFelDeMancare(Deserturi.PAPANASI, 31.99f, 300);
        FelDeMancare tiramisu = factoryDesert.creareFelDeMancare(Deserturi.TIRAMISU, 33.99f, 310);

        System.out.println(papanasi);
        System.out.println(tiramisu);
    }
}