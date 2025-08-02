
import java.util.*;

class StringX
{
    public static String Trim(String str)
    {
        int i = 0, istart = 0, iend = 0;
        char arr[] = str.toCharArray();// _ _ _JAY_ _GANESH_ _ _

        if(arr[0] == ' ')
        {   
            System.out.println("Inside 1st if");
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
            System.out.println("Inside 2st if");
            while(arr[i] == ' ')
            {
                i--;
            }
        }

        iend = i;

        System.out.println("istart : "+istart);
        System.out.println("iend : "+iend);
        for(i = istart ; i <= iend; i++)
        {
            System.out.print(arr[i]);
        }

        iend = i;
        String newstr = new String(arr);

        return newstr;
    }
}

class program_0486
{
    public static void main( String A[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sobj.nextLine();

        String iRet = StringX.Trim(str);

    }
}