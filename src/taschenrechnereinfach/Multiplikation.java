/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taschenrechnereinfach;

/**
 *
 * @author Chris Kerber
 * Die Klasse Multiplikation implementiert das Interface Rechner und ist für die
 * Multiplikation einer Rechnung zuständig
 */
public class Multiplikation implements Rechenverhalten {

    @Override
    public double rechne(double x, double y) {
        return x * y;
    }
    
}
