package de.sommer.verteiltesysteme.rmi.backend;

import java.io.Serializable;

public class Mitarbeiter implements Serializable {


    private int id;
    private String name;
    private String vorname;
    private int alter;
    private String abteilung;
    private double gehalt;

    public Mitarbeiter(int id, String name, String vorname, int alter, String abteilung, double gehalt) {
        this.id = id;
        this.name = name;
        this.vorname = vorname;
        this.alter = alter;
        this.abteilung = abteilung;
        this.gehalt = gehalt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getVorname() {
        return vorname;
    }

    public int getAlter() {
        return alter;
    }

    public String getAbteilung() {
        return abteilung;
    }

    public double getGehalt() {
        return gehalt;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    public void setAbteilung(String abteilung) {
        this.abteilung = abteilung;
    }

    public void setGehalt(double gehalt) {
        this.gehalt = gehalt;
    }

    @Override
    public String toString() {
        return "ID: " + id + "\n" +
               "Name: " + name + "\n" +
               "Vorname: " + vorname + "\n" +
               "Alter: " + alter + "\n" +
               "Abteilung: " + abteilung + "\n" +
               "Gehalt: " + gehalt;
    }


    
}
