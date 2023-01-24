/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cz.itnetwork.zaverecnaprace;

/**
 *
 * @author Tomáš Krucký
 */
public class Klient {
    
    private String krestniJmeno;
    private String prijmeni;
    private int vek;
    private int telefoniCislo;
    
    /** Konstruktor třídy Uzivatel s ůdaji o křestním jméně, příjmení, věku a telefonního čísla.
     * @param krestniJmeno
     * @param prijmeni
     * @param vek
     * @param telefoniCislo */
    
    public Klient(String krestniJmeno, String prijmeni, int vek, int telefoniCislo){
        this.krestniJmeno = krestniJmeno; 
        this.prijmeni = prijmeni;
        this.vek = vek;
        this.telefoniCislo = telefoniCislo;
    }           

    /**
     * @return the krestniJmeno
     */
    public String getKrestniJmeno() {
        return krestniJmeno;
    }

    /**
     * @param krestniJmeno the krestniJmeno to set
     */
    public void setKrestniJmeno(String krestniJmeno) {
        this.krestniJmeno = krestniJmeno;
    }

    /**
     * @return the prijmeni
     */
    public String getPrijmeni() {
        return prijmeni;
    }

    /**
     * @param prijmeni the prijmeni to set
     */
    public void setPrijmeni(String prijmeni) {
        this.prijmeni = prijmeni;
    }

    /**
     * @return the vek
     */
    public int getVek() {
        return vek;
    }

    /**
     * @param vek the vek to set
     */
    public void setVek(int vek) {
        this.vek = vek;
    }

    /**
     * @return the telefoniCislo
     */
    public int getTelefoniCislo() {
        return telefoniCislo;
    }

    /**
     * @param telefoniCislo the telefoniCislo to set
     */
    public void setTelefoniCislo(int telefoniCislo) {
        this.telefoniCislo = telefoniCislo;
    }
    
    /** Přepsání objektu uživatele pro výpis do konzole. */
    @Override
    public String toString(){
        return String.format("Pojištěný: %s %s, věk: %d let, telefonní číslo je: %d",
            krestniJmeno ,
            prijmeni,
            vek,
            telefoniCislo);
    }
}
