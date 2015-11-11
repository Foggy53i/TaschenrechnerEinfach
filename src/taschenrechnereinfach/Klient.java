/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taschenrechnereinfach;

/**
 *
 * @author Chris Kerber
 */
public class Klient {
    
        // Hier wird das Programm gestartet
    public static void main(String[] args) {
        
        TaschenrechnerEinfach tRechner = new TaschenrechnerEinfach();
        
        
        do {
            
        
            System.out.println("Geben eine Zahl ein:");
            try {
                tRechner.setZahl1(tRechner.getScanner().nextDouble());
            } catch (Exception e) {
                System.out.println("Sie haben keine Zahl eingegeben. Zahl 1 wurde auf 1 gesetzt!");
                tRechner.setZahl1(1);
            }
            

            System.out.println("Geben Sie einen der Operatoren " + tRechner.getAlleOperatoren() + "ein:");
            tRechner.getScanner().nextLine();
            tRechner.setOperator(tRechner.getScanner().nextLine());
            
            // Durchsucht das Enum ob der Operator vorhanden ist
            tRechner.lookForOperatorInEnum();
           

            System.out.println("Geben Sie eine zweite Zahl ein:");
            try {
                tRechner.setZahl2(tRechner.getScanner().nextDouble());
            } catch (Exception e) {
                System.out.println("Sie haben keine Zahl eingegeben. Zahl 2 wurde auf 1 gesetzt!");
                tRechner.setZahl2(1);
            }

            // Die Rechnung wir berechnet
            tRechner.berechneDieRechnung();
            
            System.out.println("Eine neue Rechnung starten - true, Programm beenden - false:");
            
            try {
                tRechner.setWeiter(tRechner.getScanner().nextBoolean());
            } catch (Exception e) {
                System.out.println("Ihre Eingabe ist Fehlerhaft darum wird das Programm beendet");
                System.exit(0);
            }
        
        } while (tRechner.getWeiter());      
        
        System.exit(0);
        
    }
}
