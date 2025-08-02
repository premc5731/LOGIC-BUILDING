
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

        char brr[] = new char[iend - istart + 1];

        int j = 0;

        for(i = istart, j = 0 ; i <= iend; i++, j++)
        {
            brr[j] = arr[i];
            
        }

        String newstr = new String(brr);

        return newstr;
    }
}

class program_0487
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