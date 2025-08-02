
import java.util.*;

class program_0481
{
    public static void main( String A[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sobj.nextLine();

        int i = 0;
        char arr[] = str.toCharArray();
        for(i = 0; i < arr.length; i++)
        {
            if(arr[i] == ' ')
            {
                arr[i] = '_';
            }
        }
        String newstr = new String(arr);
        System.out.println(newstr);
    }
}