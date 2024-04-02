package GitHub.JavaBasic.Loops;

import java.math.BigInteger;

public class Four {
    public static void main(String[] args){

        BigInteger sum=BigInteger.valueOf(1);
        for (int i=1;i<=200;i++){
            System.out.println(i);
            BigInteger ii = BigInteger.valueOf(i);
            sum = sum.multiply(ii.multiply(ii));
            System.out.println(sum);
        }
    }
}
