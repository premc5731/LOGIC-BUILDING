// reverse each word and string also

// Enter a string :
// indai is my country
// reversed string is : yrtnuoc ym si iadni

import java.util.*;

public class program_0529
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

        StringBuilder sb = new StringBuilder(str);
        sb.reverse();

        System.out.println("reversed string is : "+sb);
    }

}

