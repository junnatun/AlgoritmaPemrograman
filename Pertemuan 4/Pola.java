import java.util.Scanner;

public class Pola {
    public static void main(String[]args) {
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan nilai n : ");
        n = scan.nextInt();

        for (int i=1; i<=n; i++){
            if (i<=(n/2)+1){
                for (int j=1; j<=n;j++){
                    if (j<=i ||j>=(n+1)-i){
                        System.out.print("*");
                    }else {
                        System.out.print(" ");
                    }
                }
            }else {
                for (int j=1; j<=n;j++){
                    if (j>=i ||j<=(n+1)-i){
                        System.out.print("*");
                    }else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
        
    }
}
