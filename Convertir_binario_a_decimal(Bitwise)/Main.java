public class Main{
    public static void main(String[] args){
         System.out.println(toInt("111"));
    }

    public static int toInt(String bin){

        int result = 0;
        char binario[] = bin.toCharArray();
        for(int i = 0; i < binario.length; i++,result <<=1 ){
            result |= (binario[i] == '0')?0:1;
        }
        result >>= 1;
        return result;
    }
}