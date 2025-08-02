import java.util.*;

public class program_0492 
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a string");
        String str = sobj.nextLine();

        int acount = 0, bcount = 0, ccount = 0;

        char arr[] = str.toCharArray();

        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] == 'a')
            {
                acount++;
            }
            else if(arr[i] == 'b')
            {
                bcount++;
            }
            else if(arr[i] == 'c')
            {
                ccount++;
            }
        }

        System.out.println("frequency of a is : "+acount);
        System.out.println("frequency of b is : "+bcount);
        System.out.println("frequency of c is : "+ccount);
    }
    
}
