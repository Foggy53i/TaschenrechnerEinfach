/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taschenrechnereinfach;

/**
 *
 * @author Chris Kerber
 * In  der Klasse Enum werden alle Rechenoperatoren aufgelistet
 */
public enum Operatoren {
    
    PLUS("+"), MINUS("-"), MULTIPLIZIERT("*"), DIVIDIERT("/");
    
    private String operator;
    
    private Operatoren(String op) {
        operator = op;
    }
    
    public String toString() {
        return operator;
    }
    
}
