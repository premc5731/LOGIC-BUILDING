
import java.util.*;

class StringX
{
    public static String Trim(String str)
    {
        int i = 0, istart = 0, iend = 0;
        char arr[] = str.toCharArray();// _ _ _JAY_ _GANESH_ _ _

        if(arr[0] == ' ')
        {   
            while((arr[i] == ' ') && (i < arr.length))
            {
                i++;
            }
        }

        istart = i;

        i = 0;

        i = arr.length - 1;

        if(arr[arr.length - 1] == ' ')
        {   
            while(arr[i] == ' ')
            {
                i--;
            }
        }

        iend = i;
        // String(array_name, starting_index, count)
        return new String(arr, istart, iend - istart + 1);
    }
}

class program_0489
{
    public static void main( String A[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sobj.nextLine();

        String iRet = StringX.Trim(str);
        System.out.println("trimmed string is : "+iRet);
        System.out.println("length string is : "+iRet.length());

    }
}