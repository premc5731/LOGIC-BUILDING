
import java.util.*;

public class program_0522
{
    public static void main(String A[]) {
        int iCount = 0;
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String str = sobj.nextLine();

        str = str.trim();

        str = str.replaceAll("\\s+", " ");
        // \\s+ means here \\s -> white space
        // + -> one or more 

        String tokens[] = str.split(" ");
        int iMax = 0;
        iMax = tokens[0].length();
        int index = 0;
        
        for(int i = 1; i < tokens.length; i++)
        {
           if(tokens[i].length() > iMax)
           {
            iMax = tokens[i].length();
            index = i;
           }

        }
        System.out.println("largest word is : "+tokens[index]+" with length : "+tokens[index].length());

    }

}

