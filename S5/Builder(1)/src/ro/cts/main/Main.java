package ro.cts.main;

import ro.cts.clase.*;

public class Main {
    public static void main(String[] args) {
        RezervareBuilder rezervareBuilder = new RezervareBuilder("Tudor");
        Rezervare rezervare = rezervareBuilder
                .setHasScauneErg(true)
                .setHasAsezareGeam(false)
                .setGenMuzica("manele")
                .build();

        System.out.println(rezervare.toString());

        Rezervare rezervare2 = rezervareBuilder
                .setHasScauneErg(false)
                .setHasAsezareGeam(false)
                .setGenMuzica("rock")
                .build();

        System.out.println(rezervare.toString());
        System.out.println(rezervare2.toString());
        //TODO acest tip de builder il folosim doar daca il folosim 1 sing data, pt ca cand modificam se modifica in ambele
    }
}

//TODO dc se modifica atributele si in 1 obiect, dc nu e static