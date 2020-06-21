package be.apti.Livesessie21_06_2020.oefening3;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Schrijver {
    private String naam;
    private Set<Boek> boeken;

    public Schrijver(String naam) {
        this.naam = naam;
        this.boeken = new TreeSet<Boek>();
    }

    public void addBoek(Boek boek){
        boeken.add(boek);
    }

    public String boekenToString(){
        StringBuilder stringBuilder = new StringBuilder();
        for(Boek boek : boeken){
            stringBuilder.append(boek.toString() + "\n");
        }
        return stringBuilder.toString();
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }
}
