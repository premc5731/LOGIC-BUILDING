// cduplicate words

import java.util.*;

public class program_0526
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
        HashMap<String, Integer> hobj = new HashMap<String, Integer>();

        for(String s : tokens)
        {
            if(hobj.containsKey(s))
            {
                hobj.put(s,hobj.get(s)+1);
            }
            else
            {
                hobj.put(s,1);
            }
        }

        StringBuilder result = new StringBuilder();
        for(String s : hobj.keySet())     
        {
            if(hobj.get(s) >= 1)
            {
               result.append(s);
               result.append(" ");
            }

        }

        String newstr = new String(result);

        System.out.println("Updated string is : "+newstr);
    }

}

