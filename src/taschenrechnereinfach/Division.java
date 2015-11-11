/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taschenrechnereinfach;

/**
 *
 * @author Chris Kerber
 * Die Klasse Division implementiert das Interface Rechner und ist für die
 * Division einer Rechnung zuständig. Auf die Division durch null wurde geachtet
 */
public class Division implements Rechenverhalten {

    @Override
    public double rechne(double x, double y) {
        if(y!=0) {
            return x/y;
        }
        return 0;
    }
    
}
