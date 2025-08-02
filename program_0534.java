// string is palindrome or not

import java.util.*;

public class program_0534
{
    public static void main(String A[]) 
    {
        int iCount = 0;

        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String str = sobj.nextLine();

        str = str.trim();

        str.replaceAll("\\s+", " ");

        String tokens[] = str.split(" ");
        StringBuilder sb = null;

        for(String s : tokens)
        {
            sb = new StringBuilder(s);

            String revstr = new String(sb.reverse());

            if(s.equals(revstr))
            {
                System.out.println(s);
            }
        }
    }

}

