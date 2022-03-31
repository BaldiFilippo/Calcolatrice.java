import java.io.BufferedWriter;
import java.io.FileWriter;
    
public class CalcolatriceEstesa extends Calcolatrice {
    double pow;

    BufferedWriter writer;

    public CalcolatriceEstesa(double a, String op, double b) {
        super(a, op, b);
    }

    public void potenza() {
        try {
            writer = new BufferedWriter(
                    new FileWriter("/Users/baldi/Desktop/Calcolatrice-java/src/risultato.txt", true));
            writer.newLine();
            
            writer.write(String.valueOf(a) + " " + op + " " + String.valueOf(b) + " = " + String.valueOf(Math.pow(a, b)));
            writer.close();
        } catch (Exception e) {
            System.out.println("Errore");
        }
    }

    public void logaritmo() {
        try {
            writer = new BufferedWriter(
                    new FileWriter("/Users/baldi/Desktop/Calcolatrice-java/src/risultato.txt", true));
            writer.newLine();
            
            writer.write(String.valueOf(a) + " " + op + " " + String.valueOf(b) + " = " + String.valueOf(Math.log(a)));
            writer.close();
        } catch (Exception e) {
            System.out.println("Errore");
        }
    }

    public void radice() {
        try {
            writer = new BufferedWriter(
                    new FileWriter("/Users/baldi/Desktop/Calcolatrice-java/src/risultato.txt", true));
            writer.newLine();
            
            writer.write(String.valueOf(a) + " " + op + " " + String.valueOf(b) + " = " + String.valueOf(Math.pow(a , 1/b)));
            writer.close();
        } catch (Exception e) {
            System.out.println("Errore");
        }
    }
    
}
