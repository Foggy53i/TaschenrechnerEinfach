/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taschenrechnereinfach;

/**
 *
 * @author Chris Kerber
 * Die Klasse Berechnung wählt je nach Operator eine andere Rechenoperation und
 * liefert das Ergebnis zurück
 */
public class Berechnung {

    private Rechenverhalten r;
    private double ergebnis;
    
    
    public Berechnung() {;
        ergebnis = 0;
    }
    
    public double rechnetAus(double x, double y, String op) {
         switch(op) {
                case "+":
                    setRechner(new Addition());
                    setErgebnis(r.rechne(x, y));
                    break;
                case "-":
                    setRechner(new Subtraktion());
                    setErgebnis(r.rechne(x, y));
                    break;
                case "*":
                    setRechner(new Multiplikation());
                     setErgebnis(r.rechne(x, y));
                    break;
                case "/":
                    setRechner(new Division());
                     setErgebnis(r.rechne(x, y));
                    break;
                default: 
                    return -1;
                    
        }
         
                return ergebnis;
    }
    
    
    public void setErgebnis(double wert) {
        ergebnis = wert;
    }
    
    public void setRechner(Rechenverhalten r) {
        this.r = r;
    }
    
}
