// accept string form user and count no of words
// _ _ _ _India_ _ _is_ _my_ _country_ _ _
// after trim :-> India_ _ _is_ _my_ _country
import java.util.*;

public class No_of_words
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String str = sobj.nextLine();

        str = str.trim();

        char arr[] = str.toCharArray();

        int iCount = 0;
        boolean flag = false;

        for(Character c : arr)
        {
            
            if(c == ' ' && flag == true)
            {
                flag = false;
                iCount++;
            }
            else if(c != ' ')
            {
                flag = true;
            }
            

        }

        // for(i = 0; i < arr.length; i++)
        // {
        //     if(arr[i] == ' ')
        //     {
        //         iCount++;
        //     }
        // }

        System.out.println("Number of words are : "+(iCount + 1));

    }
    
}