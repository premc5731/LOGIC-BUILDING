// reverse each word and string also

// india my
//o/p -> aidni ym

import java.util.*;

public class program_0532
{
    public static void main(String A[]) 
    {
        int iCount = 0;

        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String str = sobj.nextLine();

        str = str.trim();

        str = str.replaceAll("\\s+", " ");
        // \\s+ means here \\s -> white space
        // + -> one or more 

        String tokens[] = str.split(" ");

        StringBuilder sb = null;

        StringBuilder newstr = new StringBuilder();

        for(String s : tokens)
        {
            sb = new StringBuilder(s);
            // newstr = newstr + sb.reverse();
            // newstr = newstr + " ";
            (newstr.append(sb.reverse())).append(" ");
        }

        String finalstr = new String(newstr);

        System.out.println("updated string is : "+finalstr);


    }

}

