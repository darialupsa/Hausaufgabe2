package com.company;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class BenutzerTest {

    @Test
    void kalkuliereZeit() {
        Fussball f1 = new Fussball();
        Basketball b1 = new Basketball();
        Fussball f2 = new Fussball();
        ArrayList<Sport> sportList = new ArrayList<>();
        sportList.add(f1);
        sportList.add(f2);
        sportList.add(b1);
        Benutzer daria = new Benutzer("Lupsa", "Daria", sportList);

        assertEquals(daria.kalkuliereZeit(), 185);
    }

    @Test
    void testKalkuliereZeit() {
        Fussball f1 = new Fussball();
        Basketball b1 = new Basketball();
        Fussball f2 = new Fussball();
        ArrayList<Sport> sportList = new ArrayList<>();
        sportList.add(f1);
        sportList.add(f2);
        sportList.add(b1);
        Benutzer daria = new Benutzer("Lupsa", "Daria", sportList);

        assertEquals(daria.kalkuliereZeit(b1), 55);
    }

    @Test
    void durchschnittzeit() {
        Fussball f1 = new Fussball();
        Basketball b1 = new Basketball();
        Fussball f2 = new Fussball();
        ArrayList<Sport> sportList = new ArrayList<>();
        sportList.add(f1);
        sportList.add(f2);
        sportList.add(b1);
        Benutzer daria = new Benutzer("Lupsa", "Daria", sportList);

        assertEquals(daria.Durchschnittzeit(), (double)185/3);
    }
}