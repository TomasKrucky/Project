/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cz.itnetwork.zaverecnaprace;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Tomáš Krucký
 */
public class GrafickeMenu {
    
    /** Formátování data a času. */
    public static DateTimeFormatter formatovani = DateTimeFormatter.ofPattern("d'.'M'.'y H:mm");
    
    /** Metoda třídy GrafickeMenu na výpis menu do konzole. */
    public void vypisGrafickeMenu(){
        
        /** Vytvoření instance z třídy LocalDateTime pro výpis dne a času, kdy
        * byla aplikace spuštěna.
        */ 
        LocalDateTime datumCas = LocalDateTime.now();
        System.out.println("------------------------------------------");
        System.out.print("Evidence pojištěných - zjednodušená verze\t\t\t\t\t\t");        
        System.out.print("Aplikace spuštěna dne: ");
        System.out.println(formatovani.format(datumCas));
        System.out.println("------------------------------------------");
        System.out.println("Vyberte akci číslem:\n");
        System.out.println("1. Přiřaď nového pojištěného");
        System.out.println("2. Vypiš všechny pojištěné");
        System.out.println("3. Vyhledat pojištěného");
        System.out.println("4. Ukončení aplikace\n");
    }
}
