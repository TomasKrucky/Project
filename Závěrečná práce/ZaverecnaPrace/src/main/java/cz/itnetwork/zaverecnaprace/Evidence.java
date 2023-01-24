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
public class Evidence {
    
    /** Vytvoření instance z tříd MujScanner a Databaze. */
    private final MujScanner scan = new MujScanner();
    private final Databaze data = new Databaze();
    
    /** Metoda pro přidání uživatele a následné předání databázi. */
    public void zadaniKlienta(){
        System.out.println("Zadejte křestní jméno:");
        String krestniJmeno = scan.mujScanRetezce();
        System.out.println("Zadejte příjmení:");
        String prijmeni = scan.mujScanRetezce();
        System.out.println("Zadejte věk:");
        int vek = scan.mujScanCisel();
        System.out.println("Zadejte telefonní číslo:");
        int telefoniCislo = scan.mujScanCisel();
        data.pridejKlienta(krestniJmeno, prijmeni, vek, telefoniCislo);
            System.out.println();
    }
    
    /** Metoda pro výpis všech evidovaných v databázi. */
    public void vypisVsechnyKlienty(){
        ArrayList<Klient> vsechny = data.vyhledejVsechnyKlienty();
            for (Klient u : vsechny)
                System.out.println(u);
            System.out.println();
    }
    
    /** Metoda pro výpis konrétní osoby nebo osob podle jména. */
    public void vypisKlienta(){
        System.out.println("Zadejte křestní jméno:");
        String krestniJmeno = scan.mujScanRetezce();
        System.out.println("Zadejte příjmení:");
        String prijmeni = scan.mujScanRetezce();
            System.out.println();        
        ArrayList<Klient> konkretniOsoba = data.vyhledejKlienta(krestniJmeno, prijmeni);
        if(!konkretniOsoba.isEmpty()){
            for (Klient u : konkretniOsoba)    
                System.out.println("Nalezeno: \n" + u);
            System.out.println();
        }else{
            System.out.println("Hledaná osoba nenalezena!\n");
        }
    }    
}
