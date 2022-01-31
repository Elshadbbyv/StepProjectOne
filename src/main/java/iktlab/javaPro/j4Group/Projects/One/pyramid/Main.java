package iktlab.javaPro.j4Group.Projects.One.pyramid;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] aa = {"A","B","C","D","E","F","G","H"};
        Scanner scn = new Scanner(System.in);
        int pyramid = scn.nextInt();
        int k = 0;
        for (int i = 1; i <= pyramid; ++i, k = 0) {
            for (int j = 1; j <= pyramid - i; ++j) {
                System.out.print(" ");

            }
            while (k != 2*i-1){
                System.out.print(aa[k]);
                ++k;
            }
            System.out.println();

        }
        for (k=1;k<=n;k++)
        {
            for (l =1 ; l <=k; l++)//döngümüz ile baklava diliminin alt kısımının sol tarafındaki boşlukları belirtiyoruz.
            {
                System.out.print(" ");
            }
            for (m = n; m >k ; m--)//bu döngümüz ile baklava diliminin alt kısımındaki yıldızları ve arasındaki boşlukları belirtiyoruz.
            {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
