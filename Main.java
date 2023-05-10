
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
        int ob = 10;
        int summe = 0;
        for (int i = 1; i <= ob ; ++i)
        {
            summe += i;
        }
        
        int mult = 1;
        for (int i = 2 ; i <= ob ; ++i)
        {
            mult *= i;
        }
        
        System.out.println ("Summe: " + summe + " Mult:" + mult);
    }
}
