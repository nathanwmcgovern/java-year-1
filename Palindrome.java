public class Palindrome 
{
    public static void main(String[] args) 
    {
        // write a program that check all 6 digit numbers that are divisble by 72 and are palindromes
        int i = 100000;

        while (i <= 999999)
        {   
            if ((i % 10 == (i / 100000) % 10) && ((i / 10) % 10 == (i / 10000) % 10) && ((i / 100) % 10 == (i / 1000) % 10))
            {
                if (i % 72 == 0)
                {
                    System.out.println(i);
                    System.out.println("******");
                }
            }
        








        i++;
        }
    }
}