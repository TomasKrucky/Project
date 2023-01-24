/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cz.itnetwork.zaverecnaprace;

import java.util.ArrayList;

/**
 *
 * @author Tomáš Krucký
 */
public class Databaze {
    
    /** Vytvoření instance databáze datového typu Uzivatel. */
    private final ArrayList<Klient> data = new ArrayList<>();
    
    /** Metoda Databaze pro přidání uživatele do paměti.
     * @param krestniJmeno
     * @param prijmeni
     * @param vek
     * @param telefoniCislo */
    public void pridejKlienta(String krestniJmeno, String prijmeni, int vek, int telefoniCislo) {
        data.add(new Klient(krestniJmeno, prijmeni, vek, telefoniCislo));
    }
    
    /** Metoda Databaze pro vyhledání všech uživatelů v paměti.
     * @return  */
    public ArrayList<Klient> vyhledejVsechnyKlienty(){
        ArrayList<Klient> nalezeni = new ArrayList();
            for(Klient u : data)
                nalezeni.add(u);
                    return nalezeni;
    
    }
    
    /** Metoda Databaze pro vyhledání konrétního uživatele v paměti.
     * @param krestniJmeno
     * @param prijmeni
     * @return  */
    public ArrayList<Klient> vyhledejKlienta(String krestniJmeno, String prijmeni){
        ArrayList<Klient> nalezen = new ArrayList();
            for(Klient a : data)
                if(krestniJmeno.equals(a.getKrestniJmeno()) && prijmeni.equals(a.getPrijmeni()))
                    nalezen.add(a);
                        return nalezen;                   
    }
}
