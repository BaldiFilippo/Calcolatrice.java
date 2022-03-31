import java.io.BufferedWriter;
import java.io.FileWriter;


public class Calcolatrice {

    protected double a;
    protected double b;
    protected String op;

    BufferedWriter writer;


    public Calcolatrice(double a, String op, double b ) {
        this.a = a;
        this.op = op;
        this.b = b;
    }

    public void somma() {
        try {
            writer = new BufferedWriter(
                    new FileWriter("/Users/baldi/Desktop/Calcolatrice-java/src/risultato.txt", true));
            writer.newLine();
            
            writer.write( String.valueOf(a) + " " + op + " " + String.valueOf(b) + " = " +  String.valueOf(a + b));
            writer.close();
        } catch (Exception e) {
            System.out.println("Errore");
        }
    }

    public void sottrazione() {
        try {
            writer = new BufferedWriter(
                    new FileWriter("/Users/baldi/Desktop/Calcolatrice-java/src/risultato.txt", true));
            writer.newLine();
            
            writer.write(String.valueOf(a) + " " + op + " " + String.valueOf(b) + " = " + String.valueOf(a - b));
            writer.close();
        } catch (Exception e) {
            System.out.println("Errore");
        }
    }

    public void moltiplicazione() {
        try {
            writer = new BufferedWriter(new FileWriter("/Users/baldi/Desktop/Calcolatrice-java/src/risultato.txt" ,true));
            writer.newLine();
            writer.write(String.valueOf(a) + " " + op + " " + String.valueOf(b) + " = " +  String.valueOf(a * b));
            writer.close();
        } catch (Exception e) {
            System.out.println("Errore");
        }
    }

    public void divisione() {
        try {
            writer = new BufferedWriter(
                    new FileWriter("/Users/baldi/Desktop/Calcolatrice-java/src/risultato.txt", true));
            writer.newLine();
            
            writer.write(String.valueOf(a) + " " + op + " " + String.valueOf(b) + " = " +  String.valueOf(a / b));
            writer.close();
        } catch (Exception e) {
            System.out.println("Errore");
        }
    }

}