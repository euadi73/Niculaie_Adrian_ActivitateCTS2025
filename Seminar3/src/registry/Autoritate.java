package registry;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Autoritate {
    private String nume;
    private String webwite;
    private Map<String, Reglementare> map = new HashMap<>();
    static Autoritate instance = null;

    private Autoritate() {
    }

    private Autoritate(String nume, String webwite) {
        this.nume = nume;
        this.webwite = webwite;
    }

    @Override
    public String toString() {
        return "Autoritate{" +
                "nume='" + nume + '\'' +
                ", webwite='" + webwite + '\'' +
                '}';
    }

    public static Autoritate getInstance(String nume, String webwite) {
        if (instance == null) {
            instance = new Autoritate(nume, webwite);
        }
        return instance;
    }

    public Reglementare reglementeazaModel(String model) {
        if (!map.containsKey(model)) {
            map.put(model, new Reglementare(model, map.size() + 1, (new Date()).toString()));
        }
        return map.get(model);

    }

}