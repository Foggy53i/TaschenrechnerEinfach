/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taschenrechnereinfach;

import java.util.Scanner;

/**
 *
 * @author Chris Kerber
 * Hier befindet sich die Main Methode und die Klasse TaschenrechnerEinfach
 * In dieser Klasse befindet sich das eigentliche Programm. TaschenrechnerEinfach 
 * deshalb da ich schon ein Taschenrechner mit GUI entworden habe und dieser schon
 * den Namen Taschenrechner besitzt
 */
public class TaschenrechnerEinfach {

    // Instanzvariablen
    private Scanner scan;
    private Berechnung rechnung;
    private double zahl1;
    private double zahl2;
    private String op;
    private String alleOperatoren;
    private boolean gefunden;
    private boolean weiter;
       
    // Kontrutkor
    public TaschenrechnerEinfach() {
        scan = new Scanner(System.in);
        rechnung = new Berechnung();
        zahl1 = 0;
        zahl2 = 0;
        op = "";
        alleOperatoren = "";
        gefunden = false;
        weiter = false;
        }
    
    // Getter Methoden
    public double getZahl1() {
        return zahl1;
    }
    public double getZahl2() {
        return zahl2;
    }
    public String getOperator() {
        return op;
    }
    public boolean getGefunden() {
        return gefunden;
    }
    public boolean getWeiter() {
        return weiter;
    }
    public Scanner getScanner() {
        return scan;
    }
    public Berechnung getRechnung() {
        return rechnung;
    }
    public String getAlleOperatoren() {
        for(Operatoren oper : Operatoren.values()) {
            alleOperatoren += oper + " ";
        }
        return alleOperatoren;
    }
       
    // Setter Methoden
    public void setZahl1(double zahl){
        this.zahl1 = zahl;
    }
    public void setZahl2(double zahl){
        this.zahl2 = zahl;
    }
    public void setOperator(String op){
        if(op.length() < 1 || op.length() > 1) {
                this.op = op.substring(0,1);
        } else {
            this.op = op;
        }
        
    }  
    public void setGefunden(boolean bool){
        this.gefunden = bool;
    }
    public void setWeiter(boolean bool){
        this.weiter = bool;
    }
    
    // Durchsucht das Enum nach Operator
    public void lookForOperatorInEnum() {
         for(Operatoren oper : Operatoren.values()) {
            if(getOperator().equals(oper.toString())) {
                setGefunden(true);
            }
        }
        // Wenn nicht gefunden wird der Operator automatisch auf + gesetzt
        if(!getGefunden()) {
            System.out.println("Sie haben keinen gültigen Operator eingegeben. Der Operator wurde auf + gesetzt!");
            setOperator("+");
        }
    }
    
    // Hier wird die Rechnung berechnet und ausgegeben
    public void berechneDieRechnung() {
        ausgabe(getRechnung().rechnetAus(getZahl1(), getZahl2(), getOperator()));
    }
    
    // Ausabge des Ergebnis -> wenn gerade Zahl Integer, sonst Double
    public void ausgabe(double erg) {
        if(erg % 1 == 0) {
            System.out.println("Das Ergebnis ist: " + (int)erg);
        }
        else {
            System.out.println("Das Ergebnis ist: " + erg);            
        }

    }
       
    
}
