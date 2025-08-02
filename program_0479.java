
import java.util.*;

class program_0479
{
    public static void main( String A[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sobj.nextLine();

        int i = 0 , iCount = 0;

        // System.out.println("1 : "+str.charAt(1));
        // System.out.println("0 : "+str.charAt(0));

        for(i = 0; i < str.length(); i++)
        {
            if(str.charAt(i) == ' ')
            {
                iCount++;
            }
        }

        System.out.println("Number of white spaces are : "+iCount);
    }
}