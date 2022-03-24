import java.util.StringTokenizer;

public class Main {

public static void main(String[] args){
tests();
}
public static void tests()
{
String txt, temp;
txt = "La casa, esta, en la playa.";
StringTokenizer tokens = new StringTokenizer(txt,",");
while(tokens.hasMoreTokens())
{
temp = tokens.nextToken();
System.out.println(temp);
}
}
}