package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	Fussball f1 = new Fussball();
    Basketball b1 = new Basketball();
    Fussball f2 = new Fussball();
    ArrayList<Sport> sportList = new ArrayList<>();
    sportList.add(f1);
    sportList.add(f2);
    sportList.add(b1);
    Benutzer daria = new Benutzer("Lupsa", "Daria", sportList);

        System.out.println(daria.kalkuliereZeit());
        System.out.println(daria.kalkuliereZeit(b1));
        System.out.println(daria.Durchschnittzeit());


    }
}
