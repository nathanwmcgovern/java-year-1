public class Main 
{
    public static void main(String[] args) 
    {
       // a program that check is a text is palindrome or not
       String text = "Reviver";

       text = text.toLowerCase(); // convert the text to lowercase to make the comparison case-insensitive

       String reverse = "";
       for (int i = text.length() - 1; i >=0; i--)
        {
        reverse += text.charAt(i);
        }
       if (text.equals(reverse)) 
        {
           System.out.println(text + " is a palindrome.");
        } 
       else 
        {
           System.out.println(text + " is not a palindrome.");
        }

    }
}