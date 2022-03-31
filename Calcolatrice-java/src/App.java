import java.io.BufferedWriter;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);

        String calcolo = "";
        String array[] = new String[3]; 

        while (true) {

            System.out.println("inserire il calcolo 👇🏻" );
        calcolo = scan.nextLine();
        array = calcolo.split(" ");

        switch (array[1]) {
            case "+":
                Calcolatrice calcolatrice = new Calcolatrice(Double.parseDouble(array[0]),array[1],
                        Double.parseDouble(array[2]));
                calcolatrice.somma();
                break;
            case "-":
                Calcolatrice calcolatrice1 = new Calcolatrice(Double.parseDouble(array[0]),array[1],
                        Double.parseDouble(array[2]));
                calcolatrice1.sottrazione();
                break;
            case "*":
                Calcolatrice calcolatrice2 = new Calcolatrice(Double.parseDouble(array[0]),array[1],
                        Double.parseDouble(array[2]));
                calcolatrice2.moltiplicazione();
                break;
            case "/":
                Calcolatrice calcolatrice3 = new Calcolatrice(Double.parseDouble(array[0]),array[1],
                        Double.parseDouble(array[2]));
                        calcolatrice3.divisione();
                break;
            case "^":
                CalcolatriceEstesa calcolatrice4 = new CalcolatriceEstesa(Double.parseDouble(array[0]),array[1],
                        Double.parseDouble(array[2]));
                calcolatrice4.potenza();
                break;
            case "log":
                CalcolatriceEstesa calcolatrice5 = new CalcolatriceEstesa(Double.parseDouble(array[0]),array[1],
                        Double.parseDouble(array[2]));
                calcolatrice5.logaritmo();
                break;
            case "sqrt":
                CalcolatriceEstesa calcolatrice6 = new CalcolatriceEstesa(Double.parseDouble(array[0]),array[1],
                        Double.parseDouble(array[2]));
                calcolatrice6.radice();
                break;
            default:
                System.out.println("Errore");
                break;
        }     

            
        }
        
    }
}
