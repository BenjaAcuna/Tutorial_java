package source;

import java.util.Scanner;

public class Main{

public enum Dias {lunes,martes,miercoles}
public static void main(String[] args){

    Scanner scanner = new Scanner(System.in); 

    Dias x;
    x = Dias.lunes;


switch (x){

    case lunes:
        System.out.println("Lunes, hay que trabajar");
        //break; "Permite cortar el flujo switch/case"
    case martes:
        System.out.println("Martes, no hay reunion");
        break;
       
    case miercoles:
        System.out.println("Miercoles, hay reunion");

    default:
    System.out.println("Este es un simulacro");
}

 }
}