
import java.util.*;

class program_0479
{
    public static void main( String A[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sobj.nextLine();

        int i = 0 , iCount = 0;
        char arr[] = str.toCharArray();
        for(i = 0; i < arr.length; i++)
        {
            if(arr[i] == ' ')
            {
                iCount++;
            }
        }

        System.out.println("Number of white spaces are : "+iCount);
    }
}