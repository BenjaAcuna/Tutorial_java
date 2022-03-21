package source;

import java.util.Scanner;

public class Main{

public static void main(String[] args){

Scanner scanner = new Scanner(System.in);
int i,j;

for ( i=1, j = 10 ; i < 10 ; i++, j = j*(i/2)) {

System.out.println("i:"+i+" - j:"+j);

  }
 }
}