/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package cz.itnetwork.zaverecnaprace;

/**
 *
 * @author Tomáš Krucký
 */
public class ZaverecnaPrace {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        
        /** Vytvoření instancí ze tříd MujScanner, GrafickeMenu a Evidence. */
        MujScanner scan = new MujScanner();
        GrafickeMenu menu = new GrafickeMenu();
        Evidence evidence = new Evidence();
        
        /** Výpis hlavního menu a následná volba možností aplikace. */
        String volba = "pokracovat";       
        while (!volba.equals("konec")){
        menu.vypisGrafickeMenu();
        
        /** Volba možnosti zadáním číselné hodnoty. */
        int moznost = scan.mujScanCisel();
        switch(moznost){
            case 1 -> {
                System.out.println("Vybral jsi přiřazení nového pojištěnce.\n");                
                evidence.zadaniKlienta();
                System.out.println("Vyřízeno, děkuji za zadání.\n");
                }
            case 2 -> {
                System.out.println("Vybral jsi vypsání všech pojištěných.\n");
                evidence.vypisVsechnyKlienty();
                System.out.println("Vyhledání proběhlo bez problémů.\n");
                }
            case 3 -> {
                System.out.println("Vybral jsi vyhledání pojištěného.\n");
                evidence.vypisKlienta();
                System.out.println("Vyhledání proběhlo bez problémů.\n");
                }
            case 4 -> {
                System.out.println("Vybral jsi ukončení aplikace. Děkuji za použití.\n");
                volba = volba.replace("pokracovat","konec");
                }
            default -> System.out.println("Špatná volba, zadej prosím znovu.\n");
            }
        }
    }
}
