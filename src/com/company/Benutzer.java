package com.company;

import java.util.List;

public class Benutzer {

    private String vorName;
    private String nachName;
    private List<Sport> sport;

    //constructor
    public Benutzer(String vorName, String nachName, List<Sport> sport) {
        this.vorName = vorName;
        this.nachName = nachName;
        this.sport = sport;
    }
    //getters, setters
    public String getVorName() {
        return vorName;
    }

    public void setVorName(String vorName) {
        this.vorName = vorName;
    }

    public String getNachName() {
        return nachName;
    }

    public void setNachName(String nachName) {
        this.nachName = nachName;
    }

    public List<Sport> getSport() {
        return sport;
    }

    public void setSport(List<Sport> sport) {
        this.sport = sport;
    }

    /**
     *
     * @return timpul total pe care un Benutzer il acumuleaza facand toate tipurile de sport
     */
    //calculam timpul total pe care un Benutzer il acumuleaza facand toate tipurile de sport
    public double kalkuliereZeit(){
        double sum = 0;
        for (Sport x:sport)
        {
            sum = sum + x.kalkuliereZeit();
        }
        return sum;
    }

    /**
     *
     * @param sport1 lista prin care iteram pt a afla timpul pe care un Benutzer il acumuleaza in timp ce face un anumit tip de sport
     * @return timpul total de facut sport al unui Benutzer
     */
    //calculam timpul pe care un Benutzer il acumuleaza in timp ce face un anumit tip de sport
    public double kalkuliereZeit(Sport sport1){
        double sum = 0;
        for (Sport x:sport){
            if (x.getClass() == sport1.getClass())
                sum += x.kalkuliereZeit();
        }
        return sum;

    }

    /**
     *
     * @return timpul mediu petrecut facand sport al unui Benutzer
     */
    //calculam timpul mediu petrecut facand sport al unui Benutzer
    public double Durchschnittzeit(){
        return kalkuliereZeit() / sport.size();
    }

}
