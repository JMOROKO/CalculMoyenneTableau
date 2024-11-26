package com.silstechnologie;

import java.util.Scanner;

public class Main {

    public static void saisie(int[] nombres){
        Scanner sc = new Scanner(System.in);
        System.out.println(nombres.length);
        for(int i = 0; i < nombres.length; i++){
            System.out.println("Veuillez saisir le nombre "+ (i+1) + " : ");
            nombres[i] = sc.nextInt();
        }
    }

    public static double calculerMoyenne(int[] nombres){
        int somme = 0;
        double moyenne;
        for(int nombre : nombres){
            // i++; <=> i = i + 1;
            // somme -= nombre; <=> somme = somme - nombre;
            somme += nombre; // <=> somme = somme + nombre;
        }
        moyenne = somme / nombres.length;
        return moyenne;
    }


    public static void main(String[] args) {
        int[] nombres = new int[4];
        double moyenne;

        saisie(nombres);
        moyenne = calculerMoyenne(nombres);

        System.out.println("La moyenne est : "+moyenne);
    }


}