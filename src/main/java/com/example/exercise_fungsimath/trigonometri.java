package com.example.exercise_fungsimath;

import java.util.Scanner;

public class trigonometri {
    public static void main(String[] args) {
        System.out.println("********************");
        System.out.println("FUNGSI MATH SEDRHANA");
        System.out.println("********************");
        System.out.println("");
        Scanner input = new Scanner(System.in);

        int a;
        System.out.print("Masukan Angka : ");
        a = input.nextInt();

        int pilihan;

        System.out.println("**** MENU ****");
        System.out.println("1. Sinus ");
        System.out.println("2. Kosinus ");
        System.out.println("3. Tangen ");
        System.out.println("4. Pangkat ");
        System.out.println("5. Akar ");
        System.out.println("");
        System.out.print("Masukan Pilihan (1-5) : ");
        pilihan = input.nextInt();
        System.out.println("");

        switch (pilihan){
            case 1:
                System.out.println("Sinus" +a+ "=" +Math.sin(Math.toRadians(a)));
                break;
            case 2:
                System.out.println("Kosinus" +a+ "=" +Math.cos(Math.toRadians(a)));
                break;
            case 3:
                System.out.println("Tangen" +a+ "=" +Math.tan(Math.toRadians(a)));
                break;
            case 4:
                System.out.println("Masukan Pangkat : ");
                int b = input.nextInt();
                System.out.println(a + "Pangkat" +b+ "=" + Math.pow(a, b));
                break;

            case 5:
                System.out.println("Akar" +a+ "=" +Math.sqrt(a));
                break;

            default:
                System.out.println("Pilihan Salah");
                break;
        }
        System.out.println("***********************");
        System.out.println("");
    }
}
