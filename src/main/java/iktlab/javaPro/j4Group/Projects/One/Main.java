//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package iktlab.javaPro.j4Group.Projects.One;

import jdk.nashorn.internal.objects.Global;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value: ");


        String ac = sc.nextLine();
        ac = ac.toLowerCase();
        char[] charArray = ac.toCharArray();
        Arrays.sort(charArray);
        System.out.println(new String(charArray));


    }






    public Character[] toCharacterArray( String ac ) {
        int a = ac.length();


        int len = ac.length();
        Character[] array = new Character[a];
        for (int i = 0; i < a ; i++) {

            array[i] = ac.charAt(i);
        }

        return array;
    }}
