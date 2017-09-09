/**************************code for diamond shaped numbers(increament from the middle column)**********************/

import java.util.Scanner;
import java.util.Random;

public class kelas {
    public static void main(String[] args)
    {
        int n, i, j, k, l;
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();

        for(i=1;i<2*n;i++)
        {
            for(j=1;j<=Math.abs(n-i);j++){
                System.out.print("  ");
            }
            if(i <= n){
                for(j=1;j<=i;j++){
                    System.out.printf("%d ", n-j+1);
                }
                for(j=1;j<=i-1;j++){
                    System.out.printf("%d ", n-i+1+j);
                }
            }
            else{
                for(j=1;j<=n-(i%n);j++){
                    System.out.printf("%d ", n-j+1);
                }
                for(j=1;j<=n-(i%n)-1;j++){
                    System.out.printf("%d ", (i%n)+1+j);
                }
            }

            System.out.println();
        }


    }
}

