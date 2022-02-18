package bola;
import java.util.Scanner;
public class testBola {
    
    static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        double r;
        System.out.print("masukkan jari jari : ");
        r=input.nextDouble();
        
        Bola Bola = new Bola ();
        Bola.setjariJari(r);
        Bola.cetak();
    }
    
}
