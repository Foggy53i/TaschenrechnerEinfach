/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taschenrechnereinfach;

/**
 *
 * @author Chris Kerber
 * Die Klasse Subtraktion implementiert das Interface Rechner und ist für das
 * Subtrahieren einer Rechnung zuständig
 */
public class Subtraktion implements Rechenverhalten {

    @Override
    public double rechne(double x, double y) {
        return x - y;
    }
    
}
