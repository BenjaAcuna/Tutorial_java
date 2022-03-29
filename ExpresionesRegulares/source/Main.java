package source;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main{

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        String a_evaluar = "hola mundo!! estoy en Chile!!";
        String regex;
        
        while(true){
            regex = scanner.next();

            if(regex.equals("exit"))
               break;
            Pattern patron = Pattern.compile(regex);
            Matcher m = patron.matcher(a_evaluar);

            boolean coincidencia = m.find();
            System.out.println("Hay alguna coincidencia? "+coincidencia);

        }

    }
}