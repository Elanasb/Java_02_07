package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("Iveskite savo Svori KG ");
        Scanner sc = new Scanner(System.in);
        float kg = sc.nextFloat();
        System.out.println("Iveskite savo ugi ");
        float m = sc.nextFloat();
        System.out.println("Kuno Mases Indeksas: " + kmi(kg, m));
    }

    public static float kmi(float kg, float m) {
        return kg / (m * m);
    }

}
