import java.util.Scanner;

public class Percabangan {
    public static void main(String[] args) {
        String nama;
        float nilai;
        String ket;
        Scanner inp = new Scanner(System.in);
        System.out.print("Masukan nama : ");
        nama = inp.nextLine();
        System.out.print("Masukan nilai : ");
        nilai = inp.nextInt();

        if (nilai>=60) {
            ket = "Lulus";
        } else {
            ket = "Tidak Lulus";
        }

        System.out.println(nama + " " + ket);
    }
}