import java.math.BigInteger;
/**
 * Klasse Main.
 * 
 * @author Prof. Dr.-Ing. Emre Çakar
 * Labor - Angewandte Informatik
 */

public class Main
{
    public static void main (String args[])
    {
        int obereGrenze = 50;
        int summe = 0;
        for (int i = 1; i <= obereGrenze ; ++i)
        {
            summe += i;
        }
        
        BigInteger mult = new BigInteger("1");
        for (int i = 2 ; i <= obereGrenze ; ++i)
        {
            mult = mult.multiply(BigInteger.valueOf(i));
        }
        
        System.out.println ("Summe: " + summe + " Mult:" + mult);
        //Rebase Update 1
        //Rebase Update 2
    }
}
