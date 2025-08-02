// accept string form user and count no of words
import java.util.*;

public class program_0508 
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String str = sobj.nextLine();

        str = str.trim();

        char arr[] = str.toCharArray();

        int iCount = 0, i = 0;

        for(i = 0; i < arr.length; i++)
        {
            if(arr[i] == ' ')
            {
                iCount++;
            }
        }

        System.out.println("Number of words are : "+(iCount + 1));

    }
    
}
