package com.mycompany.arreglos;

import java.util.Scanner;

public class Arreglos 
{
    public static void main(String[] args)  
    {
        // Tamaño vector
        int sizeVector = 7;
        
        double cont = 0;
        
        // Variable scanner
        Scanner scanner = new Scanner(System.in);
        
        // Creacion vectores
        int [] vector1 = new int[sizeVector];
        int [] vector2 = new int[sizeVector];
        int [] vector3 = new int[sizeVector];
        
        
        // DATOS PRIMER VECTOR 
        System.out.println("Ingrese los " + sizeVector + " numeros del primer vector");
        // For para añadir los numeros del vector 1
        for (int i = 0; i < sizeVector; i++) 
        {
            System.out.print("Ingrese el numero " + (i+1) + " = ");
            int valores = scanner.nextInt();
            vector1[i] = valores;
        } 
        System.out.println("\nLos valores ingresados del vector 1 son");
        // Muestra los numeros ingresados del vector 1
        for (int i = 0; i < sizeVector; i++) 
        {
            System.out.println(vector1[i]);
        }
        
        
        // DATOS SEGUNDO VECTOR
        System.out.println("\nIngrese los " + sizeVector + " numeros del segundo vector");
        // For para añadir los numeros del vector 2
        for (int i = 0; i < sizeVector; i++) 
        {
            System.out.print("Ingrese el numero " + (i+1) + " = ");
            int valores = scanner.nextInt();
            vector2[i] = valores;
        } 
        System.out.println("\nLos valores ingresados del vector 2 son");
        // Muestra los numeros ingresados del vector 2
        for (int i = 0; i < sizeVector; i++) 
        {
            System.out.println(vector2[i]);
        }
        
        
        // DATOS DEL TERCER VECTOR
        // For para añadir los numeros del vector 3
        for (int i = 0; i < sizeVector; i++) {
            vector3[i] = vector1[i] - vector2[i];
        }
        // Muestra los numeros ingresados del vector 3
        System.out.println("\nLa diferencia de los vectores son: ");
        for (int i = 0; i < sizeVector; i++) {
            System.out.println(vector3[i]);
        }
        
        // PROMEDIOS
        // Vector 1
        for (int i = 0; i < sizeVector; i++) 
        {
            cont += vector1[i];
        }
        System.out.println("\nEl promedio del vector 1 es: " + (cont/sizeVector));
        
        // Vector 2
        cont = 0;
        for (int i = 0; i < sizeVector; i++) 
        {
            cont += vector2[i];
        }
        System.out.println("El promedio del vector 2 es: " + (cont/sizeVector));
        
        // Vector 3
        cont = 0;
        for (int i = 0; i < sizeVector; i++) 
        {
            cont += vector3[i];
        }
        System.out.println("El promedio del vector 3 es: " + (cont/sizeVector));
    }
}
