
import java.util.*;

class StringX
{
    public String Replace(String str, char A, char B)
    {
        int i = 0;
        char arr[] = str.toCharArray();
        for(i = 0; i < arr.length; i++)
        {
            if(arr[i] == A)
            {
                arr[i] = B;
            }
        }
        String newstr = new String(arr);

        return newstr;
    }
}

class program_0482
{
    public static void main( String A[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sobj.nextLine();

        StringX strobj = new StringX();

        String iRet = strobj.Replace(str, ' ', '_');

        
        System.out.println(iRet);
    }
}