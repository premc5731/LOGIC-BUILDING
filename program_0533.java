// string is palindrome or not

import java.util.*;

public class program_0533
{
    public static void main(String A[]) 
    {
        int iCount = 0;

        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String str = sobj.nextLine();

        StringBuilder sb = new StringBuilder(str);

        sb.reverse();
        System.out.println("rev : "+sb);

        if(str.equals(new String(sb)))
        {
            System.out.println("String is palindrome");
        }
        else
        {
            System.out.println("String is not a palindrome");
        }
    }

}

