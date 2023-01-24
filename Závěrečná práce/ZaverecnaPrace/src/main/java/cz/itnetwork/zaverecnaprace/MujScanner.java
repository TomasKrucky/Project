/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cz.itnetwork.zaverecnaprace;

import java.util.Scanner;

/**
 *
 * @author Tomáš Krucký
 */

public class MujScanner {
    
    /** Vytvoření instance ze třídy Scanner. */
    private final Scanner vstup = new Scanner(System.in,"UTF-8");
    
    /** Metoda pro zadávání číselných hodnot na vstupu od uživatele s kontrolou.
     * @return  zadané číslo */
    public int mujScanCisel(){
        while(true){
            try{
                return Integer.parseInt(vstup.nextLine().trim());
            }catch(NumberFormatException e){ 
                    System.out.println("Zadej pouze číslice.");
            }        
        }
    }
    
    /** Metoda pro zadávání písmen a znaků na vstupu od uživatele s kontrolou.
     * @return  zadaný řetězec nebo znak */
    public String mujScanRetezce(){
        String retezec = "";
        boolean cyklus = true;
        do{ 
            retezec = vstup.nextLine().trim();
                char[] znaky = retezec.toCharArray();
                    for (char znak : znaky)
                        if(!Character.isAlphabetic(znak)){
                            System.out.printf("Zadej pouze písmena, místo čísla: %s\n",znak );                       
                            cyklus = false;
                        }else{
                            cyklus = true;}

        }while(cyklus == false);       
                return retezec;       
                    
    }  
}
