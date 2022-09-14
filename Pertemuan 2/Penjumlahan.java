import java.util.Scanner;

public class Penjumlahan {
    public static void main(String[] args) {
        int x;
        int y;
        Scanner inp = new Scanner(System.in);
        System.out.print("Masukan nilai x = ");
        x = inp.nextInt();
        System.out.print("Masukan nilai y = ");
        y = inp.nextInt();
        int hasil = x+y;
        System.out.println("Hasil penjumlahan x +y = " + hasil);
        
    }
}