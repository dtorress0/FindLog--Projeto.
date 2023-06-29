/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.backend.app.utils;

public class PrimeiraLetraMaiuscula {
    

       
    public String retornaPrimeiraLetraMaiuscula(String string) {
        if (primeiraLetraEhMaiuscula(string)) {
        } else {
            string = string.substring(0,1).toUpperCase() + string.substring(1) ;
        }
        return string;
    }
    
    public boolean primeiraLetraEhMaiuscula(String string) {
        return Character.isUpperCase(string.indexOf(0));
    }
    
}
